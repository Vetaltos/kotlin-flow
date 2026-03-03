package homework_lessons.lesson_4


import io.kotest.matchers.shouldBe
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Tags
import org.junit.jupiter.api.Test

@Feature("Forms")
@Story("users data")
@Tags(Tag("api"))
class UserTest {

    @Test
    fun testAllParamNulls() {
        val user = User(name = null, age = null, email = null)

        user.name?.let {
            println("Пользователь $it определен по имени")
        } ?: run {
            val default = "Неизвестный"
            user.name = default
            println("Пользователь не определен, присвоено стандартное имя: $default")
        }

        user.age?.let {
            println("Пользователь $it определен по возрасту")
        } ?: run {
            val default = 101
            user.age = default
            println("Пользователь не определен, присвоен стандартный возраст: $default")
        }

        user.email?.let {
            println("Пользователь $it определен по электронной почте")
        } ?: run {
            val default = "default@default.default"
            user.email = default
            println("Пользователь не определен, присвоена стандартная электронная почта: $default")
        }

        user.name.shouldBe("Неизвестный")
        user.age shouldBe(101)
        user.email.shouldBe("default@default.default")
    }

    @Test
    fun testNoNullsParam() {
        val user = User(name = "ГЕНА", age = 77, email = "gena@gmail.com")

        user.name?.let {
            println("Пользователь определен по имени $it")
        } ?: run {
            val default = "Неизвестный"
            user.name = default
            println("Пользователю присвоено стандартное имя: $default")
        }

        user.age?.let {
            println("Пользователь определен по возрасту $it")
        } ?: run {
            val default = 101
            user.age = default
            println("Пользователю присвоен стандартный возраст: $default")
        }

        user.email?.let {
            println("Пользователь определен по электронной почте $it")
        } ?: run {
            val default = "default@default.default"
            user.email = default
            println("Пользователю присвоена стандартная электронная почта: $default")
        }

        user.name.shouldBe("ГЕНА")
        user.age.shouldBe(77)
        user.email.shouldBe("gena@gmail.com")
    }
}