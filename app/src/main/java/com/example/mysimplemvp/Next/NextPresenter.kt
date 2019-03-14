package com.example.mysimplemvp.Next

import android.os.Handler

class NextPresenter(private val mainView: NextContract.View,
                    private val nextRepository: NextRepository) : NextContract.Presenter {

    //presenter에서 비동기 방식으로  view를 호출하는 example
    override fun start() {

        mainView.showToast("Mission START")

        Handler().postDelayed({
            mainView.showToast("Mission END")
        }, 3000)
    }

}