package com.ingbyr.vdm.utils

import java.io.Serializable

enum class EngineType : Serializable{
    YOUTUBE_DL,
    YOU_GET,
    NONE
}

enum class EngineStatus {
    /**
     * Different download engine status
     */
    ANALYZE,
    DOWNLOAD,
    PAUSE,
    RESUME,
    FAIL,
    FINISH
}

enum class DownloadType {
    JSON,
    SINGLE,
    PLAYLIST
}

object EngineUtils {
    const val YOUTUBE_DL_VERSION = "YOUTUBE_DL_VERSION"
    const val YOU_GET_VERSION = "YOU_GET_VERSION"
}

class DownloadEngineException(message: String) : Exception(message)