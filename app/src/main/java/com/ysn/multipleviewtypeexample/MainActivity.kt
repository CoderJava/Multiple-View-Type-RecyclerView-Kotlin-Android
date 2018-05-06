/*
 * Created by YSN Studio on 5/6/18 7:58 PM
 * Copyright (c) 2018. All rights reserved.
 *
 * Last modified 5/6/18 7:41 PM
 */

package com.ysn.multipleviewtypeexample

import AdapterRecyclerView
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val listViewType = mutableListOf(
                AdapterRecyclerView.ITEM_A,
                AdapterRecyclerView.ITEM_B,
                AdapterRecyclerView.ITEM_A,
                AdapterRecyclerView.ITEM_B,
                AdapterRecyclerView.ITEM_B,
                AdapterRecyclerView.ITEM_A,
                AdapterRecyclerView.ITEM_A,
                AdapterRecyclerView.ITEM_B,
                AdapterRecyclerView.ITEM_A
        )
        val adapterRecyclerView = AdapterRecyclerView(listViewType = listViewType)
        recyclerView.adapter = adapterRecyclerView
    }
}
