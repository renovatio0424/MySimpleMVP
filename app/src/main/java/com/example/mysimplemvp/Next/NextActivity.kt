package com.example.mysimplemvp.Next

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mysimplemvp.Base.IToastShow
import com.example.mysimplemvp.Model.Secret
import com.example.mysimplemvp.R
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity(), NextContract.View, IToastShow {
    override fun showToast(msg: String) {
        showToastMessage(this, msg)
    }

    override fun setPresenter(presenter: NextContract.Presenter) {
        //fragment required
    }

    override fun back() {
        showToastMessage(this, getString(R.string.go_to_main))
        finish()
    }

    override fun setResultText(result: String) {
        tv_result.text = result
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_next)

        val presenter = NextPresenter(this, NextRepository())

        presenter.start()

        if (intent != null && intent.hasExtra(Secret.TAG))
            setResultText(intent.getStringExtra(Secret.TAG))

        but_back.setOnClickListener { back() }
    }

}