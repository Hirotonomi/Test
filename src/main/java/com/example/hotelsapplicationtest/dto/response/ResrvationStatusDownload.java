package com.example.hotelsapplicationtest.dto.response;

import com.example.hotelsapplicationtest.domain.OrderStatusType;
import com.example.hotelsapplicationtest.dto.request.CustomerInformation;
import com.example.hotelsapplicationtest.dto.request.RoomReservation;

import java.util.List;

public class ResrvationStatusDownload {
    private Integer id;
    private OrderStatusType status;
    private List<RoomReservation> roomsReservation;
    private CustomerInformation person;

    public ResrvationStatusDownload(){}

    public ResrvationStatusDownload(Integer id, OrderStatusType status, List<RoomReservation> roomsReservation, CustomerInformation person) {
        this.id = id;
        this.status = status;
        this.roomsReservation = roomsReservation;
        this.person = person;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public OrderStatusType getStatus() {return status;}

    public void setStatus(OrderStatusType status) {this.status = status;}

    public List<RoomReservation> getRoomsReservation() {return roomsReservation;}

    public void setRoomsReservation(List<RoomReservation> roomsReservation) {this.roomsReservation = roomsReservation;}

    public CustomerInformation getPerson() {return person;}

    public void setPerson(CustomerInformation person) {this.person = person;}
}
