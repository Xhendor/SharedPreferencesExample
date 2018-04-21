package anko.edu.uabc.com.sharedpreferencesexample

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalle.*

class Detalle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)
        var p: SharedPreferences =getSharedPreferences("mis_pref", Context.MODE_PRIVATE)

        detalle.text=p.getString("nombreA","Sin nombre")


    }
}
