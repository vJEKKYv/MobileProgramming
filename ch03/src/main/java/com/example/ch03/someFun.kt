package com.example.ch03



//코틀린의 모든 변수는 객체로 저장됨.
fun someFun(){
    var data1: Int = 10
    var data2:Int?=null

    data1=data1+10
    data1=data1.plus(10)
}
fun some():Unit{
    println("Unit은 반환이 없다. ")
}
//?는 null허용 한다는 뜻.
fun some1(): Nothing?{
    return null
   //return Exception()
}
fun some1(data1:Int, data2: Int):Int{
    return data1+ data2
}
