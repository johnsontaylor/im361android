package com.tjmediadesign.chopchop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class PlateListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_plate_list, container, false)
    }

    class GeneralRecycler<TView: View, TItem>(
        context: Context,
        recyclerView: RecyclerView,
        itemLayout: Int,
        data: List<TItem>,
        private val onViewBind: (view: TView, item: TItem) -> Unit
    ) {
        init {
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = GeneralListAdapter<TView, TItem>(data, this, itemLayout)
        }
        private fun bind(view: View, item: Any?) {
            @Suppress("UNCHECKED_CAST")
            onViewBind.invoke(view as TView, item as TItem)
        }
        private class GeneralListAdapter<TView: View, TItem>(
            private val data: List<TItem>,
            private val recycler: GeneralRecycler<*, *>,
            private val layout: Int
        ) : RecyclerView.Adapter<GeneralListViewHolder<TView>>() {

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneralListViewHolder<TView> {
                @Suppress("UNCHECKED_CAST")
                val view = LayoutInflater.from(parent.context)
                    .inflate(layout, parent, false) as TView

                return GeneralListViewHolder(view)
            }

            override fun getItemCount(): Int {
                return data.size
            }

            override fun onBindViewHolder(holder: GeneralListViewHolder<TView>, position: Int) {
                recycler.bind(holder.view , data[position])
            }
        }
        class GeneralListViewHolder<TView: View>(val view: TView) : RecyclerView.ViewHolder(view)
    }
}