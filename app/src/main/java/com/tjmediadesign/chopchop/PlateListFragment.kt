package com.tjmediadesign.chopchop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView


val myPlate =  mutableListOf<Meal>()

class PlateListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_plate_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button5 = view.findViewById<Button>(R.id.tip1)
        val button6 = view.findViewById<Button>(R.id.tip2)
        val button7 = view.findViewById<Button>(R.id.tip3)
        val button8 = view.findViewById<Button>(R.id.tip4)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycycler_view)

        GeneralRecycler<MealItem, Meal>(context!!, recyclerView, R.layout.item_meal, myPlate) { view, meal ->
            view.textView.text = meal.store
            view.textView2.text = meal.food
            view.textView3.text = meal.price
            view.imageView.setImageResource(meal.bgImage)
        }
        button5.setOnClickListener {
            Toast.makeText(context!!, "$1 Tip Added", Toast.LENGTH_SHORT).show()
        }
        button6.setOnClickListener {
            Toast.makeText(context!!, "$2 Tip Added", Toast.LENGTH_SHORT).show()
        }
        button7.setOnClickListener {
            Toast.makeText(context!!, "$3 Tip Added", Toast.LENGTH_SHORT).show()
        }
        button8.setOnClickListener {
            Toast.makeText(context!!, "$4 Tip Added", Toast.LENGTH_SHORT).show()
        }

        val payNowButton = view.findViewById<Button>(R.id.paynowbutton)

        payNowButton.setOnClickListener {
            myPlate.clear()
        }
    }
}


