package arce.jesus.sesion_189029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bundle= intent.extras
        if (bundle!=null){
            val name= bundle.getString("name")
            val email= bundle.getString("email")
            tv_nameHomeA.text=name
            tv_emailHomeA.text=email
        }

        btn_cerrarSesionHomeA.setOnClickListener {
            finish()
        }

    }
}