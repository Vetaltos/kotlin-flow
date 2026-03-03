package homework_lessons.lesson_5



fun Person.validate(): List<String> {
    val errors = mutableListOf<String>()

    if(name.isNullOrBlank()) {
        errors.add("Имя не может быть пустым")
    }

    if(age < 18) {
        errors.add("Возраст должен быть не меньше 18 лет")
    }

    return errors
}
