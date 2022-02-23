package com.example.hotelsapplicationtest.dto.request;

import java.util.List;

public class CustomerReservation {
    private List<RoomReservation> roomReservation;
    private CustomerInformation person;

    public CustomerReservation(){}

    public CustomerReservation(List<RoomReservation> roomReservation, CustomerInformation person) {
        this.roomReservation = roomReservation;
        this.person = person;
    }

    public List<RoomReservation> getRoomReservation() {return roomReservation;}

    public void setRoomReservation(List<RoomReservation> roomReservation) {this.roomReservation = roomReservation;}

    public CustomerInformation getPerson() {return person;}

    public void setPerson(CustomerInformation person) {this.person = person;}
}




