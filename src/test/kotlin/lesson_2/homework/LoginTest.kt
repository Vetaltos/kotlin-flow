package lesson_2.homework

import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

@Feature("Registration")
@Story("Start Form")
@Tags(Tag("smoke"), Tag("validation"), Tag("inputLogin"))
class LoginTest {
    @Test
    fun testLogin() {
        val inputLogin = "user"
        val savedLogin = "user"

        inputLogin shouldBe savedLogin
    }
}