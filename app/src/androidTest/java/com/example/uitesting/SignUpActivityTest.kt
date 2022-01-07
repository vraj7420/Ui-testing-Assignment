package com.example.uitesting

import android.content.Context
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.RootMatchers
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
    @get:Rule
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


    }

    @Test
    fun dataValidationName() {
        val mActivityTestRule = ActivityScenario.launch(SignUpActivity::class.java)
        val targetContext: Context = ApplicationProvider.getApplicationContext()
        val test: String = targetContext.resources.getString(R.string.error_full_name)
        onView(withId(R.id.tetFullName)).perform(typeText(""))
        onView(withId(R.id.tetPhoneNumber)).perform(typeText("9624078932"))
        onView(withId(R.id.tetEmailAddress)).perform(typeText("vbrahmbhatt7420@gmail.com"))
        onView(withId(R.id.tetAddress)).perform(typeText("barot faliyu"))
        onView(withId(R.id.tetBirthDate)).perform(typeText("12/12/2021"))
        onView(withId(R.id.btnActivitySignup)).perform(click())
        onView(withId(R.id.tetFullName)).check(matches(hasErrorText(test)))

    }

    @Test
    fun dataValidationPhoneNumber() {
        val mActivityTestRule = ActivityScenario.launch(SignUpActivity::class.java)
        val targetContext: Context = ApplicationProvider.getApplicationContext()
        val test: String = targetContext.resources.getString(R.string.error_phone_number_is_empty)
        onView(withId(R.id.tetFullName)).perform(typeText("Vraj"))
        onView(withId(R.id.tetPhoneNumber)).perform(typeText(""))
        onView(withId(R.id.tetEmailAddress)).perform(typeText("vbrahmbhatt7420@gmail.com"))
        onView(withId(R.id.tetAddress)).perform(typeText("barot faliyu"))
        onView(withId(R.id.tetBirthDate)).perform(typeText("12/12/2021"))
        onView(withId(R.id.btnActivitySignup)).perform(click())
        onView(withId(R.id.tetPhoneNumber)).check(matches(hasErrorText(test)))

    }

    @Test
    fun dataValidationEmail() {
        val mActivityTestRule = ActivityScenario.launch(SignUpActivity::class.java)
        val targetContext: Context = ApplicationProvider.getApplicationContext()
        val test: String = targetContext.resources.getString(R.string.error_email_is_empty)
        onView(withId(R.id.tetFullName)).perform(typeText("Vraj"))
        onView(withId(R.id.tetPhoneNumber)).perform(typeText("9624078932"))
        onView(withId(R.id.tetEmailAddress)).perform(typeText(""))
        onView(withId(R.id.tetAddress)).perform(typeText("barot faliyu"))
        onView(withId(R.id.tetBirthDate)).perform(typeText("12/12/2021"))
        onView(withId(R.id.btnActivitySignup)).perform(click())
        onView(withId(R.id.tetEmailAddress)).check(matches(hasErrorText(test)))

    }

    @Test
    fun dataValidationAddress() {
        val mActivityTestRule = ActivityScenario.launch(SignUpActivity::class.java)
        val targetContext: Context = ApplicationProvider.getApplicationContext()
        val test: String = targetContext.resources.getString(R.string.error_address)
        onView(withId(R.id.tetFullName)).perform(typeText("Vraj"))
        onView(withId(R.id.tetPhoneNumber)).perform(typeText("9624078932"))
        onView(withId(R.id.tetEmailAddress)).perform(typeText("vbrahmbhatt74202gmail.com"))
        onView(withId(R.id.tetAddress)).perform(typeText(""))
        onView(withId(R.id.tetBirthDate)).perform(typeText("12/12/2021"))
        onView(withId(R.id.btnActivitySignup)).perform(click())
        onView(withId(R.id.tetEmailAddress)).check(matches(hasErrorText(test)))

    }
    @Test
    fun toastVisibility() {
        val mActivityTestRule = ActivityScenario.launch(SignUpActivity::class.java)
        val targetContext: Context = ApplicationProvider.getApplicationContext()
        val test: String = targetContext.resources.getString(R.string.error_address)
        onView(withId(R.id.tetFullName)).perform(typeText("Vraj"))
        onView(withId(R.id.tetPhoneNumber)).perform(typeText("9624078932"))
        onView(withId(R.id.tetEmailAddress)).perform(typeText("vbrahmbhatt74202gmail.com"))
        onView(withId(R.id.tetAddress)).perform(typeText(""))
        onView(withId(R.id.tetBirthDate)).perform(typeText("12/12/2021"))
        onView(withId(R.id.btnActivitySignup)).perform(click())
        onView(withId(R.id.tetEmailAddress)).check(matches(hasErrorText(test)))
        onView(withText("Sign up Successfully")).inRoot(RootMatchers.isPlatformPopup()).check(matches(isDisplayed()))
    }
    @Test
    fun textViewSetText() {
        val mActivityTestRule = ActivityScenario.launch(SignUpActivity::class.java)
        val targetContext: Context = ApplicationProvider.getApplicationContext()
        val test: String = targetContext.resources.getString(R.string.error_address)
        onView(withId(R.id.tetFullName)).perform(typeText("Vraj"))
        onView(withId(R.id.tetPhoneNumber)).perform(typeText("9624078932"))
        onView(withId(R.id.tetEmailAddress)).perform(typeText("vbrahmbhatt74202gmail.com"))
        onView(withId(R.id.tetAddress)).perform(typeText(""))
        onView(withId(R.id.tetBirthDate)).perform(typeText("12/12/2021"))
        onView(withId(R.id.btnActivitySignup)).perform(click())
        onView(withId(R.id.tetEmailAddress)).check(matches(hasErrorText(test)))
        onView(withId(R.id.tvSignUpSuccessfully)).check(matches(withText("Sign up Successfully")))
    }


}