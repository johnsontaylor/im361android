package com.tjmediadesign.chopchop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
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
            myPlate.add(Meal("Chicken"))
        }
        imageButton2.setOnClickListener {
            myPlate.add(Meal("Burger"))
        }
        button3.setOnClickListener {
            myPlate.add(Meal("Pizza"))
        }
        button3.setOnClickListener {
            myPlate.add(Meal("sushi"))
        }
    }

}