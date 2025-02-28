package _1_lamda

class Lambda {
    fun printMap(students: HashMap<Int, String>) {
        println("\n====old way====")
        for((key,value) in students){
            println("$key => $value")
        }
        println("\n====using lambda====")
        students.map {
            println("${it.key} => ${it.value}")
        }
        println("\n====using lambda with(key,value)====")
        students.map {(key,value)->
            println("$key => $value")
        }
    }
}