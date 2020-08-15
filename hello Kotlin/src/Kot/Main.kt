package Kot


fun main() {
    val dog = Dog()
    dog.printA()
}




//fun main() {
//    val list: MyList<String> = MyArrayList.myListOf()
//    for (i in 0..100) {
//        list.add("$i")
//    }
//    for (i in 0..90) {
//        list.removeAt(0)
//    }
//    for (i in 0 until list.size()) {
//        println(list.get(i))
//    }
//}





//fun main() {
//    val list: MyList<Int> = MyArrayList()
//    for (i in 0..100) {
//        list.add(i)
//    }
//    for (i in 0..90) {
//        list.removeAt(0)
//    }
//    for (i in 0 until list.size()) {
//        println(list.get(i))
//    }
//}





//fun main() {
//    val db = Database
//    db.insertData("1")
//    db.insertData("2")
//    val test = Test()
//    test.insertTestData("3")
//    test.insertTestData("4")
//    for (str in db.data) {
//        println(str)
//    }
//}



//fun main() {
////    val calc = Calc()
////    println(calc.square(4))
////    println(Calc.square(4))
////    println(Calc.lengthOfCircle(5f))
//    println(MyRandom.randomInt(5,10))
//    println(MyRandom.randomBoolean())
//    println(MyRandom.randomDayOfWeek())
//}






//fun main() {
//    val sportsman = Sportsman()
////    val sportsman = Sportsman()
////        sportsman.invokeWaterBoy(object : WaterBoy{
////            override fun bringWater() {
////                println("Вода принесена!")
////            }
////        })
//    sportsman.invokeWaterBoy { println("Вода принесена!!!") }
////    view.setOnClickListener(new OnClickListener {
////        override fun onClick() {
////
////        }
////    })
//}





//fun main() {
//
//    travel(object : Transport("Автобус") {
//        override fun drive() {
//            println("Автобус едет...")
//        }
//    })
//}
//
//fun travel(transport: Transport) {
//    transport.drive()




//fun main() {
//    val car = Car()
//    travel(car)
//}
//
//fun travel(transport: Transport) {
//    transport.drive()
//}
//    val car: Transport = Car()
//    val bicycle: Transport = Bicycle()
//    if (car !is Car || car.startEngine())
//    if (car !is Car) return
//    car.name = "Машина2"
//    println(car.name)
//}



//fun main() {
//    val workers = mutableListOf<Worker>()
//    workers.add(Seller("Lonid", 27))
//    workers.add(Seller("Ivan", 30))
//    workers.add(Seller("Sergey", 23))
//    workers.add(Programmer("Max", 34, "JAVA"))
//    workers.add(Programmer("John", 18, "Kotlin"))
//    workers.add(Director("Nick", 50))
//    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
//    for (cleaner in cleaners) {
//        cleaner.clean()
//    for (worker in workers) {
//        worker.work()
//        worker as Cleaner
//        worker.clean()
//        if (worker is Programmer) {
//            println(worker.language)
//        }
//        if (worker is Cleaner) {
//            worker.clean()
//        }
//    }
//}





//
//fun main() {
//    val dog = Dog(3f)
//    println(dog.habitat)
//}
//
//
//


//import Kot.Month.*
//import Kot.Season.*
//
//fun main() {
//    val month = SEPTEMBER
//    val season = when(month) {
//        DECEMBER, JANUARY, FEBRUARY -> WINTER
//        MARCH, APRIL, MAY -> SPRING
//        JUNE, JULY, AUGUST -> SUMMER
//        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
//    }
//    println(month.tempAverage)
//    println(season)
//}




//fun main() {
//    val student1 = Student("Иван", "Иванов", "412344")
//    val student2 = student1.copy(id = "2342")
//    val (name, lastName, id) = student1
////    println(name)
////    println(lastName)
////    println(id)
//    println(student1)
//    println(student2)
//    println(student1.hashCode())
//    println(student2.hashCode())
//    println(student1 == student2)
//    println(student1 === student2)
//}





//fun main() {
//    val programmer = Worker("Ivan", "Programmer", 2016)
//    programmer.printInfo()m
//}
//
//fun Worker.printInfo() {
//    println("Имя: $name Должность: $position Год устройства: $startYear Стаж: $experience")
//}




//fun main() {
//    val cat = Cat("Барсик", 12, 3f)
////    cat.printInfo()
//    println(cat.isOld)
//    cat.age = 10
//    println(cat.isOld)
//
//}
//
//fun Cat.isOld() = age >= 12

