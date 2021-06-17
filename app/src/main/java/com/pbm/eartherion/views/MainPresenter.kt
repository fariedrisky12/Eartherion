package com.pbm.eartherion.views

interface MainPresenter {
    fun getDataGempaDirasakan()
    fun getDataGempaBerpotensi()
    fun onProses(proses: Boolean)
}