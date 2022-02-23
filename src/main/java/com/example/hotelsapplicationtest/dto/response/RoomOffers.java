package com.example.hotelsapplicationtest.dto.response;

import java.math.BigDecimal;

public class RoomOffers {
    private Integer id;
    private String beds;
    private BigDecimal price;
    public RoomOffers () {}

    public RoomOffers(Integer id, String beds, BigDecimal price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getBeds() {return beds;}

    public void setBeds(String beds) {this.beds = beds;}

    public BigDecimal getPrice() {return price;}

    public void setPrice(BigDecimal price) {this.price = price;}
}


