package lesson_5.try_to_infix

import io.kotest.matchers.collections.shouldBeEmpty
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldContainAll

infix fun List<String>.shouldHaveError(error: String) {
    this.shouldContain(error)
}

infix fun List<String>.shouldHaveErrors(errors: List<String>) {
    this.shouldContainAll(errors)
}

fun List<String>.shouldNoHaveErrors() {
    this.shouldBeEmpty()
}