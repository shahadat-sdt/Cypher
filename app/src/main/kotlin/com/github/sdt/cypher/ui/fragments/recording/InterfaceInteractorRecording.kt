package com.github.sdt.cypher.ui.fragments.recording

import com.github.sdt.cypher.di.PerActivity
import com.github.sdt.cypher.ui.activities.base.InterfaceInteractor

/**
 * Created by luis rafael on 17/03/19.
 */
@PerActivity
interface InterfaceInteractorRecording <V : InterfaceViewRecording> : InterfaceInteractor<V> {
    fun stopAudioRecordHolder()
    fun getRecordAudio(time:Long)
    fun valueEventEnableRecording()
    fun valueEventTimerRecording()
}