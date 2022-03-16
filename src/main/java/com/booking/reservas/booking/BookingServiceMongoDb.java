package com.booking.reservas.booking;

import com.booking.reservas.model.Booking;
import com.booking.reservas.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class BookingServiceMongoDb implements BookService
{
    private final BookingRepository bookingRepository;

    public BookingServiceMongoDb(@Autowired BookingRepository bookingRepository)
    {
        this.bookingRepository = bookingRepository;
    }


    @Override
    public Booking create(Booking booking) {
        return bookingRepository.save( booking);
    }

    @Override
    public Booking findByID(String id) {
        return null;
    }

    @Override
    public Booking updateDateTime(String id, Date date) {
        return null;
    }

    @Override
    public Booking updateEmail(String id, String email) {
        return null;
    }

    @Override
    public Booking updatePhone(String id, long phone) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<Booking> all() {
        return null;
    }
}
