package homework_lessons.lesson_6

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun testStudentEqualDefaultStudent() {
        val student = Student(
            studentName = "Стандартный Студент",
            age = 99,
            group = "QA-777"
        )
        student shouldBe defaultStudent
    }

    @Test
    fun testStudentNotEqualDefaultStudent() {
        val student = Student(
            studentName = "Другой Студент",
            age = 20,
            group = "QA-101"
        )
        student shouldBe defaultStudent
    }

    @Test
    fun testAttributesOfStudentEqualDefaultStudent() {
        val student = Student(
            studentName = "ДИМОООН",
            age = 99,
            group = "QA-777"
        )
        student.studentName shouldBe defaultStudent.studentName
        student.age shouldBe defaultStudent.age
        student.group shouldBe defaultStudent.group
    }
}