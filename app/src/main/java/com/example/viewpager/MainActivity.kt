package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import java.util.ArrayList
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapterOk = myViewPagerAdapter(supportFragmentManager)

        adapterOk.adicionarFragment(FirstFragment(), "Salgados")
        adapterOk.adicionarFragment(SecondFragment(), "Bebidas")
        adapterOk.adicionarFragment(ThirdFragment(), "Doces")

        val OK = findViewById<ViewPager>(R.id.viewPager)
        OK.adapter = adapterOk

        val OK2 = findViewById<com.google.android.material.tabs.TabLayout>(R.id.Tab_layout)
        OK2.setupWithViewPager(OK)

    }

    class myViewPagerAdapter (manager: FragmentManager) : FragmentPagerAdapter (manager) {

        private val listaFragment : MutableList<Fragment> = ArrayList()
        private val listaTitulos : MutableList<String> = ArrayList()


        override fun getItem(position: Int): Fragment {
            return listaFragment[position]
        }

        override fun getCount(): Int {
            return listaFragment.size
        }

        fun adicionarFragment (fragment: Fragment, titulo: String){
            listaFragment.add(fragment)
            listaTitulos.add(titulo)

        }

        override fun getPageTitle(position: Int): CharSequence? {
            return listaTitulos[position]
        }


    }


}
