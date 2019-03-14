package com.example.mysimplemvp.Base

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast

interface IToastShow {
    //show ToastMessage
    @SuppressLint("ShowToast")
    fun showToastMessage(context: Context, massage: String) {
        Toast.makeText(context, massage, Toast.LENGTH_SHORT).show()
    }
}