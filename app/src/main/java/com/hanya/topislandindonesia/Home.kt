package com.hanya.topislandindonesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hanya.topislandinindonesia.IslandData

class Home : AppCompatActivity() {
    private lateinit var rvIsland: RecyclerView
    private var list: ArrayList<Island> = arrayListOf()
    private fun showRecyclerList() {
        rvIsland.layoutManager = LinearLayoutManager(this)
        val listIslandAdapter = ListIslandAdapter(list)
        rvIsland.adapter = listIslandAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvIsland = findViewById(R.id.rv_island)
        rvIsland.setHasFixedSize(true)

        list.addAll(IslandData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
            }

            R.id.action_grid -> {
            }

            R.id.action_cardview -> {
            }
        }
    }
}

