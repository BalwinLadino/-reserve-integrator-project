package com.booking.reservas.booking;
import com.booking.reservas.model.Booking;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


public interface BookService
{
    Booking create(Booking booking); //Crear reserva
    Booking findByID (String id); //Consultar
    Booking findByEmail(String email);
    Booking updateDateTime (String id, Date date); //Actualizar fecha y hora
    Booking updateEmail (String id, String email); // Actualizar Email
    Booking updatePhone (String id, long phone);  // Actualizar Numero cel

//Booking update (String id, BookingDto bookingDto); //Actualizar fecha y hora //Resolver...

    boolean delete (String id); // Eliminar reserva
    List<Booking> all();


}
