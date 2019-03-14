package com.example.mysimplemvp.Main

import com.example.mysimplemvp.Model.Secret

class MainRepository {

    private val secret = Secret()

    fun getSecretStringData() : String {
        return secret.data
    }
}