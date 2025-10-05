package com.user_experience;

import java.util.ArrayList;
import java.util.List;

public class FiberExperience extends UserExperiencePrototype{

    private int speed;

    public FiberExperience(int speed, String username, String planType, List<String> menu, List<String> offers, List<String> banners) {
        super(username, planType,
            (menu != null) ? menu : getDefaultMenu(), //If menu is not null -- initialize as menu (condition is true) | intialize as with content of DefaultMenu (condition false)
            (offers != null) ? offers : getDefaultOffers(),
            banners);
        this.speed = speed;
    }

    private static List<String> getDefaultMenu() {
        List<String> defaultMenu = new ArrayList<>();
        defaultMenu.add("Upgrade fiber plan");
        defaultMenu.add("Upgrade speed");
        defaultMenu.add("Hire TV");
        return defaultMenu;
    }

    private static List<String> getDefaultOffers() {
        List<String> defaultOffers = new ArrayList<>();
        defaultOffers.add("Instalation Discount");
        defaultOffers.add("Free router");
        return defaultOffers;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

