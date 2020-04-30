package com.tjmediadesign.chopchop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        super.onViewCreated(savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycycler_view)

        GeneralRecycler<MealItem, Meal>(context[], recyclerView R . layout . item_meal, myPlate)
        view.textView.text = meal.name
    }

    }

}

