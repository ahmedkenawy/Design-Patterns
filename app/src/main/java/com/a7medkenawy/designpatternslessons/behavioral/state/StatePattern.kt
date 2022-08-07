package com.a7medkenawy.designpatternslessons.behavioral.state

interface MobileAlertState {
    fun alert()
}

class Vibration : MobileAlertState {
    override fun alert() {
        println("Vibration Mode...")
    }
}

class Silent : MobileAlertState {
    override fun alert() {
        println("Silent Mode...")
    }
}

data class Mobile(var mobileAlertState: MobileAlertState = Vibration()) {

    fun setAlert(mobileAlertState: MobileAlertState) {
        this.mobileAlertState = mobileAlertState
    }

    fun alert() {
        mobileAlertState.alert()
    }
}

fun main() {
    val myMobile = Mobile()
    myMobile.alert()

    val silent = Silent()
    myMobile.setAlert(silent)
    myMobile.alert()
}