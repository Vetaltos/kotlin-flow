package lesson_5.try_to_infix

fun validatePerson(person: PersonInfix): List<String> {
    val errors = mutableListOf<String>()

    if(person.name.isNullOrBlank()) {
        errors.add("Имя не может быть пустым")
    }

    if(person.age < 18) {
        errors.add("Возраст должен быть не меньше 18 лет")
    }

    return errors
}