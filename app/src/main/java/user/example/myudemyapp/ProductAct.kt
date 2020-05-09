package user.example.myudemyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_product.*

class ProductAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        var list=ArrayList<Product>()
        list.add(Product("Pepsi", 2,R.drawable.pepsi))
        list.add(Product("Pepsi Diet",3,R.drawable.diet))
        list.add(Product("Dew",4,R.drawable.dew))

        var adp=ProductAdapter(this,list)
        rv_pro.layoutManager=LinearLayoutManager(this)
        rv_pro.adapter=adp
    }
}
