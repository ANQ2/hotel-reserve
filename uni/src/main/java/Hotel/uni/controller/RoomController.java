package Hotel.uni.controller;

import Hotel.uni.model.RoomDTO;
import Hotel.uni.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String showAddRoomForm(Model model) {
        model.addAttribute("roomDTO", new RoomDTO());
        return "addRoom";
    }

    @PostMapping
    public String addRoom(@ModelAttribute RoomDTO roomDTO) {
        roomService.addRoom(roomDTO);
        return "redirect:/rooms"; // Перенаправление после успешного добавления комнаты
    }
}
