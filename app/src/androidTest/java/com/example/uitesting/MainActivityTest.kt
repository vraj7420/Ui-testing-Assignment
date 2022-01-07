package com.example.uitesting


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.toPackage
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@LargeTest
@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @get:Rule
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)
    @get:Rule
    val intentsTestRule = IntentsTestRule(MainActivity::class.java)
   /* @Rule
    @JvmField
    var signUpActivityTestRule = ActivityTestRule(SignUpActivity::class.java)*/


   @Test
    fun activityVisibility() {
       onView(withId(R.id.btnSignup)).perform(click())
       onView(withId(R.id.signUpActivity)).check(matches(isDisplayed()))

   }
    @Test
    fun intentCheck() {
        onView(withId(R.id.btnSignup)).perform(click())
        intended(toPackage("com.example.uitesting.SignUpActivity "))


    }

 }



