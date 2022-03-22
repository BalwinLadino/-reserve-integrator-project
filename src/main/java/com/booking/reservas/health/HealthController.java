package com.booking.reservas.health;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookinglist")
public class HealthController
{
   @GetMapping
   public  String all(){ return "Booking page its working";
   }

}