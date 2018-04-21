package anko.edu.uabc.com.sharedpreferencesexample

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detalle_dos.*

class DetalleDos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_dos)

        var pref: SharedPreferences =getSharedPreferences("mis_pref", Context.MODE_PRIVATE)

        detalle.text=pref.getString("nombreC","Sin nombre")

        myBttnDetalle.setOnClickListener(View.OnClickListener { view: View? ->

            var intent:Intent = Intent(this,Detalle::class.java)
            startActivity(intent)

        })

    }

}
