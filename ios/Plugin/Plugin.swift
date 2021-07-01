import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(NotificationBadge)
public class NotificationBadge: CAPPlugin {

    @objc func setBadgeCount(_ call: CAPPluginCall) {
        DispatchQueue.main.async {
            let count = call.getInt("count") ?? 0
            UIApplication.shared.applicationIconBadgeNumber = count
            call.resolve()
        }
    }
}
