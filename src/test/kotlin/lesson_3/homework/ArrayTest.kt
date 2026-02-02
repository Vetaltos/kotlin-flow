package lesson_3.homework

import io.kotest.matchers.collections.shouldBeEmpty
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.equals.shouldBeEqual
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

@Feature("Validation Data")
@Story("Input Array")
@Tags(Tag("smoke"), Tag("inputArray"))
class ArrayTest {

    @Test
    fun testArrayIsEmpty() {
        val array = emptyArray<Int>()

        array.shouldBeEmpty()
    }

    @Test
    fun testArrayIsNotEmpty() {
        val array = arrayOf("1", "2", "3")

        array.shouldNotBeEmpty()
    }

    @Test
    fun testCheckFirstElement() {
        val trafficLight = arrayOf("green", "yellow", "red")

        val expectFirstElement = "red"
        val actualFirstElement = trafficLight.first()

        expectFirstElement.shouldBeEqual(actualFirstElement)
    }
}