package src.main.java.com.user_experience;

import java.util.List;

public abstract class UserExperiencePrototype implements Cloneable{

    //Common attributes for all experiences
    public String username;
    public String planType;
    public List<String> menu; //List of available services - Ex.: Upgrade data plan, fiber plan, TV channels plan
    public List<String> offers; //List of offers
    public List<String> banners; //List of banners - One experience may have several

    public UserExperiencePrototype(){}

    //Constructor with arguments to initialize all attributes when creating
    public UserExperiencePrototype(String username, String planType, List<String> menu, List<String> offers, List<String> banners) {
        this.username = username;
        this.planType = planType;
        this.menu = menu;
        this.offers = offers;
        this.banners = banners;
    }

    // Method for menu
    public void showMenu() {
        System.out.println("Menu:");
        if (menu != null && !menu.isEmpty()) { //If its not empty and it exists:
            for (int i = 0; i < menu.size(); i++) { //While the value of i is smaller than menu size
                System.out.println((i+1) + ". " + menu.get(i)); //Print i value + 1 (bcos it starts at 0) + the item
            }
        } else {
            System.out.println("No options available.");
        }
    }

    //Method for offers
    public void showAvailableOffers(){
        System.out.println("Available Offers:");
        if (offers != null && !offers.isEmpty()) {
            for (int i = 0; i < offers.size(); i++) {
                System.out.println((i+1) + ". " + offers.get(i));
            }
        }else{
            System.out.println("No offers available.");
        }
    }

    //Method to show the banner

    //Setters
    public void setUsername(){
        this.username = username;
    }
    public void setPlanType(){
        this.planType = planType;
    }
    public void setMenu(){
        this.menu = menu;
    }
    public void setOffers(){
        this.offers = offers;
    }
    public void setBanner(){
        this.banners = banners;
    }

    //Getters
    public String getUsername(){
        return username;
    }
    public String getPlanType(){
        return planType;
    }
    public List<String> getMenu(){
        return menu;
    }
    public List<String> getOffers(){
        return offers;
    }
    public List<String> getBanners(){
        return banners;
    }

    @Override
    public Object clone() throws CloneNotSupportedException { //Can be called from any part of the proyect + Can throw an exeption if the object can't be cloned
        return super.clone(); //Calls the clone method from the
    }


    protected void simuatedBackendLoad(String element){
        System.out.println("Loading " + element + "from backend...");
        try{
            Thread.sleep(2000); //execution process stops for 2secs
        }catch(InterruptedException e){//If its interrupted
            Thread.currentThread().interrupt();//Update thread state
        }
    }
}