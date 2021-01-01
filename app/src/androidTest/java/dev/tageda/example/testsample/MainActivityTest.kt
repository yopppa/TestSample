package dev.tageda.example.testsample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.GrantPermissionRule
import android.Manifest.permission
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @get:Rule
    val failedWatcher = FailedTestWatcher()

    @get:Rule
    val grantPermissionRule: GrantPermissionRule =
        GrantPermissionRule.grant(permission.WRITE_EXTERNAL_STORAGE)

    @Test
    fun mainActivityTest() {

        onView(ViewMatchers.withId(R.id.label))
            .check(ViewAssertions.matches(ViewMatchers.withText("Hello Espresso!")))

        onView(ViewMatchers.withId(R.id.edit_text))
            .perform(ViewActions.typeText("Hello"), ViewActions.closeSoftKeyboard())

        onView(ViewMatchers.withId(R.id.button))
            .perform(ViewActions.click())

        onView(ViewMatchers.withId(R.id.show_text))
            .check(ViewAssertions.matches(ViewMatchers.withText("Hello")))
    }
}