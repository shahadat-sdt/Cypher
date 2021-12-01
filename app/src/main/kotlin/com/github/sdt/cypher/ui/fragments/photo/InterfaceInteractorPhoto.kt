package com.github.sdt.cypher.ui.fragments.photo

import com.github.sdt.cypher.di.PerActivity
import com.github.sdt.cypher.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 20/03/18.
 */
@PerActivity
interface InterfaceInteractorPhoto<V : InterfaceViewPhoto> : InterfaceInteractor<V> {
    fun getPhotoCamera(facing:Int)
    fun valueEventEnablePhoto()
    fun valueEventEnablePermission()
}