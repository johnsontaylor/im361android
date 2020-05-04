package com.tjmediadesign.chopchop

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.jar.Attributes

class MealItem : ConstraintLayout {
        lateinit var textView: TextView
        lateinit var textView2: TextView
        lateinit var textView3: TextView
        lateinit var imageView: ImageView

        constructor(context: Context) : super(context)
        constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    override fun onFinishInflate() {
        super.onFinishInflate()

        textView = findViewById(R.id.textView2)
        textView2 = findViewById(R.id.item_meal)
        textView3 = findViewById(R.id.textView3)
        imageView = findViewById(R.id.imageView)
    }
    
}