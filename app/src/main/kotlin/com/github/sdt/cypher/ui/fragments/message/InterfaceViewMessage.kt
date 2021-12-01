package com.github.sdt.cypher.ui.fragments.message

import com.github.sdt.cypher.ui.activities.base.InterfaceView
import com.github.sdt.cypher.ui.adapters.smsadapter.SmsRecyclerAdapter

/**
 * Created by luis rafael on 20/03/18.
 */
interface InterfaceViewMessage : InterfaceView {

    fun setRecyclerAdapter(smsRecyclerAdapter: SmsRecyclerAdapter)

}