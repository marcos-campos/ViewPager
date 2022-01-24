package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated (view: View, savedInstanceState: Bundle?) {

        val coxinhaOk = view.findViewById<TextView>(R.id.texto)
        coxinhaOk.text = "Coxinha   R$ 4,00"

        val imagemCoxinha = view.findViewById<ImageView>(R.id.colocar_imagem)
        imagemCoxinha.setImageResource(R.drawable.coxinha)

//        val aluno = getAlunos()
//        recycler.layoutManager = LinearLayoutManager(this)
//        recycler.adapter = Adapter(aluno)




    }
//
//    fun getAlunos(): List<Aluno> {
//        val alunosList = mutableListOf<Aluno>()
//
//        for (index in 0..30) {
//            val aluno = Aluno("Aluno $index", "Matricula $index")
//            alunosList.add(aluno)
//        }
//
//        return alunosList.toList()
//    }



}