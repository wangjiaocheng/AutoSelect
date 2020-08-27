package com.autoselect.helper

import android.content.ClipData
import android.content.Intent
import android.net.Uri
import com.autoselect.helper.AHelper.app
import org.jetbrains.anko.clipboardManager

object ClipboardHelper {
    var textClip: CharSequence?
        get() = app.clipboardManager.primaryClip
            ?.run { if (itemCount > 0) getItemAt(0).coerceToText(app) else null }
        set(text) = app.clipboardManager.setPrimaryClip(ClipData.newPlainText("text", text))
    var uriClip: Uri?
        get() = app.clipboardManager.primaryClip?.run { if (itemCount > 0) getItemAt(0).uri else null }
        set(uri) = app.clipboardManager
            .setPrimaryClip(ClipData.newUri(app.contentResolver, "uri", uri))
    var intentClip: Intent?
        get() = app.clipboardManager.primaryClip?.run { if (itemCount > 0) getItemAt(0).intent else null }
        set(intent) = app.clipboardManager.setPrimaryClip(ClipData.newIntent("intent", intent))
}