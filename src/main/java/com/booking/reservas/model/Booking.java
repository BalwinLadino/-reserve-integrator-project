package com.booking.reservas.model;

import com.booking.reservas.controller.BookingDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;
@Document
public class Booking {

    @Id
    private  String id;
    private  String name;
    private String email;
    private long phone;
    private Date date; //Fecha y hora

    public Booking() {
    }

    public Booking(String id, String name, String email, long phone, Date date) {


        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.date = date;
    }

    public Booking(BookingDto bookingDto)
    {
       this( null, bookingDto.getName(), bookingDto.getEmail(), bookingDto.getPhone(), bookingDto.getDate());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

     public void setEmail(String email) {
        this.email = email;
    }


    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }



    public void setDate(Date date) {
        this.date = date;
    }


}
