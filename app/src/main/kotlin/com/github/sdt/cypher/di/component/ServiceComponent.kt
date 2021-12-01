package com.github.sdt.cypher.di.component

import com.github.sdt.cypher.di.PerService
import com.github.sdt.cypher.di.module.ServiceModule
import com.github.sdt.cypher.services.calls.CallsService
import com.github.sdt.cypher.services.sms.SmsService
import com.github.sdt.cypher.services.social.MonitorService
import dagger.Component

/**
 * Created by luis rafael on 13/03/18.
 */
@PerService
@Component(dependencies = [AppComponent::class], modules = [ServiceModule::class])
interface ServiceComponent {

    fun inject(callsService: CallsService)
    fun inject(smsService: SmsService)
    fun inject(monitorService: MonitorService)

}