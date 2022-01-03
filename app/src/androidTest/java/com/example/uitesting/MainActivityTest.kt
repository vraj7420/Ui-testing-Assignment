package com.example.uitesting


import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)
   /* @Rule
    @JvmField
    var signUpActivityTestRule = ActivityTestRule(SignUpActivity::class.java)*/


   @Test
    fun activityVisibility() {
       onView(withId(R.id.btnSignup)).perform(click())
       onView(withId(R.id.signUpActivity)).check(matches(isDisplayed()))
       onView(withId(R.id.tetFullName)).check(matches(isDisplayed()))
       onView(withId(R.id.tetPhoneNumber)).check(matches(isDisplayed()))
       onView(withId(R.id.tetEmailAddress)).check(matches(isDisplayed()))
       onView(withId(R.id.spCountry)).check(matches(isDisplayed()))
       onView(withId(R.id.tetBirthDate)).check(matches(isDisplayed()))
       onView(withId(R.id.tetAddress)).check(matches(isDisplayed()))
       onView(withId(R.id.tvHeaderRg)).check(matches(isDisplayed()))
       onView(withId(R.id.rgGender)).check(matches(isDisplayed()))
       onView(withId(R.id.tetFullName)).check(matches(isDisplayed()))
       onView(withId(R.id.rbMale)).check(matches(isDisplayed()))
       onView(withId(R.id.rbFemale)).check(matches(isDisplayed()))
       onView(withId(R.id.tvHeaderChb)).check(matches(isDisplayed()))
       onView(withId(R.id.chbReading)).check(matches(isDisplayed()))
       onView(withId(R.id.chbPlaying)).check(matches(isDisplayed()))
       onView(withId(R.id.chbTraveling)).check(matches(isDisplayed()))
       onView(withId(R.id.btnActivitySignup)).check(matches(isDisplayed()))
      onView(withId(R.id.tetFullName)).perform(typeText(""))
      onView(withId(R.id.btnActivitySignup)).perform(click())
      onView(withId(R.id.tetFullName)).check(matches(hasErrorText("Please Enter  Name")))



   }

 }



