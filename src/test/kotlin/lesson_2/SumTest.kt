package lesson_2

import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

@Feature("Calculator Operations")
@Story("Sum Operations Tests")
@Tags(Tag("regression"), Tag("calculator"), Tag("sum"))
class SumTest {

    @Test
    fun testSumOfTwoNumbers() {
        val a = 5
        val b = 10

        val expectSum = 15
        val actualSum = a + b

        expectSum shouldBe actualSum
    }

}