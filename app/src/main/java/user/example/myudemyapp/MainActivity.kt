package user.example.myudemyapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        var url: String = "http://10.0.2.2:8888/UdemyWeb/greeting.php/"
        // Request a string response from the provided URL.
        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                textView4.text = response
            },
            Response.ErrorListener { textView4.text = "That didn't work!" })
        // Add the request to the RequestQueue.
        queue.add(stringRequest)
    }
    }