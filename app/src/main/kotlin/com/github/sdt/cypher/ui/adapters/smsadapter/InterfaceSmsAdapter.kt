package com.github.sdt.cypher.ui.adapters.smsadapter

import com.github.sdt.cypher.ui.adapters.basedapter.InterfaceAdapter

/**
 * Created by luis rafael on 20/03/18.
 */
interface InterfaceSmsAdapter : InterfaceAdapter{
    fun onItemClick(keySms:String,position:Int)
    fun onItemLongClick(keySms:String,position:Int)
}