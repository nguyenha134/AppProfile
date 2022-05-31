package com.example.appprofile.Fragment

import android.graphics.Color
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.appprofile.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textContent : TextView = view.findViewById(R.id.tvContent)

        textContent.movementMethod = LinkMovementMethod.getInstance()
        textContent.setLinkTextColor(Color.BLUE)


        btnNext.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToEducationLevelFragment2()
            findNavController().navigate(action)
        }


    }

}