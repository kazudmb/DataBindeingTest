package com.nakano.databindeingtest

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class MainViewModel: BaseObservable() {
    @Bindable
    var messageEditText: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.messageEditText)
            notifyPropertyChanged(BR.messageLength)
        }

    @get:Bindable
    val messageLength: String
        get() = "${messageEditText.length}"
}