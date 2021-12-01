package com.github.sdt.cypher.services.calls

import com.github.sdt.cypher.di.PerService
import com.github.sdt.cypher.services.base.InterfaceInteractorService

/**
 * Created by luis rafael on 27/03/18.
 */
@PerService
interface InterfaceInteractorCalls<S : InterfaceServiceCalls> : InterfaceInteractorService<S> {

    fun startRecording(phoneNumber:String?,type:Int)
    fun stopRecording()

}