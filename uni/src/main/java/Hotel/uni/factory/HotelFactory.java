package Hotel.uni.factory;
import org.springframework.stereotype.Component;
import Hotel.uni.model.Hotel;

@Component
public class HotelFactory {

    public static Hotel createHotel(String name) {
        Hotel hotel = new Hotel();
        hotel.setName(name);
        return hotel;
    }
}
