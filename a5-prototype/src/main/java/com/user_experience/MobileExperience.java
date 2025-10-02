package src.main.java.com.user_experience;

import java.util.ArrayList;
import java.util.List;

public class MobileExperience extends UserExperiencePrototype{

    private int number;
    private int data;

    public MobileExperience(int number, int data, String username, String planType, List<String> menu, List<String> offers, List<String> banners){
        super(username, planType, (menu != null) ? menu : getDefaultMenu(), (offers != null) ? offers : getDefaultOffers(),
        banners);
        this.number = number;
        this.data = data;
    }

    //Available options for MobileExperience
    private static List getDefaultMenu(){
        List<String> defaultMenu = new ArrayList<>();
        defaultMenu.add("Add minutes");
        defaultMenu.add("Add GB");
        return defaultMenu;
    }

    //Available offers for MobileExperience
    private static List getDefaultOffers(){
        List<String> defaultOffers = new ArrayList<>();
        defaultOffers.add("60 free minutes");
        defaultOffers.add("Unlimited data");
        defaultOffers.add("Smartphone for 0€/month");
        return defaultOffers;
    }

    public void setNumber(int number){
        this.number = number;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getNumber(){
        return number;
    }
    public int getData(){
        return data;
    }
}
