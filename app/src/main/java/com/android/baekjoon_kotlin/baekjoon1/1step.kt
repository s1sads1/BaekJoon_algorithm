package com.android.baekjoon_kotlin.baekjoon1

import androidx.core.view.accessibility.AccessibilityViewCommand
import java.util.Scanner
import kotlin.math.pow

/**
1000번
 **/
//fun main(args: Array<String>) {
//
//    val sc: Scanner = Scanner(System.`in`)
//    var a = sc.nextInt()
//    var b = sc.nextInt()
//    println(a + b)
//
//}

/**
1002번
 */
//fun main(args: Array<String>) {
//
//
//    val sc: Scanner = Scanner(System.`in`)
//    var text = sc.nextLine()
//
//    println(text)
//    var x1 : Float = text.split(" ")[0].toFloat()
//    var y1 : Float = text.split(" ")[1].toFloat()
//    var r1 : Float = text.split(" ")[2].toFloat()
//    var x2 : Float = text.split(" ")[3].toFloat()
//    var y2 : Float = text.split(" ")[4].toFloat()
//    var r2 : Float = text.split(" ")[5].toFloat()
//
//    var a = x2 - x1
//    var b = y2 - y1
//    var c = r1 + r2
//    var distance1 = (a.pow(2) + b.pow(2))
//    var distance2 = c.pow(2)
//    if (distance1 > distance2) {
//        println(0)
//    } else if (distance1 == distance2) {
//        println(1)
//    }
//    else if  (distance1 < distance2 ) {
//        println(2)
//    }
//    else {
//        println(-1)
//    }
//
//}

/**
2557번
 */
//fun main(args: Array<String>) {
//    println("Hello World!")
//}

/**
10718번
 */
//fun main(args: Array<String>) {
//    println("강한친구 대한육군")
//    println("강한친구 대한육군")
//}

/**
10171번
 */
//fun main(args: Array<String>) {
////    println("\\     /\\")
////    println(" )   ( ')")
////    println("(   /  )")
////    println(" \\(__)|")
//    System.out.println("\\    /\\");
//    System.out.println(" )  ( ')");
//    System.out.println("(  /  )");
//    System.out.println(" \\(__)|");
//}

/**
10172번
 */
//fun main(args:Array<String>) {
//    System.out.println("|\\_/|")
//    System.out.println("|q p|   /}")
//    System.out.println("( 0 )\"\"\"\\")
//    System.out.println("|\"^\"`    |")
//    System.out.println("||_/=\\\\__|")
//}

/**
1001번
 */
//fun main(args:Array<String>) {
//    var sc : Scanner = Scanner(System.`in`)
//    var A = sc.nextInt()
//    var B = sc.nextInt()
//    print(A-B)
//}

/**
10998번
 */
//fun main(args:Array<String>) {
//    var sc : Scanner = Scanner(System.`in`)
//    var A = sc.nextInt()
//    var B = sc.nextInt()
//    print(A*B)
//}

/**
1008번
 */
//fun main(args:Array<String>) {
//    var sc : Scanner = Scanner(System.`in`)
//    var A = sc.nextDouble()
//    var B = sc.nextDouble()
//    print((A/B).toDouble())
//}

/**
10869번
 */
//fun main(args:Array<String>) {
//    var sc : Scanner = Scanner(System.`in`)
//    var A = sc.nextInt()
//    var B = sc.nextInt()
//
//    System.out.println(A+B)
//    System.out.println(A-B)
//    System.out.println(A*B)
//    System.out.println(A/B)
//    System.out.println(A%B)
//
//}

/**
10926번
 */
//fun main(args:Array<String>) {
//    var sc : Scanner = Scanner(System.`in`)
//    var A = sc.nextLine()
//
//    println("${A}??!")
//
//}

/**
18108번
 */
//fun main(args: Array<String>) {
//    var sc : Scanner = Scanner(System.`in`)
//    var A = sc.nextInt()
//
//    print(A-543)
//
//}

/**
10430번
 */
//fun main(args:Array<String>) {
//    var sc : Scanner = Scanner(System.`in`)
//    var A = sc.nextInt()
//    var B = sc.nextInt()
//    var C = sc.nextInt()
//
//    println((A+B)%C)
//    println(((A%C) + (B%C))%C)
//    println((A*B)%C)
//}

//fun main(args:Array<String>) {
//    val str = "Hello"
//    // this
//    str.run {
//        println("The string's length: $length")
//        //println("The string's length: ${this.length}") // does the same
//    }
//
//    // it
//    str.let {
//        println("The string's length is ${it.length}")
//    }
//}

fun main() {
    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()
    println(numberList)
}