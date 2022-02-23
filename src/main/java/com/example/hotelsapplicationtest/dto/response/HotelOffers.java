package com.example.hotelsapplicationtest.dto.response;

import java.util.List;

public class HotelOffers {
    private Integer id;
    private String name;
    private List<RoomOffers> rooms;

    public HotelOffers(){}

    public HotelOffers(Integer id, String name, List<RoomOffers> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public List<RoomOffers> getRooms() {return rooms;}

    public void setRooms(List<RoomOffers> rooms) {this.rooms = rooms;}
}
