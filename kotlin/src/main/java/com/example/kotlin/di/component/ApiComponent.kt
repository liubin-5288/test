package com.example.kotlin.di.component

import com.example.kotlin.di.module.ApiModule
import com.example.kotlin.ui.activity.BaseActivity
import dagger.Component

/**
 * Created by liubin on 2017/6/13.
 */
@Component(modules = arrayOf(ApiModule::class))
interface ApiComponent {
    fun inject(app: BaseActivity)
}
