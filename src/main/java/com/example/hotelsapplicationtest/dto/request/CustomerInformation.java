package com.example.hotelsapplicationtest.dto.request;

public class CustomerInformation {
    private String name;
    private Integer phone;
    private String adress;
    private Integer floor;

    public CustomerInformation(){};

    public CustomerInformation(String name, Integer phone, String adress, Integer floor) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}