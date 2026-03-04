package ru.sechko.frontend.helpers

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selenide.closeWebDriver
import com.codeborne.selenide.Selenide.open
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

open class BaseUiTest {
    @BeforeEach
    fun setUpUi() {
        Configuration.baseUrl = System.getProperty("ui.baseUrl", "http://localhost:4000")
        Configuration.browser = System.getProperty("ui.browser", "chrome")
        Configuration.browserSize = System.getProperty("ui.browserSize", "1920x1080")
        Configuration.headless = System.getProperty("ui.headless", "true").toBoolean()
        Configuration.timeout = System.getProperty("ui.timeoutMs", "10000").toLong()
        open("/")
    }

    @AfterEach
    fun tearDownUi() {
        closeWebDriver()
    }
}