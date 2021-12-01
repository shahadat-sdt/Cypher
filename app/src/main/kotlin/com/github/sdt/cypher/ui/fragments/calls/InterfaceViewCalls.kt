package com.github.sdt.cypher.ui.fragments.calls

import com.github.sdt.cypher.ui.activities.base.InterfaceView
import com.github.sdt.cypher.ui.adapters.callsadapter.CallsRecyclerAdapter

/**
 * Created by luis rafael on 12/03/18.
 */
interface InterfaceViewCalls : InterfaceView {

    fun setRecyclerAdapter(recyclerAdapter: CallsRecyclerAdapter)

}