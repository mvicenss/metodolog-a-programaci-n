package src.main.java.com;

//Card class == Validating PIN
public class Card{

    private String defaultPin = "9513" ; //Stores card PIN
    //private String name = "John";
    //private String surname = "Doe";
    //private String number = "6589 6214 7862 8148";


    public boolean validatePin(String inputPin){
        boolean valid = false;
        try {
            valid = inputPin.equals(defaultPin); //Will return TRUE if the input PIN equals the default PIN
        }catch (Exception e){
            System.out.println("Wrong pin.");
        }
        return valid;

    }
}