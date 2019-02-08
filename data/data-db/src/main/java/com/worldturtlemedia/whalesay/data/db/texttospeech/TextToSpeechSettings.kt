package com.worldturtlemedia.whalesay.data.db.texttospeech

import com.worldturtlemedia.whalesay.data.db.prefs.Prefs

data class TextToSpeechSettings(
    val voice: String,
    val gender: String,
    val speakingRate: Float,
    val pitch: Float,
    val volumeGain: Float
)

fun Prefs.textToSpeechSettings() = TextToSpeechSettings(
    voice = ttsVoice,
    gender = ttsGender,
    speakingRate = ttsSpeakingRate,
    pitch = ttsPitch,
    volumeGain = ttsVolumeGain
)