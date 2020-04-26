package com.swetajain.flavours

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AndroidFlavor(
    var name:String,
    var version:String,
    var icon:Int
) : Parcelable {}