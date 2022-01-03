package com.example.a2_kotlin

class Test {

    fun start() {
        var result = doSomething()
        if (result is Unit) {

        } else {

        }

        val intValue = 10
        var value = 20
        val byteValue = intValue.toByte()


        val arrayList = ArrayList<String>()
        val arrayList2 = emptyList<String>()
        val arrayList3 = arrayListOf(0, 1, 2, 3)
        val mutableArrayList = mutableListOf<String>()
        mutableArrayList[0] = "hello"
        val valueList = arrayList[0]
    }
    fun doSomething() {

    }

    fun doSomething(a: Int) : String {
        return ""
    }
}