package com.user_experience;

import java.util.ArrayList;
import java.util.List;

public class FusionExperience extends UserExperiencePrototype {

    private int number;
    private int data;
    private int fiberSpeed;

    public FusionExperience(int number, int data, int fiberSpeed, String username, String planType, List<String> menu, List<String> offers, List<String> banners){
        super(username, planType,
                (menu != null) ? menu : getDefaultMenu(),
                (offers != null) ? offers : getDefaultOffers(),
                (banners != null) ? banners : getDefaultBanners());
        this.number = number;
        this.data = data;
        this.fiberSpeed = fiberSpeed;
    }

    public static List<String> getDefaultMenu(){
        List<String> defaultMenu = new ArrayList<>();
        defaultMenu.add("Upgrade fiber plan");
        defaultMenu.add("Upgrade speed");
        defaultMenu.add("Hire TV");
        defaultMenu.add("Add minutes");
        defaultMenu.add("Add GB");
        return defaultMenu;
    }

    public static List<String> getDefaultOffers(){
        List<String> defaultOffers = new ArrayList<>();
        defaultOffers.add("Free phone number");
        defaultOffers.add("LaLiga for 1 month");
        defaultOffers.add("Unlimited data");
        return defaultOffers;
    }

    public static List<String> getDefaultBanners(){
        List<String> defaultBanners = new ArrayList<>();
        defaultBanners.add("-- FUSION EXPERIENCE --");
        return defaultBanners;
    }

    //Setters and Getters
    public void setNumber(int number){
        this.number = number;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setFiberSpeed(int fiberSpeed){
        this.fiberSpeed = fiberSpeed;
    }
    public int getNumber(){
        return number;
    }
    public int getData(){
        return data;
    }
    public int getFiberSpeed(){
        return fiberSpeed;
    }
}
