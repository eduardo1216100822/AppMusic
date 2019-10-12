package c.miempresa.appmusic

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        //Manejo del evebto
        btnCumbia.setOnClickListener{
            startActivity(Intent(this, CumbiaActivity::class.java))
        }

        btnElectro.setOnClickListener{
            startActivity(Intent(this, ElectroActivity::class.java))
        }

        btnReg.setOnClickListener{
            startActivity(Intent(this, ReggeaetonActivity::class.java))
        }

        btnSalir.setOnClickListener{
            System.exit(0)
        }
    }
// fin primer override

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_simple, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var msg: String = ""
        //Switch
        when(item.itemId){
            R.id.itmCumbia -> {startActivity(Intent(this, CumbiaActivity::class.java))
            msg = "Cumbia seleccionada"}
            R.id.itmelectro -> {startActivity(Intent(this, ElectroActivity::class.java))
            msg = "Electro seleccionada"}
            R.id.itmreg -> {startActivity(Intent(this, ReggeaetonActivity::class.java))
            msg = "Reggaeton seleccionado"}
            R.id.itmSalir -> {msg = "Adios!"
            System.exit(0)}

        }
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}

