package lesson_2

import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

@Feature("Calculator Operations")
@Story("Minus Operations Tests")
@Tags(Tag("regression"), Tag("calculator"), Tag("minus"))
class MinusTest {

    @Test
    fun testMinusOfTwoNumbers() {
        val a = 5
        val b = 10

        val expectMinus = 5
        val actualMinus = b - a

        expectMinus shouldBe actualMinus
    }

}