package boudewijns.eerste.test

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val mybutton: Unit =
        findViewById<Button>(R.id.btnOpdracht).setOnClickListener {
        val textView = findViewById<TextView>(R.id.btnOpdracht)
        textView.text = geefBericht("Het werkt...")
    }


    var teller = 0

    var gebruikersnaam = "Wilma Flintstone"

    fun geefBericht(text: String) : String {
        return text
    }

    fun telop(getal1: Int, getal2: Int) : Int{
        return getal1 + getal2
    }

    fun telop(getal1: Float, getal2: Float) : Float{
        return getal1 + getal2
    }
}