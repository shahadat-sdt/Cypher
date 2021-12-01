package com.github.sdt.cypher.ui.activities.register

import com.github.sdt.cypher.di.PerActivity
import com.github.sdt.cypher.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 10/03/18.
 */
@PerActivity
interface InterfaceInteractorRegister<V : InterfaceViewRegister> : InterfaceInteractor<V> {

    fun signUpDisposable(email: String, pass: String)

}