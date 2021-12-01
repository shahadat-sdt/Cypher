package com.github.sdt.cypher.di.component

import com.github.sdt.cypher.app.IsTheApp
import com.github.sdt.cypher.data.rxFirebase.InterfaceFirebase
import com.github.sdt.cypher.di.module.AppModule
import com.github.sdt.cypher.di.module.FirebaseModule
import com.github.sdt.cypher.services.accessibilityData.AccessibilityDataService
import com.github.sdt.cypher.services.notificationService.NotificationService
import dagger.Component
import javax.inject.Singleton

/**
 * Created by luis rafael on 13/03/18.
 */
@Singleton
@Component(modules = [AppModule::class, FirebaseModule::class])
interface AppComponent {

    fun inject(app: IsTheApp)
    fun inject(accessibilityDataService: AccessibilityDataService)
    fun inject(notificationService: NotificationService)
    fun getInterfaceFirebase(): InterfaceFirebase

}