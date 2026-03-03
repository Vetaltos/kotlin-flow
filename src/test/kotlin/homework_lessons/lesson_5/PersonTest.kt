package homework_lessons.lesson_5

import io.kotest.matchers.collections.shouldBeEmpty
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class PersonTest {

    @Test
    fun testValidPersonShouldNoReturnsErrors() {
        val person = Person(name = "ГЕНА", age = 77)
        val errors = person.validate()

        errors.shouldBeEmpty()
    }

    @Test
    fun testInvalidPersonShouldReturnsErrors() {
        val person = Person(name = "", age = 17)
        val errors = person.validate()

        errors shouldBe listOf(
            "Имя не может быть пустым",
            "Возраст должен быть не меньше 18 лет"
        )
    }

    @Test
    fun testValidateAgeShouldReturnAgeErrors() {
        val person = Person(name = "Бим Бим Бам Бам", age = 17)
        val errors = person.validate()

        errors shouldBe listOf(
            "Возраст должен быть не меньше 18 лет"
        )
    }

    @Test
    fun testValidateNameShouldReturnNameErrors() {
        val person = Person(name = "", age = 27)
        val errors = person.validate()

        errors shouldBe listOf(
            "Имя не может быть пустым"
        )
    }


}