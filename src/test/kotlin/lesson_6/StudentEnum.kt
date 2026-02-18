package lesson_6

enum class StudentEnum(val studentName: String, val age: Int, val group: String) {
    DEFAULT("Стандартный Студент", 99, "QA-777"),
    OTHER("Другой Студент", 20, "QA-101"),
    DIMOOON("ДИМОООН", 99, "QA-777");

    fun toStudent(): Student {
        return Student(
            studentName = studentName,
            age = age,
            group = group
        )
    }

}