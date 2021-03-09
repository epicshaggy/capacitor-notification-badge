package com.epicshaggy.notificationbadge;

import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import me.leolin.shortcutbadger.ShortcutBadger;

@NativePlugin
public class NotificationBadge extends Plugin {

    @PluginMethod()
    public void setBadgeCount(PluginCall call) {
        int count = call.getInt("count", 0);
        if (ShortcutBadger.isBadgeCounterSupported(getContext())) {
            ShortcutBadger.applyCount(getContext(), count);
            call.success();
        } else {
            call.error("Device not supported");
        }

    }
}
