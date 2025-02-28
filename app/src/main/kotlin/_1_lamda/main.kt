package _1_lamda

fun main(){
    val lambda = Lambda()
    val students = HashMap<Int,String>()
    students[1] = "s1"
    students[2] = "s2"
    students[3] = "s3"
    students[4] = "s4"
    lambda.printMap(students)
}