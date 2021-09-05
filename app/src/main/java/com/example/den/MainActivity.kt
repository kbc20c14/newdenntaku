package com.example.den

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.denntaku7.Compute
import java.lang.Exception
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    val all_sb = StringBuilder();

    val tmp_sb = StringBuilder();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.zero).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.iti).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.ni).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.sann).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.yonn).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.go).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.roku).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.nana).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.hati).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.kyuu).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.tasu).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.hiku).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.kakeru).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.waru).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.wa).setOnClickListener(Click_Action())
        findViewById<Button>(R.id.clear).setOnClickListener(Click_Action_clear())

    }

    private inner class Click_Action : View.OnClickListener {

        override fun onClick(v: View?) {

            if (!all_sb.toString().equals("infinity")) {

                try {

                    when (v) {

                        findViewById<Button>(R.id.zero) -> {

                            if (all_sb.length > 0) {

                                if (all_sb.get(all_sb.length - 1) != '0') {

                                    all_sb.append("0")

                                    findViewById<TextView>(R.id.kekka).setText(all_sb.toString())
                                }
                            }

                        }

                        findViewById<Button>(R.id.iti) -> {

                            all_sb.append("1")

                            findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                        }

                        findViewById<Button>(R.id.ni) -> {

                            all_sb.append("2")

                            findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                        }

                        findViewById<Button>(R.id.sann) -> {

                            all_sb.append("3")

                            findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                        }

                        findViewById<Button>(R.id.yonn) -> {

                            all_sb.append("4")

                            findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                        }

                        findViewById<Button>(R.id.go) -> {

                            all_sb.append("5")

                            findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                        }

                        findViewById<Button>(R.id.roku) -> {

                            all_sb.append("6")

                            findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                        }

                        findViewById<Button>(R.id.nana) -> {

                            all_sb.append("7")

                            findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                        }

                        findViewById<Button>(R.id.hati) -> {

                            all_sb.append("8")

                            findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                        }

                        findViewById<Button>(R.id.kyuu) -> {

                            all_sb.append("9")

                            findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                        }

                        findViewById<Button>(R.id.tasu) -> {

                            if ((all_sb.length == 1) && all_sb.get(0).equals('-')) {

                                all_sb.clear()

                            }

                            if (all_sb.length > 0) {

                                if (all_sbcheck(all_sb)) {

                                    all_sb.append("+")

                                    val compute = Compute()

                                    tmp_sb.append(compute.Compute(all_sb))

                                    all_sb.clear()

                                    all_sb.append(tmp_sb)

                                    tmp_sb.clear()

                                    findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                                } else {

                                    all_sb.delete((all_sb.length - 1), all_sb.length)

                                    all_sb.append("+")

                                    val compute = Compute()

                                    tmp_sb.append(compute.Compute(all_sb))

                                    all_sb.clear()

                                    all_sb.append(tmp_sb)

                                    tmp_sb.clear()

                                    findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                                }

                            }

                        }

                        findViewById<Button>(R.id.hiku) -> {

                            if (all_sb.length > 0) {

                                if (all_sbcheck(all_sb)) {

                                    all_sb.append("-")

                                    val compute = Compute()

                                    tmp_sb.append(compute.Compute(all_sb))

                                    all_sb.clear()

                                    all_sb.append(tmp_sb)

                                    tmp_sb.clear()

                                    findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                                } else {

                                    all_sb.delete((all_sb.length - 1), all_sb.length)

                                    all_sb.append("-")

                                    val compute = Compute()

                                    tmp_sb.append(compute.Compute(all_sb))

                                    all_sb.clear()

                                    all_sb.append(tmp_sb)

                                    tmp_sb.clear()

                                    findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                                }

                            } else {

                                all_sb.append("-")

                            }
                        }

                        findViewById<Button>(R.id.kakeru) -> {

                            if ((all_sb.length == 1) && all_sb.get(0).equals('-')) {

                                all_sb.clear()

                            }

                            if (all_sb.length > 0) {

                                if (all_sbcheck(all_sb)) {

                                    all_sb.append("*")

                                    val compute = Compute()

                                    tmp_sb.append(compute.Compute(all_sb))

                                    all_sb.clear()

                                    all_sb.append(tmp_sb)

                                    tmp_sb.clear()

                                    findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                                } else {

                                    all_sb.delete((all_sb.length - 1), all_sb.length)

                                    all_sb.append("*")

                                    val compute = Compute()

                                    tmp_sb.append(compute.Compute(all_sb))

                                    all_sb.clear()

                                    all_sb.append(tmp_sb)

                                    tmp_sb.clear()

                                    findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                                }

                            }

                        }

                        findViewById<Button>(R.id.waru) -> {

                            if ((all_sb.length == 1) && all_sb.get(0).equals('-')) {

                                all_sb.clear()

                            }

                            if (all_sb.length > 0) {

                                if (all_sbcheck(all_sb)) {

                                    all_sb.append("/")

                                    val compute = Compute()

                                    tmp_sb.append(compute.Compute(all_sb))

                                    all_sb.clear()

                                    all_sb.append(tmp_sb)

                                    tmp_sb.clear()

                                    findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                                } else {

                                    all_sb.delete((all_sb.length - 1), all_sb.length)

                                    all_sb.append("/")

                                    val compute = Compute()

                                    tmp_sb.append(compute.Compute(all_sb))

                                    all_sb.clear()

                                    all_sb.append(tmp_sb)

                                    tmp_sb.clear()

                                    findViewById<TextView>(R.id.kekka).setText(all_sb.toString())

                                }

                            }

                        }

                        findViewById<Button>(R.id.wa) -> {

                            if ((all_sb.length == 1) && all_sb.get(0).equals('-')) {

                                all_sb.clear()

                            }

                            if (all_sb.length > 0) {

                                if (all_sbcheck(all_sb)) {

                                    all_sb.append("=")

                                    val compute = Compute()

                                    tmp_sb.append(compute.Compute(all_sb))

                                    all_sb.clear()

                                    all_sb.append(tmp_sb)

                                    tmp_sb.clear()

                                    tmp_sb.append(all_sb.toString())

                                    tmp_sb.delete(tmp_sb.length - 1, tmp_sb.length)

                                    findViewById<TextView>(R.id.kekka).setText(tmp_sb.toString())

                                    tmp_sb.clear()

                                } else {

                                    all_sb.delete((all_sb.length - 1), all_sb.length)

                                    all_sb.append("=")

                                    val compute = Compute()

                                    tmp_sb.append(compute.Compute(all_sb))

                                    all_sb.clear()

                                    all_sb.append(tmp_sb)

                                    tmp_sb.clear()

                                    tmp_sb.append(all_sb.toString())

                                    tmp_sb.delete(tmp_sb.length - 1, tmp_sb.length)

                                    findViewById<TextView>(R.id.kekka).setText(tmp_sb.toString())

                                    tmp_sb.clear()

                                }

                            }

                        }

                    }
                } catch (e: Exception) {

                    all_sb.clear()

                    all_sb.append("infinity")

                    findViewById<TextView>(R.id.kekka).setText("infinity")

                    Toast.makeText(
                        applicationContext,
                        "これ以上の操作はできません。Cボタンを押してください",
                        Toast.LENGTH_LONG
                    )
                        .show()

                }
            }

        }

        private fun all_sbcheck(sb_all_check: StringBuilder): Boolean {

            when (sb_all_check.get(sb_all_check.length - 1)) {

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
        }
    }

    private inner class Click_Action_clear : View.OnClickListener {
        override fun onClick(v: View?) {

            findViewById<TextView>(R.id.kekka).setText("0")

            all_sb.clear()

        }

    }

}