//fun main() {
//    val book = Book("Name", 2020, 100)
//    println(book.price)
//    book.year = 2020
//}



/*

fun main() {
    val russia = Country(population = 100_000)
    println(russia.population)
}
*/



//fun main() {
//    val russia = Country("Russia", 145_000_000)
//    println(russia.name)
//    russia.population = 145_000_000
//    println(russia.population)
//}



//fun main() {
//    val user = User()
//    user.age = 10
//    user.age = 18
//    user.age = -9
//    println(user.age)
//}




//fun main() {
//    val user = User()
//    user.name = null
//    user.age = -15
//    println("Имя: ${user.name} Возраст: ${user.age}")
//}



//fun main() {
//    val user = User()
//    user.setName("Andrey")
//    user.setAge(15)
//    println("Имя: ${user.getName()} Возраст: ${user.getAge()}")
//}





//fun main() {
//    val obj = mutableMapOf<String, String>()
//    myWith(obj) {
//        keys
//        values
//    }
////    val list = listOf<Int>()
////    val string = "fsdfs"
////    myWith(string) {
////        println(this.toUpperCase())
////    }
//}
//inline fun<T, R> myWith(obj: T, operation: T.() -> R): R {
//    return obj.operation()
//}
//fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) {
//    list.operation()
//}
//
//fun myWith(string: String, operation: String.() -> Unit) {
//    string.operation()
//}
//fun myWith(obj: Any, operation: Any.() -> Unit) {
//    obj.operation()
//}






//
//fun main() {
////    val name = ""
////    if (!name.isNotEmpty()) {
////        println("fsdfsd")
//    println(28.isPrime())
//    }
////    val age = 5
////    println(age.isPositive())
////
////    if (age.isAgeValid()) {
////        println("Valid")
////    }
////    if (age.isAgeValid()) {
////        println("Valid too")
////    }
////    if (age.isAgeValid()) {
////        println("Valid too 2")
////    }
////}
////
////fun isAgeValid(age: Int) = age in 6..100
//
//fun Int.isAgeValid() = this in 6..100
//
//fun Int.isPositive() = this >= 0
//
//fun Int.isPrime(): Boolean {
//    if (this <= 3) return true
//    for (i in 2 until this) {
//        if (this % i == 0) return false
//    }
//    return true
//}


//fun main() {
//    val list = (0..100).toList()
//    listModify(list) {
//        println(it.sum())
//    }
////    println(list.sum())
//}
//
//inline fun listModify (list: List<Int>, operator: (List<Int>) -> Unit ) {
//    operator(list)
//}



//
//fun main() {
//    val result = modifyString("Hello World!") {it.toUpperCase()}
//    println(result)
//}
//
//fun modifyString(string: String, modify: (String) -> String ) : String {
//    return modify(string)
//}




//val list: MutableList<Int>? = mutableListOf() //  or "null"
//
//fun main() {
//    list?.let {
//        with(it) {
//            for (i in 0 until 1000) {
//                add((Math.random() * 1000).toInt())
//            }
//            val result = filter { it % 2 == 0 }.take(100)
//            for (i in result) {
//                println(i)
//            }
//        }
//    }
//}




//
//fun main() {
//    val list = mutableListOf<Int>()
//    with(list) {
//        for (i in 0 until 1000) {
//            add((Math.random() * 100).toInt())
//        }
//    }
//    println(list.sum())
//    println(list.average())
//    println(list.min())
//    println(list.max())
//    println(list.first())
//    println(list.last())
//}





//var name: String? = "asdasd"
//
//fun main() {
//    name?.let {
//        if (it.length > 5) {
////            println("какая-то строчка")
//            println(it)
//        }
//    }
//}



//var name: String? = null
//
//fun main() {
//    if (name == null) {
//        return
//    }
//    if (name!!.length > 5) {
//        println("какая-то строчка")
//    }
//}


