package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated (view: View, savedInstanceState: Bundle?) {

       val coxinhaOk = view.findViewById<TextView>(R.id.texto)
        coxinhaOk.text = "Coca-cola R$ 5,00"

        val imagemCoxinha = view.findViewById<ImageView>(R.id.colocar_imagem)
        imagemCoxinha.setImageResource(R.drawable.coca)


    }



}