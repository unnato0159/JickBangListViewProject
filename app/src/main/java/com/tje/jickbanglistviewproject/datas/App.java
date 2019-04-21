package com.tje.jickbanglistviewproject.datas;

import java.io.Serializable;

public class App implements Serializable {

    public String housePrice;
    public String floor;
    public String homeAddress;
    public String homeContent;
    public String homeExplanatio;

    public App(String housePrice, String floor, String homeAddress, String homeContent, String homeExplanatio) {
        this.housePrice = housePrice;
        this.floor = floor;
        this.homeAddress = homeAddress;
        this.homeContent = homeContent;
        this.homeExplanatio = homeExplanatio;
    }
}