//
//fun main() {
//    val data = mapOf (
//        "Январь" to listOf(200,100,400,300),
//        "Февраль" to listOf(200,200,-190,200),
//        "Март" to listOf(300,180,300,100),
//        "Апрель" to listOf(250,-250,100,300),
//        "Май" to listOf(200,100,400,300),
//        "Июнь" to listOf(200,100,300,300)
//    )
//    printInfo(data)
//}
//
//fun printInfo (data: Map<String, List<Int>>) {
//    val validData = data.filterNot { it.value.any { it < 0 } }
//    val averageWeek = validData.flatMap { it.value }.average()
//    println("Средняя выручка за неделю: $averageWeek")
//
//    val listOfSum = validData.map { it.value.sum() }
//    val max = listOfSum.max()
//    val min = listOfSum.min()
//    val averageMonth = listOfSum.average()
//
//
//    val maxMonths = validData.filter { it.value.sum() == max }.keys
//    val minMonths = validData.filter { it.value.sum() == min }.keys
//
//    println("Средняя выручка в месяц: $averageMonth")
//    println("Максимальная выручка в месяц: $max")
//    print("Была в следующих меяцах: ")
//    for (month in maxMonths) {
//        print("$month ")
//    }
//
//    println("\nМинимальная выручка в месяц: $min")
//    print("Была в следующих меяцах: ")
//    for (month in minMonths) {
//        print("$month ")
//    }
//
//    val invalidData = data.filter { it.value.any { it < 0 } }
//    val errorMonths = invalidData.keys
//    print("\nОшибки произошли в следующих месяцах: ")
//    for (month in errorMonths) {
//        print("$month ")
//    }
//}



//fun main() {
//    val data = mapOf (
//        "file1" to listOf(15,20,45,15,12),
//        "file2" to listOf(100035,-20,45,15,12),
//        "file3" to listOf(15,40,45,15,72)
//    )
//    val average = data.filterNot { it.value.any { it < 0 } }.flatMap { it.value }.average()
//    println(average)
//}



//fun main() {
//    val data = mapOf (
//        "file1" to listOf(15,20,45,15,12),
//        "file2" to listOf(100035,-20,45,15,12),
//        "file3" to listOf(15,40,45,15,72)
//    )
//    val average = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
//    println(average)
//}




//fun main() {
//    val data = mapOf (
//        "file1" to listOf(15,20,45,15,12),
//        "file2" to listOf(35,20,45,15,12),
//        "file3" to listOf(15,40,45,15,72)
//    )
//    val average = data.flatMap { it.value }.average()
//    println(average)
//}



//fun main() {
//    val data = mapOf (
//        "file1" to listOf(15,20,45,15,12),
//        "file2" to listOf(35,20,45,15,12),
//        "file3" to listOf(15,40,45,15,72),
//    )
//}



//fun main() {
//    val data = mutableMapOf<String, List<Int>>()
//    data["file1"] = listOf(15,20,45,15,12)
//    data["file1"] = listOf(35,20,45,15,12)
//    data["file1"] = listOf(15,40,45,15,72)
//}



//fun main() {
//    val revenueByWeek = listOf(
//        listOf(8,6,5,1,2),
//        listOf(4,7,5,8,2),
//        listOf(8,7,5,1,2),
//        listOf(8,6,5,1,2)
//    )
//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for (i in it) {
//            total.add(i)
//        }
//    }
//    val average = total.average()
//    println(average)
//}




//fun main() {
//    val fullNames = mutableListOf<String>()
//    for (i in 0..1000) {
//        fullNames.add("Имя$i Фамилия$i")
//    }
//    val users = fullNames.map { Pair(it.substringBefore(""), it.substringAfter("")) }
//    for (user in users) {
//        println("Имя: ${user.first} Фамиля: ${user.second}")
//    }
//}
//



//fun main() {
//    val fullNames = mutableListOf<String>()
//    for (i in 0..1000) {
//        fullNames.add("Имя$i Фамилия$i")
//    }
//    val names = fullNames.map { it.substringBefore(" ") }
//    val lastNames = fullNames.map { it.substringAfter(" ") }
//    val users = names.zip(lastNames)
//    for (user in users) {
//        println("Имя: ${user.first} Фамиля: ${user.second}")
//    }
//}




//fun main() {
//    val names = mutableListOf<String>()
//    val phones = mutableListOf<Long>()\
//    for (i in 0..1000) {
//        names.add("Имя$i")
//        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
//    }
//    val users = names.zip(phones)
//    for (user in users) {
//        println("Имя: ${user.first} Телефон: ${user.second}")
//    }
//}




//fun main() {
//    val array = generateSequence("Сотрудник №1") {
//        val index = it.substring(11).toInt()
//        "Сотрудник №${index + 1}"
//    }
//    val listOfFirst100 = array.take(100)
//    for (employee in listOfFirst100) {
//        println(employee)
//    }
//}





//fun main() {
//    val array = generateSequence{
//        (Math.random() * 100).toInt()
//    }
//    val evenList = array.take(10)
//    for (i in evenList)
//        println(i)
//}





