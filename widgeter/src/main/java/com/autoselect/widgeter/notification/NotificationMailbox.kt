package com.autoselect.widgeter.notification

import androidx.core.app.NotificationCompat

class NotificationMailbox : NotificationBase() {
    private var mMessages: MutableList<String?>? = null
    fun setMessages(messages: MutableList<String?>?): NotificationMailbox? =
        apply { mMessages = messages }

    fun addMsg(msg: String?): NotificationMailbox? = apply {
        if (mMessages == null) mMessages = mutableListOf()
        mMessages?.add(msg)
    }

    override fun beforeBuild() {
        mMessages?.apply {
            if (size > 0) when {
                size > 1 -> {
                    val inboxStyle =
                        NotificationCompat.InboxStyle().setSummaryText("你收到了[$size]条信息")
                    for (msg in this) {
                        inboxStyle.addLine(msg)
                    }
                    setStyle<NotificationBase?>(inboxStyle)
                }
                else -> setContentText<NotificationBase?>(this[0])
            }
        }
    }
}