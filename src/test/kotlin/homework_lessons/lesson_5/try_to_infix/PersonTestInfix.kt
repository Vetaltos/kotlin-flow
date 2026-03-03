package homework_lessons.lesson_5.try_to_infix

import org.junit.jupiter.api.Test

class PersonTestInfix {

    @Test
    fun testValidPersonShouldNoReturnsErrors() {
        val errors = validatePerson(PersonInfix("Гошан", 18))
        errors.shouldNoHaveErrors()
    }

    @Test
    fun testInvalidPersonShouldReturnsErrors() {
        val errors = validatePerson(PersonInfix("", 12))
        errors shouldHaveErrors listOf("Имя не может быть пустым",
                                       "Возраст должен быть не меньше 18 лет")
    }

    @Test
    fun testValidateAgeShouldReturnAgeErrors() {
        val errors = validatePerson(PersonInfix("Павлик", 1))
        errors shouldHaveError "Возраст должен быть не меньше 18 лет"
    }

    @Test
    fun testValidateNameShouldReturnNameErrors() {
        val errors = validatePerson(PersonInfix("", 31))
        errors shouldHaveError "Имя не может быть пустым"
    }

}