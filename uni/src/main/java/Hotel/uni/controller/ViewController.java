package Hotel.uni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/booking.html")
    public String showBookingPage() {
        return "booking"; // Это будет соответствовать файлу booking.html в папке resources/templates
    }

    @GetMapping("/rooms.html")
    public String showBookingPage1() {
        return "addRoom";
    }
}
