//package com.example.android.testing.espresso.BasicSample;
//
//
//import static androidx.test.espresso.Espresso.onView;
//import static androidx.test.espresso.action.ViewActions.click;
//import static androidx.test.espresso.action.ViewActions.typeText;
//import static androidx.test.espresso.matcher.ViewMatchers.withId;
//import static androidx.test.espresso.matcher.ViewMatchers.withText;
//import static androidx.test.espresso.assertion.ViewAssertions.*;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.Matchers.isEmptyOrNullString;
//
//
//import androidx.test.ext.junit.rules.ActivityScenarioRule;
//import androidx.test.ext.junit.runners.AndroidJUnit4;
//
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//@RunWith(AndroidJUnit4.class)
//public class Instrumented {
//
//    @Rule
//    public ActivityScenarioRule<MainActivity> rule = new ActivityScenarioRule<>(MainActivity.class);
//
//
//    @Test
//    public void test_text_change() {
//        onView(withId(R.id.editTextUserInput))
//                .perform(typeText("123"))
//                .check(matches(withText(containsString("123"))));
//    }
//
//    @Test
//    public void test_text_change_and_activity_opening() {
//        onView(withId(R.id.editTextUserInput)).perform(typeText("123"));
//        onView(withId(R.id.activityChangeTextBtn)).perform(click());
//
//        onView(withId(R.id.show_text_view))
//                .check(matches(withText(containsString("123"))));
//    }
//
//    @Test
//    public void test_text_is_empty(){
//        onView(withId(R.id.changeTextBt)).perform(click());
//        onView(withId(R.id.textToBeChanged)).check(matches(withText(isEmptyOrNullString())));
//    }
//
//    @Test
//    public void test_text_is_empty_after_navigating(){
//        onView(withId(R.id.activityChangeTextBtn)).perform(click());
//        onView(withId(R.id.show_text_view)).check(matches(withText(isEmptyOrNullString())));
//    }
//
//    @Test
//    public void test_text_changes_on_button_click(){
//        String text = "abcdef";
//        onView(withId(R.id.editTextUserInput)).perform(typeText(text));
//        onView(withId(R.id.changeTextBt)).perform(click());
//        onView(withId(R.id.textToBeChanged)).check(matches(withText(containsString(text))));
//    }
//}
//
