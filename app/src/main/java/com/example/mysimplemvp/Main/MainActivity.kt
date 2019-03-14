package com.example.mysimplemvp.Main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mysimplemvp.Base.IToastShow
import com.example.mysimplemvp.Model.Secret
import com.example.mysimplemvp.Next.NextActivity
import com.example.mysimplemvp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View, IToastShow {

    private lateinit var mainPresenter: MainPresenter

    override fun moveToNextActivity(data: String) {
        val intent = Intent(this, NextActivity::class.java)
        val text = et_something.text.toString()
        intent.putExtra(Secret.TAG, "[$data] $text")
        startActivity(intent)
    }

    override fun isEmptyString(): Boolean {
        return et_something.text.toString().isEmpty()
    }

    override fun setPresenter(presenter: MainContract.Presenter) {
        //fragment required
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(MainRepository(), this)

        but_next.setOnClickListener {
            if (!isEmptyString())
                moveToNextActivity(mainPresenter.loadSecretData())
            else
                showToastMessage(this, getString(R.string.empty_string))
        }
    }
}