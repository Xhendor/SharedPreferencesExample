package anko.edu.uabc.com.sharedpreferencesexample

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val pref="mis_pref"
    val pref_val="bandera"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        myBttn.setOnClickListener(View.OnClickListener { view: View? ->
            val pref="mis_pref"

            var p:SharedPreferences=getSharedPreferences(pref, Context.MODE_PRIVATE)

            hello.text=p.getString("nombreA","Sin nombre")

            Toast.makeText(applicationContext,p.getBoolean("bandera",true).toString(),Toast.LENGTH_SHORT).show()

        })
    }

    override fun onStart() {
        super.onStart()
        var pref:SharedPreferences=getSharedPreferences(pref, Context.MODE_PRIVATE)

        if(!pref.contains(pref_val)) {

            var editar=pref.edit()
            editar.putBoolean(pref_val, false)
            editar.apply()
            editar.commit()

        }else{
            println("Soy la bandera:"+pref.getBoolean(pref_val,true))

        }

        var editar=pref.edit();

        editar.putString("nombreA","panchoA")
        editar.putString("nombreB","panchoB")
        editar.putString("nombreC","panchoC")

        editar.apply()
        editar.commit()

    }

}
