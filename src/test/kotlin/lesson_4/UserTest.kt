package lesson_4


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

        user.checkNulls()

        user.name.shouldBe("Неизвестный")
        user.age shouldBe(101)
        user.email.shouldBe("default@default.default")
    }

    @Test
    fun testNoNullsParam() {
        val user = User(name = "ГЕНА", age = 77, email = "gena@gmail.com")

        user.checkNulls()

        user.name.shouldBe("ГЕНА")
        user.age.shouldBe(77)
        user.email.shouldBe("gena@gmail.com")
    }
}