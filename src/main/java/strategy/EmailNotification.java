package strategy;

public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("EMAIL SENT!");

    }

    @Override
    public String getType() {
        return NotificationType.EMAIL.name();
    }
}