//fun main() {
//    val array = (0..1000).toList()
//    val employees = array.map { "Employee №$it" }
//    val first30 =  employees.dropLast (950)
//    for (employee in first30)
//        println(employee)
//}





//fun main() {
//    val initArray = mutableListOf<Int>()
//    for (i in 0 until 1000) {
//        initArray.add((Math.random() * 1000).toInt())
//    }
//    val result = initArray.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map {"$it"}
//    for (i in result) {
//        println(i)
//    }
//}




//fun main() {
//    val array = arrayOf(8,10,-6,45,51)
//    val sortedArray = array.sortedDescending()
//    for (i in sortedArray) {
//        println(i)
//    }
//}


//fun main() {
//    val numbers = (0..100).toList()
//    val employees= numbers.map {"Employee №$it"}
//    for (employee in employees) {
//        println(employee)
//    }
//}


//
//fun main() {
//    val numbers = (0..100).toList()
//    val doublesNumbers = numbers.map {number: Int -> number * 2}
//    for (i in doublesNumbers) {
//        println(i)
//    }
//}




//
//
//fun main() {
//    val names = listOf("Иван", "Андрей", "Алексей", "Роман", "Ирина")
//    val namesStartFromA = names.filter { it.startsWith("А")}
//    for (name in namesStartFromA) {
//        println(name)
//    }
//}




//fun main() {
//    val listOfNumbers = mutableListOf<Int>()
//    for (i in 0..99) {
//        listOfNumbers.add(i)
//    }
//    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
//    for (i in listOfEvenNumbers) {
//        println(i)
//    }
//}



//fun main() {
////    Задача 1
//    val parimeter: (Int, Int) -> Int = {a,b -> (a + b) * 2}
//    println(parimeter(10,5))
//}

//fun main() {
////    Задача 2
//    val sayHello: (String) -> Unit = { println("Привет, $it!")}
//    sayHello("Андрей")
//}

//fun main() {
////    Задача 3
//    val sort: (Array<Int>) -> Array<Int> = {
//        for (i in it.size - 2 downTo 0) {
//            for (j in 0..i) {
//                if (it[j] < it[j + 1]) {
//                    val temp = it[j]
//                    it[j] = it[j + 1]
//                    it[j + 1] = temp
//                }
//            }
//        }
//        it
//    }
//    val sortedArray = sort(arrayOf(5,9,-8,6,85,1))
//    for (i in sortedArray) {
//        println(i)
//    }
//}








//fun main() {
////    val square: (Int) -> Int = {it * it}
//    val square: (Int) -> Int = {it * it}
//    println(square(4))
//}






//
//fun main() {
//    val sum: (Int, Int) -> Int = {a, b -> a + b}
//    println(sum(2,10))
//}


//fun main() {
//    println(sum("10", "werfw"))
//}
//
//fun sum(a: String, b: String): Int {
//    val result = try {
//        val numA = a.toInt()
//        val numB = b.toInt()
//        numA + numB
//    } catch (e: Exception) {
//        0
//    }
//    println(result)
//    return result
//}

//fun main() {
//    printInfo(patronymic = "Иванович", lastName = "Иванов", name = "Иван")
//}
//
//fun printInfo(lastName: String = "", name: String = "", patronymic: String = "") {
//    if (lastName.isNotEmpty()) {
//        println("Фамилия: $lastName")
//    }
//    if (name.isNotEmpty()) {
//        println("Имя: $name")
//    }
//    if (!patronymic.isEmpty()) {
//        println("Отчество: $patronymic")
//    }
//}
//fun main() {
//    println(volume(10, 20, 30))
//}
//
//fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c

//    val numbers = arrayOf(5,8,12,-2,6,5)
//    val result = sort(numbers)
//    for (i in result) {
//        println(i)
//    }
//}
//
//fun sort (numbers: MutableList<Int>) : List<Int> {
//    for (i in 1 until numbers.size) {
//        for (J in numbers.size - 1 downTo i) {
//            if (numbers[J] < numbers[J -1]) {
//                val temp = numbers[J]
//                numbers[J] = numbers[J - 1]
//                numbers[J - 1] = temp
//            }
//        }
//    }
//    return numbers
//}
//
//fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())
//fun sort(vararg numbers: Int) = sort(numbers.toMutableList())

//    println(sum(1,2,3,4,5))
//}
//
//fun max(a: Int, b: Int) = if (a > b) a else b
//
//fun crop(str: String) = str.substring(0, Math.min(5,str.length))
//
//fun sum(vararg numbers: Int): Int {
//    var result = 0
//    for (num in numbers) {
//        result += num
//    }
//    return result
//}



