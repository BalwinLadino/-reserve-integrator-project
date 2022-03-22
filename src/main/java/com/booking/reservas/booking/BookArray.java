package com.booking.reservas.booking;



import com.booking.reservas.model.Booking;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class BookArray implements BookService
{
   private final ArrayList<Booking>  booksList = new ArrayList<>();

    @Override
    public Booking create(Booking booking)
    {
        int oid = booksList.size()+1;

        booksList.add( booking );
        return booking;
    }

    @Override
    public Booking findByID(String id)
    {
        for(Booking booking : booksList)
        {
            if(booking.getId().equals( id) )
            {
                return booking;
            }
        }
        return null;
    }

    @Override
    public Booking updateDateTime(String id, Date date) {
        for ( Booking booking : booksList)
        {
            if ( booking.getId().equals(id)) {
                booking.setDate(date);
                return booking;
            }
        }
        return null;
    }

    @Override
    public Booking updateEmail(String id, String email)
    {
        for (Booking booking : booksList){
            if (booking.getId().equals(id)){
                booking.setEmail(email);
                return booking;
            }
        }
        return null;
    }

    @Override
    public Booking updatePhone(String id, long phone)
    {
        for (Booking booking: booksList) {
            if(booking.getId().equals(id)){
                booking.setPhone(phone);
                return booking;
            }
        }
        return null;
    }

    @Override
    public boolean delete(String id)
    {
        for (Booking booking : booksList  )
        {
            if ( booking.getId().equals(id) ) {
                booksList.remove(booking);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Booking> all() {
        return booksList;
    }

    @Override
    public Booking findByEmail(String email) {
        return null;
    }

}
