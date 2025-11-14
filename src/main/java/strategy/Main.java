package strategy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Manually create the services
        List<NotificationService> services = Arrays.asList(
                new EmailNotification(),
                new SmsNotification()
        );

        FallbackNotificationServiceStrategy registry = new FallbackNotificationServiceStrategy(services);
        registry.sendNotification();

    }
}
