package Hotel.uni.services;
import Hotel.uni.factory.HotelFactory;
import Hotel.uni.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Hotel.uni.model.Hotel;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public void addHotel(String name) {
        Hotel hotel = HotelFactory.createHotel(name);
        hotelRepository.save(hotel);
    }
}

