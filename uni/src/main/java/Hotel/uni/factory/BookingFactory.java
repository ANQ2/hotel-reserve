package Hotel.uni.factory;

public class BookingFactory {
    public static Booking getBooking(String bookingType) {
        switch (bookingType) {
            case "standard":
                return new StandardBooking();
            case "vip":
                return new VIPBooking();
            default:
                throw new IllegalArgumentException("Unkown booking type");
        }
    }
}
