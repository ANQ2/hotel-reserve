package Hotel.uni.services;

import Hotel.uni.model.Room;
import Hotel.uni.model.RoomDTO;
import Hotel.uni.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public void addRoom(RoomDTO roomDTO) {
        Room room = new Room();
        room.setNumber(roomDTO.getNumber());
        room.setType(roomDTO.getType());
        room.setPrice(roomDTO.getPrice());
        roomRepository.save(room);
    }
}
