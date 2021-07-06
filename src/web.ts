import { WebPlugin } from '@capacitor/core';
import {
  NotificationBadgeOptions,
  NotificationBadgePlugin,
} from './definitions';

export class NotificationBadgeWeb
  extends WebPlugin
  implements NotificationBadgePlugin {
  constructor() {
    super({
      name: 'NotificationBadge',
      platforms: ['web'],
    });
  }

  async setBadgeCount(_options: NotificationBadgeOptions): Promise<any> {
    this.unimplemented('No web implementation');
  }
}
