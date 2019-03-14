package com.example.mysimplemvp.Next

import com.example.mysimplemvp.Base.BasePresenter
import com.example.mysimplemvp.Base.BaseView
import com.example.mysimplemvp.Base.IToastShow

class NextContract {

    interface Presenter : BasePresenter {
        //Model과 연동하는 일이 없음
    }

    interface View : BaseView<Presenter>, IToastShow {

        fun back()

        fun setResultText(result: String)

        fun showToast(msg: String)
    }
}