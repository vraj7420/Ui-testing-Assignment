package com.example.uitesting

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@LargeTest
@RunWith(AndroidJUnit4ClassRunner::class)
class SignUpActivityTest {
    @Rule
    @JvmField
    var signUpActivityTestRule = ActivityTestRule(SignUpActivity::class.java)

    @Test
    fun viewVisibility() {
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
        val mActivityTestRule = ActivityScenario.launch(SignUpActivity::class.java)
        onView(withId(R.id.tetFullName)).perform(typeText(""))
        onView(withId(R.id.btnActivitySignup)).perform(click())
        onView(withId(R.id.tetFullName)).check(matches(hasErrorText("Please Enter  Name")))


    }

 /*   @Test
    fun dataValidation() {
        val mActivityTestRule = ActivityScenario.launch(SignUpActivity::class.java)
        onView(withId(R.id.tetFullName)).perform(typeText(""))
        onView(withId(R.id.btnActivitySignup)).perform(click())
        onView(withId(R.id.tetFullName)).check(matches(hasErrorText("Please Enter  Name")))

    }*/

}