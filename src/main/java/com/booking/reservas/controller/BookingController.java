package com.booking.reservas.controller;

import com.booking.reservas.booking.BookService;
import com.booking.reservas.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/booking")
public class BookingController
{

   private final BookService bookService;

    public BookingController(@Autowired BookService bookService)
    {
        this.bookService = bookService;
    }

    @PostMapping
    public Booking create (@RequestBody BookingDto bookingDto){
        return bookService.create(new Booking( bookingDto ));
    }


    @PutMapping("/{id}")
    public  Booking updateDateTime(@PathVariable("id") String id, @RequestBody Booking booking){
        return  bookService.updateDateTime(id, booking.getDate());
    }


    @GetMapping("")
   public List<Booking> getBookingList()
   {
     return  bookService.all();
   }

   @DeleteMapping("/{id}")
   @RolesAllowed("ADMIN")
    boolean delete(@PathVariable ("id") String id){
        return  bookService.delete(id);
   }


}
