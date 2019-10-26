package br.com.driverapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // definir função de tempo para o splah inicial

        // função

        Handler() // class, que espera uma ação para ser executada
            .postDelayed ({
            // Criando a intent
            startActivity( // chamar uma nova activity
                Intent(this@splashActivity,MainActivity::class.java)
            )
            finish()
        },3000)

    }
}
