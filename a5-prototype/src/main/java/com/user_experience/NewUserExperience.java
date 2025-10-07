package com.user_experience;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class NewUserExperience extends UserExperiencePrototype{

    private String name;
    private String email;
    private LocalDate registrationDate;

    public NewUserExperience(String name, String email, LocalDate registrationDate, String username, String planType, List<String> menu, List<String> offers, List<String> banners) {
        super(username, planType, (menu != null) ? menu : getDefaultMenu(), (offers != null) ? offers : getDefautlOffers(),
                (banners != null) ? banners : getDefaultBanners());
        this.name = name;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public static List<String> getDefaultMenu() {
        List<String> defaultMenu = new ArrayList<>();
        defaultMenu.add("Call Customer Support");
        defaultMenu.add("Explore services");
        defaultMenu.add("Check plan");
        return defaultMenu;
    }
    public static List<String> getDefautlOffers() {
        List<String> defaultOffers = new ArrayList<>();
        defaultOffers.add("One month of free LaLiga");
        defaultOffers.add("3 Months of Netflix for free");
        defaultOffers.add("Free phone line");
        return defaultOffers;
    }

    public static List getDefaultBanners() {
        List<String> defaultBanners = new ArrayList<>();
        defaultBanners.add("-- NEW USER EXPERIENCE --");
        return defaultBanners;
    }

    //Setters + Getters
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setRegistrationDate(LocalDate registrationDate){
        this.registrationDate = registrationDate;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public LocalDate getRegistrationDate(){
        return registrationDate;
    }
}
