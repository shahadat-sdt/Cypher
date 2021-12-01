package com.github.sdt.cypher.ui.fragments.maps

import com.github.sdt.cypher.di.PerActivity
import com.github.sdt.cypher.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 11/03/18.
 */
@PerActivity
interface InterfaceInteractorMaps<V : InterfaceViewMaps> : InterfaceInteractor<V> {
    fun valueEventLocation()
    fun valueEventEnableGps()
    fun valueEventEnablePermission()
}