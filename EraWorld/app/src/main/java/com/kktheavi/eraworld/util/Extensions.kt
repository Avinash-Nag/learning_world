package com.kktheavi.eraworld.utils

import android.content.Context
import android.view.View
import android.widget.Toast

fun String.toast(context: Context) = Toast.makeText(context, this, Toast.LENGTH_LONG).show()
fun View.click(function: () -> Unit)  =  this.setOnClickListener { function.invoke()}
