package com.example.mailund_hotelbooking_frontend.restcontroller;

import com.example.mailund_hotelbooking_frontend.model.Hotel;
import com.example.mailund_hotelbooking_frontend.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class HotelRestController {

    @Autowired
    HotelService hotelService;

    @PostMapping("/addHotel")
    private ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
        return hotelService.saveHotel(hotel);
    }
}
