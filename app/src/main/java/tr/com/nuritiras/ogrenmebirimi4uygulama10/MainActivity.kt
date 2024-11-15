package tr.com.nuritiras.ogrenmebirimi4uygulama10

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    @SuppressLint("SetTextI18n")
    fun onayla(view: View) {
        val textSonuc =findViewById<TextView>(R.id.textView_Sonuc)
        val sayi = findViewById<EditText>(R.id.editTextNumber_Sayi).text.toString().toInt()
        var sayac = 1
        var sonuc:Long = 1
        while (sayac <= sayi) {
            sonuc *= sayac
            sayac++
        }
        textSonuc.text = "Sonuç : $sonuc"
    }
}