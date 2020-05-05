package com.tjmediadesign.chopchop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment

class AccountListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_account_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button9 = view.findViewById<ImageButton>(R.id.menuitemone)
        val button10 = view.findViewById<ImageButton>(R.id.menuitemtwo)
        val button11 = view.findViewById<ImageButton>(R.id.menuitemthree)
        val button12 = view.findViewById<ImageButton>(R.id.menuitemfour)

        button9.setOnClickListener {
            Toast.makeText(
                context!!,
                "Starting Thursday, 10 Piece Chicken McNuggets + 1 Sauce, $6.00",
                Toast.LENGTH_SHORT
            ).show()
        }
        button10.setOnClickListener {
            Toast.makeText(
                context!!,
                "$8.00 OFF Coupon, CODE: PleaseStayInside",
                Toast.LENGTH_SHORT
            ).show()
        }
        button11.setOnClickListener {
            Toast.makeText(
                context!!,
                "Buy one get one meal free - Starting May 16th",
                Toast.LENGTH_SHORT
            ).show()
        }
        button12.setOnClickListener {
            Toast.makeText(
                context!!,
                "Donate $5.00 - Get a Large Fry Free + Fountain Drink",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}