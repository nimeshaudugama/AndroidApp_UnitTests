package com.example.android.testing.espresso.BasicSample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.isEmptyOrNullString
import org.junit.After

import org.junit.Rule
import org.junit.Test
import org.junit.matchers.JUnitMatchers.containsString
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class InstrumentedTest {

    @get:Rule
    var rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun changeTest_validString() {
        onView(withId(R.id.editTextUserInput))
            .perform(typeText(TEST_STRING))
            .check(matches(withText(containsString(TEST_STRING))))
    }
    @After
    fun tearDown() {
        try {
            Thread.sleep(6000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }

    @Test
    fun changeTextAndActivityOpen_validString() {
        onView(withId(R.id.editTextUserInput)).perform(typeText(TEST_STRING))
        onView(withId(R.id.activityChangeTextBtn)).perform(click())

        onView(withId(R.id.show_text_view))
            .check(matches(withText(containsString(TEST_STRING))))
    }

    @Test
    fun changeTextNull_invalidText() {
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText(isEmptyOrNullString())))
    }

    @Test
    fun changeTextAndActivityOpen_nullValue() {
        onView(withId(R.id.activityChangeTextBtn)).perform(click())
        onView(withId(R.id.show_text_view)).check(matches(withText(isEmptyOrNullString())))
    }

    @Test
    fun changeText_validText() {
        onView(withId(R.id.editTextUserInput))
            .perform(typeText(TEST_TEXT))
            .check(matches(withText(containsString(TEST_TEXT))))
    }
    @Test
    fun changeTextAndActivityOpen_validText() {
        onView(withId(R.id.editTextUserInput)).perform(typeText(TEST_TEXT))
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText(containsString(TEST_TEXT))))
    }

    companion object {
        val TEST_STRING = "123"
        val TEST_TEXT = "abcdef"

    }
}
