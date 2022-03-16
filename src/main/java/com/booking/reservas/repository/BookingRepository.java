package com.booking.reservas.repository;

import com.booking.reservas.model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface BookingRepository extends MongoRepository<Booking, String >
{
    Booking findBookingByEmail(String email);
}
