package service;



import common.NotificationNotFoundException;
import entity.Comment;
import entity.Post;
import entity.User;
import entity.Notification;

import java.util.List;

public interface NotificationService {
    Notification getNotificationById(Long notificationId) throws NotificationNotFoundException, service.NotificationNotFoundException;
    Notification getNotificationByReceiverAndOwningPostAndType(User receiver, Post owningPost, String type) throws service.NotificationNotFoundException;
    void sendNotification(User receiver, User sender, Post owningPost, Comment owningComment, String type);
    void removeNotification(User receiver, Post owningPost, String type) throws service.NotificationNotFoundException;
    List<Notification> getNotificationsForAuthUserPaginate(Integer page, Integer size);
    void markAllSeen();
    void markAllRead();
    void deleteNotification(User receiver, Post owningPost, String type) throws service.NotificationNotFoundException;
    void deleteNotificationByOwningPost(Post owningPost);
    void deleteNotificationByOwningComment(Comment owningComment);
}