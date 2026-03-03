package homework_lessons.lesson_6

import org.junit.jupiter.api.Test
import io.kotest.matchers.shouldBe

class StudentEnumTest {

    @Test
    fun testStudentFromEnumShouldMatch() {
        val data = StudentEnum.DIMOOON

        val studentFromEnum = Student(
            studentName = data.studentName,
            age = data.age,
            group = data.group
        )

        val expectedStudent = Student(
            studentName = "ДИМОООН",
            age = 99,
            group = "QA-777"
        )

        studentFromEnum.studentName shouldBe expectedStudent.studentName
        studentFromEnum.age shouldBe expectedStudent.age
        studentFromEnum.group shouldBe expectedStudent.group
    }

    @Test
    fun testUseStudentFromEnumToStudent()  {
        val studentFromEnum = StudentEnum.OTHER.toStudent()

        val expectedStudent = Student(
            studentName = "Другой Студент",
            age = 21,
            group = "QA-101"
        )

        studentFromEnum.studentName shouldBe expectedStudent.studentName
        studentFromEnum.age shouldBe expectedStudent.age
        studentFromEnum.group shouldBe expectedStudent.group
    }
}