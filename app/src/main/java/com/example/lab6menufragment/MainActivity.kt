package com.example.lab6menufragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState==null) {
            supportFragmentManager.beginTransaction().add(
                R.id.frameLayout,
                OneFragment()
            ).commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val manager :FragmentManager = supportFragmentManager
        val transactino :FragmentTransaction = manager.beginTransaction()
        when (item?.itemId) {
            R.id.menu1 -> {
                transactino.replace(R.id.frameLayout, OneFragment())
                transactino.addToBackStack(null)
                transactino.commit()
                return true }
            R.id.menu2 -> {
                transactino.replace(R.id.frameLayout, TwoFragment())
                transactino.addToBackStack(null)
                transactino.commit()
                return true }
            R.id.menu3 -> {
                transactino.replace(R.id.frameLayout,ThreeFragment())
                transactino.addToBackStack(null)
                transactino.commit()
                return true}
            else -> return super.onOptionsItemSelected(item)
        }
    }
}