package strategy;

public class SmsNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("SMS SENT!");
    }

    @Override
    public String getType() {
        return NotificationType.SMS.name();
    }
}
