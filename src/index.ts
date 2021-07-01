import { registerPlugin } from '@capacitor/core';
import { NotificationBadgePlugin } from './definitions';

const NotificationBadge = registerPlugin<NotificationBadgePlugin>(
  'NotificationBadge',
  {
    web: () => import('./web').then(m => new m.NotificationBadgeWeb()),
  },
);

export * from './definitions';
export { NotificationBadge };
