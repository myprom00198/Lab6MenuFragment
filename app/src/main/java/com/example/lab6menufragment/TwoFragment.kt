package com.example.lab6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*

class TwoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_two, container, false)
        view.btnClickFragTwo.setOnClickListener() {
            val toast :Toast = Toast.makeText(context, "Click On Fragment Two", Toast.LENGTH_SHORT)
                toast.show()
        }
        return view
    }
}