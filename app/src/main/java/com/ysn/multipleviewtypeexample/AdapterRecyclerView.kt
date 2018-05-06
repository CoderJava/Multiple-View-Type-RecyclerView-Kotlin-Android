/*
 * Created by YSN Studio on 5/6/18 7:58 PM
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 5/6/18 7:33 PM
 */

/*
 * Created by YSN Studio on 5/6/18 7:58 PM
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 5/6/18 7:33 PM
 */

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ysn.multipleviewtypeexample.R

class AdapterRecyclerView(private val listViewType: List<Int>) : RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>() {

    companion object {
        val ITEM_A = 1
        val ITEM_B = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            ITEM_A -> ViewHolderItemA(inflater.inflate(R.layout.layout_item_a, null))
            else -> ViewHolderItemB(inflater.inflate(R.layout.layout_item_b, null))
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val viewType = listViewType[position]
        when (viewType) {
            ITEM_A -> {
                val viewHolderA = holder as ViewHolderItemA
                viewHolderA.textView.text = "Ini layout item a dengan position $position"
            }
            else -> {
                // Lakukan sesuatu jika kamu ingin mengubah gambar pada ViewHolderItemB
            }
        }
    }

    override fun getItemCount(): Int = listViewType.size

    override fun getItemViewType(position: Int): Int = listViewType[position]

    open inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    inner class ViewHolderItemA(itemView: View) : ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.text_view)
    }

    inner class ViewHolderItemB(itemView: View) : ViewHolder(itemView)

}