//    val array = arrayOfNulls<Int?>(301)
//    for ((index, i) in (300..600).withIndex()) {
//        array[index] = i
//    }
//    for (i in array.size - 1 downTo 0 step 5) {
//        println(array[i])
//    }


//        for (i in 100 downTo 0 ) {
//        println(i)
//    }

//    val array = arrayOfNulls<Int?>(101)
//    for (i in array.indices) {
//        array[i] = i
//    }
//    for (i in array) {
//        println(i)
//    }
//    for (i in 100 downTo 0 step 2) {
//        println(i)
//    }
//}



//fun main() {
//    val time = 16
//    val weatherIsGood = true
//    val result = when {
//        time in 6..22 && weatherIsGood -> {
//            "Гулять"
//        }
//        time in 6..22 && !weatherIsGood -> {
//            "Читатать книгу"
//        }
//        else -> {
//            "спать"
//        }
//    }
//    println(result)
//}


//fun main() {
//    val temp = 80
//    val state = when {
//        temp < 0 -> "Твёрдое"
//        temp < 100 -> "Жидкое"
//        else -> "Газообразное"
//    }
//    println(state)
//}





//fun main() {
//    val temp = 80
//    val state = if (temp < 30) {
//        temp > 30
//        "Твёрдое"
//    } else if (temp < 60) {
//        temp > 60
//        "Жидкое"
//    } else {
//        temp > 100
//        "Газообразное"
//    }
//    println(state)
//}





//fun main() {
//    val temp = 100
//    val watertemp = if (temp < 30) {
//        temp > 30
//        "Холодная"
//    } else if (temp < 60) {
//        temp > 60
//       "Тёплая"
//    } else if (temp <= 100) {
//        temp > 100
//        "Горячая"
//    } else {
//        "Включите питание"
//    }
//    println("Вода: $watertemp")
//}

//fun main() {
//    val temp = 100
//    if (temp < 40) {
//        println("Вода Холодная")
//    } else if (temp < 60) {
//        println("Вода Тёплая")
//    } else if (temp < 110) {
//        println("Вода Горячая")
//    } else {
//        println("Включите питание")
//    }
//}

//fun main() {
//    val temp = 100
//    val quality = when(temp) {
//        in 10..30 -> {
//            "Вода Холодная"
//        }
//        in 30..60 -> {
//            "Вода Тёплая"
//        }
//        in 60..100 -> {
//            "Вода Горячая"
//        }
//        else -> {
//            "Включите питание"
//        }
//    }
//    println(quality)
//}



//fun main() {
//    val indexOfMonth = 3
//    val season = when(indexOfMonth) {
//        12, 1, 2 -> {
//            "Зима"
//        }
//        in 3..5 -> {
//            "Весна"
//        }
//        in 6..8 -> {
//            "Лето"
//        }
//        in 9..11 -> {
//            "Осень"
//        }
//        else -> {
//            "Не найдено!"
//        }
//    }
//    println(season)
//}

//fun main() {
//    val a: Boolean? = true
//    if (a) {
//        println("true")
//    } else {
//        println("false")
//    }
//

//    val a = false
//    if (true) {
//        println("true")
//    } else {
//        println("false")
//    }
//    val a = 5
//    val b = if (a > 5) {
//        "C"
//    } else if ( a > 0) {
//        "D"
//    }
//    println(b)
//
//    var a = 10
//    var b = if (a > 10) {
//        "C"
//    } else {
//        "D"
//    }
//    println(b)


//}


//fun main() {
//    var count = 10000
//    val food = if (count >= 500) {
//        count -= 500
//        println("Do something")
//        "Pizza"
//    } else if (count >= 300) {
//        count -= 300
//        "Шаурма"
//    } else {
//        count -= 30
//        "Доширак"
//    }
//    println("Вы можете позволить себе купить следующий продукт: ${food.length}, у вас осталось $count рублей")
//}


//fun main() {
//    val a = 50
//    if (a < 40) {
//        println("Меньше 40")
//    } else if (a < 60) {
//        println("Больше 40, Меньше 60")
//    } else {
//        println("Больше или равно 60")
//    }
//}



//
//fun main() {
//    val a: String? = null
//    val b: String? = "11233"
//    val c: String? = ""
//    val result = (a?.length?:0) + (b?.length?:0) + (c?.length?:0)
//    println(result)
//}