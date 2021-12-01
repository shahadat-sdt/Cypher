package com.github.sdt.cypher.ui.fragments.social

import com.github.sdt.cypher.di.PerActivity
import com.github.sdt.cypher.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 20/03/18.
 */
@PerActivity
interface InterfaceInteractorSocial<V : InterfaceViewSocial> : InterfaceInteractor<V> {

    fun valueEventSocial()
    fun valueEventEnablePermission()

}