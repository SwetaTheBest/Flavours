package com.swetajain.flavours

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FlavorAdapter(
    var context: Activity,
    var androidFlavor: java.util.ArrayList<AndroidFlavor>
) : ArrayAdapter<AndroidFlavor>(context,0,androidFlavor) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var listItemView: View? = convertView
        if (listItemView == null){
            listItemView= LayoutInflater.from(context).inflate(
                R.layout.list_item,
                parent,
                false
            )
        }

        var currentAndroidFlavor:AndroidFlavor? = getItem(position)
        var nameTextView =listItemView?.findViewById<TextView>(R.id.version_name)
        nameTextView?.text = currentAndroidFlavor?.name
        var numberTextView = listItemView?.findViewById<TextView>(R.id.version_number)
        numberTextView?.text = currentAndroidFlavor?.version
        var iconView = listItemView?.findViewById<ImageView>(R.id.list_item_icon)
        if (currentAndroidFlavor != null) {
            iconView?.setImageResource(currentAndroidFlavor.icon)
        }
        return listItemView!!
    }
}