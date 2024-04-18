package com.example.ch03

val data4: Int by lazy {
    println("in lazy....")
    10
}

fun main() {
    println("in main....")
    println(data4+10)
    println(data4+10)
    println()
    val data1:Array<Int> = Array(3,{0})
    data1.set(2,30)
    println(
        """
    array size : ${data1.size}
    array data : $${data1[0]}, ${data1[1]}, ${data1.get(2)} 
        """
    )//[]나 get 둘 다 인덱스로 받을 수 있다.
}