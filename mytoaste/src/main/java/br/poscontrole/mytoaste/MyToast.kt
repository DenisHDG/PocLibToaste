package br.poscontrole.mytoaste

import android.content.Context
import android.widget.Toast

class MyToast {
    fun myToastTest(context: Context){
        Toast.makeText(context, "testes banana", Toast.LENGTH_LONG).show()
    }
} 