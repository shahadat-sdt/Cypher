package com.github.sdt.cypher.utils

import android.media.MediaRecorder
import android.media.MediaRecorder.OnErrorListener
import com.pawegio.kandroid.e

/**
 * Created by luis rafael on 21/03/19.
 */
class MediaRecorderUtils(private val errorAction: () -> Unit) : MediaRecorder() {

    fun startRecording(audioSource: Int,fileName:String?){
        try {
            setAudioSource(audioSource)
            setOutputFormat(OutputFormat.MPEG_4)
            setAudioEncoder(AudioEncoder.AMR_NB)
            setAudioEncoder(getAudioSourceMax())
            setAudioEncodingBitRate(16 * 44100)
            setAudioSamplingRate(44100)
            setOutputFile(fileName)

            val errorListener = OnErrorListener { _, _, _ -> errorAction() }
            setOnErrorListener(errorListener)

            prepare()
            start()
        } catch (er: Throwable) {
            e(Consts.TAG, er.message.toString())
            errorAction()
        }
    }

    fun stopRecording(sendFile : () -> Unit){
        try {
            stop()
            sendFile()
        } catch (e: Throwable) {
            e(Consts.TAG, e.message.toString())
            errorAction()
        }
    }

}