package br.com.danielcastro.meuapp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.danielcastro.minhabilioteca1.demo.Calculadora
import br.com.danielcastro.minhabilioteca1.toast.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customToast = CustomToast(this, layoutInflater)


        if (BuildConfig.REPORT_CRASH) {
            customToast.showToast("crash ligado")
        }
        else {
            customToast.showToast("crash desligado")
            //customToast.sucessoToast( "crash desligado")
        }




        val calculadora = Calculadora()
        calculadora.somar(1,2)
    }
}
