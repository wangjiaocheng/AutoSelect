package com.autoselect.maper

interface Tts {
    fun initTts()
    fun playText(playText: String?)
    fun stopSpeak()
    fun destroy()
    fun isPlaying(): Boolean
    fun setCallback(ttsCallBack: TtsCallBack?)
}