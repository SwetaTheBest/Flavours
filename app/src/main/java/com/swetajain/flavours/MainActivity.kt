package com.swetajain.flavours


import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val androidFlavor = ArrayList<AndroidFlavor>()
        androidFlavor.add(AndroidFlavor("Donut", "1.6", R.drawable.donut))
        androidFlavor.add(AndroidFlavor("Eclair", "2.0-2.1", R.drawable.eclair))
        androidFlavor.add(AndroidFlavor("Froyo", "2.2-2.2.3", R.drawable.froyo))
        androidFlavor.add(AndroidFlavor("GingerBread", "2.3-2.3.7", R.drawable.gingerbread))
        androidFlavor.add(AndroidFlavor("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb))
        androidFlavor.add(AndroidFlavor("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream))
        androidFlavor.add(AndroidFlavor("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean))
        androidFlavor.add(AndroidFlavor("KitKat", "4.4-4.4.4", R.drawable.kitkat))
        androidFlavor.add(AndroidFlavor("Lollipop", "5.0-5.1.1", R.drawable.lollipop))
        androidFlavor.add(AndroidFlavor("Marshmallow", "6.0-6.0.1", R.drawable.marshmallow))
        val flavorAdapter = FlavorAdapter(this,androidFlavor)
        val listView = findViewById<ListView>(R.id.list_view_flavor)
        listView.adapter = flavorAdapter

    }
}
