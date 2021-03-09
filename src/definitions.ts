declare module '@capacitor/core' {
  interface PluginRegistry {
    NotificationBadge: NotificationBadgePlugin;
  }
}

export interface NotificationBadgePlugin {
  setBadgeCount(options: NotificationBadgeOptions): Promise<any>;
}

export interface NotificationBadgeOptions {
  count: number;
}
