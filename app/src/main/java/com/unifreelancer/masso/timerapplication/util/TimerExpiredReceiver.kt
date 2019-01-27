package com.unifreelancer.masso.timerapplication.util

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.unifreelancer.masso.timerapplication.MainActivity

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.

        //TODO: show notification
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(MainActivity.TimerState.Stopped,context)
        PrefUtil.setAlarmSetTime(0, context)

    }
}
