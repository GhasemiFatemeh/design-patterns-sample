package strategy;

import java.util.List;

public class FallbackNotificationServiceStrategy{
    private List<NotificationService> services;

    public FallbackNotificationServiceStrategy(List<NotificationService> notificationServices) {
        this.services = notificationServices;
    }


    public void sendNotification() {
        String lastExceptionMsg = null;
        for (NotificationService service : services) {
            try {
                System.out.println("Using: " + service.getType());
                service.sendNotification();
            } catch (Exception e){
                lastExceptionMsg = e.getMessage();

            }
        }
        throw new RuntimeException("All notification strategies failed!" + lastExceptionMsg);
    }


}
