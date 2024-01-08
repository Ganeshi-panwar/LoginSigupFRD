package com.ganeshi.loginsignupfrd

import android.util.Log
import java.io.Serializable

data class UserData(
    val id:String? = null,
    val username:String? = null,
    val password:String? = null,
    val number:Int? = null,
    val address:String? = null,
    val isAdmin:Boolean? = null
) :Serializable
