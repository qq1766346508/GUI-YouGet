package com.ingbyr.vdm.events

import com.ingbyr.vdm.models.DownloadTaskData
import com.ingbyr.vdm.models.DownloadTaskModel
import tornadofx.*

class StopBackgroundTask(val downloadTask: DownloadTaskModel? = null, val stopAll: Boolean = false) : FXEvent()

class CreateDownloadTask(val downloadTask: DownloadTaskData) : FXEvent()