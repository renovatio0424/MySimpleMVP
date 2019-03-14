package com.example.mysimplemvp.Model

data class Secret (
        val data: String = "Reno's Secret Data"
) {
    companion object {
        val TAG  = Secret::class.java.simpleName.toString()
    }
}

