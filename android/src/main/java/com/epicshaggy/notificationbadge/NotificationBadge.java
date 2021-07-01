package com.epicshaggy.notificationbadge;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import me.leolin.shortcutbadger.ShortcutBadger;

@CapacitorPlugin()
public class NotificationBadge extends Plugin {

    @PluginMethod()
    public void setBadgeCount(PluginCall call) {
        int count = call.getInt("count", 0);
        if (ShortcutBadger.isBadgeCounterSupported(getContext())) {
            ShortcutBadger.applyCount(getContext(), count);
            call.resolve();
        } else {
            call.reject("Device not supported");
        }

    }
}
