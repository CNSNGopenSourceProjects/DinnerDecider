package br.com.conseng.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Pizza Hut")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFoodIndex = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFoodIndex]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodEditTxt.text.toString()
            if (newFood.length > 0) {
                foodList.add(newFood)
                addFoodEditTxt.text.clear()
                println(foodList)
            }
        }
    }
}
