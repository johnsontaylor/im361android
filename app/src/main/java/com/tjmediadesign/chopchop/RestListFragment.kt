package com.tjmediadesign.chopchop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_rest_list.*

class RestListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rest_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button1 = view.findViewById<ImageButton>(R.id.imageButton1)
        val button2 = view.findViewById<ImageButton>(R.id.imageButton2)
        val button3 = view.findViewById<ImageButton>(R.id.imageButton3)
        val button4 = view.findViewById<ImageButton>(R.id.imageButton4)


        button1.setOnClickListener {
            myPlate.add(Meal("10 Piece Chicken McNuggets", "Sweet and Sour Sauce - $8.00","McDonald's", R.drawable.foodtwo))
            Toast.makeText(context!!, "Added Chicken", Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener {
            myPlate.add(Meal("Whopper & Fries Meal", "Burger Plain - $10.00", "Burger King", R.drawable.foodthree))
            Toast.makeText(context!!, "Added Burger", Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener {
            myPlate.add(Meal("Medium Hand Tossed Pizza", "Pepperoni + Mushrooms - $15.00", "Domino's", R.drawable.foodone))
            Toast.makeText(context!!, "Added Pizza", Toast.LENGTH_SHORT).show()
        }
        button4.setOnClickListener {
            myPlate.add(Meal("California Roll Meal", "4 Person Entree - $30.00", "Shogun", R.drawable.foodfour))
            Toast.makeText(context!!, "Added Sushi", Toast.LENGTH_SHORT).show()
        }
    }

}