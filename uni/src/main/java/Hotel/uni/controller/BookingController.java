package Hotel.uni.controller;

import Hotel.uni.factory.Booking;
import Hotel.uni.factory.BookingFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
@CrossOrigin("http://localhost:8080")

public class BookingController {

    @PostMapping
    public ResponseEntity<String> createBooking(@RequestParam String type) {
        Booking booking = BookingFactory.getBooking(type);
        return ResponseEntity.ok(booking.createBooking());
    }
}
