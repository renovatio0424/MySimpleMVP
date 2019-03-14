package com.example.mysimplemvp.Main

class MainPresenter(
        private val mainRepository: MainRepository,
        private val mainView: MainContract.View
) : MainContract.Presenter {

    init {
        mainView.setPresenter(this)
    }

    override fun loadSecretData(): String {
        return mainRepository.getSecretStringData()
    }

    override fun start() {
        loadSecretData()
    }
}