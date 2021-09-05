/*電卓のメイン計算処理を記述したテストクラス
* minus_flg...最初にマイナスが押されたかどうかを判定するフラグ
* firstint...計算処理の左の項
* secondint...計算処理の右の項
* allint...計算処理結果
* firstsb...引数で持ってきたStringBuilderクラス
* intsb...引数で持ってきたStringBuilderクラスの数値部分を抜き出したStringBuilder
* opesb...引数で持ってきたStringBuilderクラスの演算子部分を抜き出したStringBuilder
* FIRST_PATTERN...引数で持ってきたStringBuilderクラスの正誤判定を行うための正規表現文字列の前半部分
* SECOND_PATTERN...引数で持ってきたStringBuilderクラスの正誤判定を行うための正規表現文字列の後半部分
* ALL_PATTERN...上二つを結合させた文字列
*
* */

package com.example.denntaku7



import java.lang.StringBuilder

class Compute {

    private var minus_flg = false

    private var firstint = 0
    private var secondint = 0
    private var allint = 0

    private val firstsb = StringBuilder()

    private val intsb = StringBuilder()

    private val opesb = StringBuilder()

    private val FIRST_PATTERN = "[-]?[0-9]+[+|\\-|*|/|=]"

    private val SECOND_PATTERN = "[0-9]+[+|\\-|*|/|=]"

    private val ALL_PATTERN = "[-]?[0-9]+[+|\\-|*|/|=][0-9]+[+|\\-|*|/|=]"

    public fun Main_Test(){

        if(Regex("").matches("-9")){

            System.out.println("match")

        }else{

            System.out.println("else")

        }

    }

    public fun Compute(sb : StringBuilder): StringBuilder{

        firstsb.append(sb)

        if(Regex(ALL_PATTERN).matches(firstsb.toString())){

            maincompute()

        }else{

            //[0-9]+[=][=]などの処理を記述するかも?

        }

        return firstsb

    }

    private fun maincompute(): StringBuilder{

        val it = firstsb.iterator()

        while(it.hasNext()){

            val nextchar = it.nextChar()

            if(firstsb.get(0) == '-' && (!minus_flg)){

                System.out.println("continue")

                minus_flg = true

                continue

            }

            if(next_match(nextchar)){

                intsb.append(nextchar)

            }else{

                opesb.append(nextchar)

                firstint = intsb.toString().toInt()

                intsb.clear()

                break
            }//if end

        }//while end

        while (it.hasNext()){

            val nextchar = it.nextChar()

            if(next_match(nextchar)){

                intsb.append(nextchar)

            }else{

                secondint = intsb.toString().toInt()

                Main_Calculation()

                opesb.clear()

                opesb.append(nextchar)

                firstsb.clear()

                firstsb.append(allint.toString())

                firstsb.append(opesb.toString())

                System.out.println(firstsb.toString())

                all_clear()

                break
            }//if end

        }//while end

        return firstsb

    }//compure end

    private fun Main_Calculation(){

        if(minus_flg){

            firstint = firstint * -1

            minus_flg = false

        }

        when(opesb.toString()){

            "+" -> {

                allint = firstint + secondint

            }

            "-" -> {

                allint = firstint - secondint

            }

            "*" -> {

                allint = firstint * secondint

            }

            "/" -> {

                allint = firstint / secondint

            }

            "=" -> {

                allint = secondint

            }

        }

    }//Calculation end

    private fun next_match(next: Char): Boolean{

        when(next){

            '0' -> {
                return true
            }

            '1' -> {
                return true
            }

            '2' -> {
                return true
            }

            '3' -> {
                return true
            }

            '4' -> {
                return true
            }

            '5' -> {
                return true
            }

            '6' -> {
                return true
            }

            '7' -> {
                return true
            }

            '8' -> {
                return true
            }

            '9' -> {
                return true
            }

        }

        return false

    }//next_match end

    private fun all_clear(){

        allint = 0
        firstint = 0
        intsb.clear()
        minus_flg = false
        opesb.clear()
        secondint = 0

    }

}
//正規表現サンプル
//        val reg = Regex("[-]?[0-9]+[+|\\-|*|/][0-9]+")
//
//        if(reg.matches(firstsb.toString())){
//
//            System.out.println("true")
//
//        }else{
//
//            System.out.println("false")
//
//        }
