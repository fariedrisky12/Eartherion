package com.pbm.eartherion.views

import org.json.JSONObject

interface MainView {
    fun onGetDataJSON(response: JSONObject?)
    fun onNotice(pesanNotice: String?)
    fun onProses(proses: Boolean)
}