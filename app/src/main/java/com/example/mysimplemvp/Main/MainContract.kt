package com.example.mysimplemvp.Main

import com.example.mysimplemvp.Base.BasePresenter
import com.example.mysimplemvp.Base.BaseView
import com.example.mysimplemvp.Base.IToastShow

class MainContract {

    interface Presenter : BasePresenter {
        fun loadSecretData(): String
    }

    interface View : BaseView<Presenter>, IToastShow {

        //move to next page
        fun moveToNextActivity(data: String)

        //check edit text empty
        fun isEmptyString(): Boolean

    }
}