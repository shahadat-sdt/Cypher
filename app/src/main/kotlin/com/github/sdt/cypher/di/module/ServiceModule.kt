package com.github.sdt.cypher.di.module

import android.app.Service
import android.content.Context
import com.github.sdt.cypher.di.PerService
import com.github.sdt.cypher.services.calls.InteractorCalls
import com.github.sdt.cypher.services.calls.InterfaceInteractorCalls
import com.github.sdt.cypher.services.calls.InterfaceServiceCalls
import com.github.sdt.cypher.services.sms.InteractorSms
import com.github.sdt.cypher.services.sms.InterfaceInteractorSms
import com.github.sdt.cypher.services.sms.InterfaceServiceSms
import dagger.Module
import dagger.Provides

/**
 * Created by luis rafael on 13/03/18.
 */
@Module
class ServiceModule(var service:Service) {

    @Provides
    fun provideContext(): Context = service.applicationContext

    @Provides
    @PerService
    fun provideInterfaceInteractorCalls(interactor: InteractorCalls<InterfaceServiceCalls>): InterfaceInteractorCalls<InterfaceServiceCalls> = interactor

    @Provides
    @PerService
    fun provideInterfaceInteractorSms(interactor: InteractorSms<InterfaceServiceSms>): InterfaceInteractorSms<InterfaceServiceSms> = interactor

}