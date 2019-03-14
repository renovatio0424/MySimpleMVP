package com.example.mysimplemvp.Base

interface BaseView<T> {

    //set Presenter
    fun setPresenter(presenter: T)

}