package Hotel.uni.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/bookings/notify")
    public String notifyCustomers(@RequestParam String message) {
        // Ваш код для отправки уведомления клиентам
        return "Notification sent: " + message;
    }
}
