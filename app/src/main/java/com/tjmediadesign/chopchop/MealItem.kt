package com.tjmediadesign.chopchop

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.jar.Attributes

class MealItem : ConstraintLayout {
        lateinit var textView: TextView

        constructor(context: Context) : super(context)
        constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    override fun onFinishInflate() {
        super.onFinishInflate()
        textView = findViewById(R.id.meal_text_view)
    }
    
}