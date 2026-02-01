package lesson_2.homework

import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test


@Feature("Registration")
@Story("Start Form")
@Tags(Tag("smoke"), Tag("validation"), Tag("inputPassword"))
class PasswordTest {
    @Test
    fun passwordTest() {
        val inputPassword = "qwerty12345"
        val savedPassword = "qwerty54321"

        inputPassword shouldBe savedPassword
    }
}