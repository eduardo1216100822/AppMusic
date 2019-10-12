package c.miempresa.appmusic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_electro.*

class ElectroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electro)

        btnRegresaElectro.setOnClickListener{
            finish()
        }
    }
}
