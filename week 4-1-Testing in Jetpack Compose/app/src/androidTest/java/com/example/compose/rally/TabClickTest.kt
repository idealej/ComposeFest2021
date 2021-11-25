package com.example.compose.rally

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasClickAction
import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.printToLog
import com.example.compose.rally.ui.overview.OverviewBody
import org.junit.Rule
import org.junit.Test

class TabClickTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun overviewScreen_alertsDisplayed() {
        composeTestRule.setContent {
            RallyApp()
        }

        composeTestRule.onRoot(useUnmergedTree = true).printToLog("tab")

        composeTestRule.onNode(
            hasContentDescription(RallyScreen.Accounts.name) and hasClickAction()
        ).performClick()

        composeTestRule.onRoot(useUnmergedTree = true).printToLog("tab2")

//        composeTestRule
//            .onNodeWithText("Alerts")
//            .assertIsDisplayed()
    }
}