package com.booking.reservas.booking;

import com.booking.reservas.model.Booking;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class BookingServiceHashMap implements BookService
{

    private HashMap<String, Booking> bookingHashMap = new HashMap<>();

    @Override
    public Booking create(Booking booking) {
        int oid = bookingHashMap.size()+1;

        bookingHashMap.put(booking.getId(), booking);
        return booking;
    }

    @Override
    public Booking findByID(String id) {
        return bookingHashMap.getOrDefault(id, null);
    }

    @Override
    public Booking updateDateTime(String id, Date date)
    {
        if (bookingHashMap.containsKey(id))
        {
            Booking booking = bookingHashMap.get(id);
            booking.setDate(date);
            return booking;

        }
        return null;
    }


        @Override
    public Booking updateEmail(String id, String email)
        {
            if (bookingHashMap.containsKey(id))
            {
                Booking booking = bookingHashMap.get(id);
                booking.setEmail(email);
                return booking;

            }
            return null;

    }

    @Override
    public Booking updatePhone(String id, long phone)
    {
        if (bookingHashMap.containsKey(id))
        {
            Booking booking = bookingHashMap.get(id);
            booking.setPhone(phone);
            return booking;
        }
        return null;
    }

    @Override
    public boolean delete(String id)
    {
        if (bookingHashMap.containsKey(id))
        {
            bookingHashMap.remove(id);
            return true;

        }
        return false;
    }

    @Override
    public List<Booking> all() {
        return  new ArrayList<>(bookingHashMap.values());
    }
}
