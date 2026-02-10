package lesson_4

data class User(
    var name: String?,
    var age: Int?,
    var email: String?
) {
    fun checkNulls() {
        if (name == null){
            name = "Неизвестный"
            println("ВНИМАНИЕ, использовалось стандартное значение для: $name")
        }

        if (age == null){
            age = 101
            println("ВНИМАНИЕ, использовалось стандартное значение для: $age")
        }

        if (email == null){
            email = "default@default.default"
            println("ВНИМАНИЕ, использовалось стандартное значение для: $email")
        }
    }
}
