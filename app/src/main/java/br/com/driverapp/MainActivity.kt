package br.com.driverapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ação de click de botão e recuperação de valor
        btnEntrar.setOnClickListener {
           val nome = edtNome.text.toString().trim()
            // depois de capturar o nome escrito preciso fazer condição
            // para verificar se o campo estará vazio
            if (nome.isEmpty())
                {
                Toast.makeText(this@MainActivity, "digite seu nome,",Toast.LENGTH_LONG).show()
                }
            else{
                val intent = Intent(this@MainActivity, tela03Activity::class.java)
                intent.putExtra("nome", nome)
                // chamando a Intent
                startActivity(intent)
            }
        }


    }
}
