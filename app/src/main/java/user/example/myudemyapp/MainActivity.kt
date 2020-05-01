package user.example.myudemyapp
import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var url:String="https://10.0.2.2:80/UdemyWeb/greeting.php"
        var rq:RequestQueue= Volley.newRequestQueue(this)
        var sr=StringRequest(Request.Method.GET, url, Response.Listener { response ->
            textView4.text=response
        }, Response.ErrorListener { error ->
            textView4.text=error.message
        })
        rq.add(sr)
    }
    }