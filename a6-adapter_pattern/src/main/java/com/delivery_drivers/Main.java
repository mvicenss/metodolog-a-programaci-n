package src.main.java.com.delivery_drivers;

public class Main{

    //CLIENT
    static void main (String[] args){

        System.out.println("---EUROPE DIRVER---");
        europeSpeed europeDriver = new europeSpeed();
        double euFinalSpeed = europeDriver.setAvgSpeed(120);
        if(euFinalSpeed == -1){
            System.out.println("Speed Limit exceeded");
        }else{
            double euFinalDistanece = europeDriver.calculateDistance(7);
            if(euFinalDistanece == -1){
                System.out.println("Time Limit exceeded");
            }else{
                System.out.println("Total Distance in Europe = " + euFinalDistanece + " KM.");
            }
        }

        System.out.println("---CALI DRIVER---");
        californiaSpeed caliDriver = new  californiaSpeed();
        double caliFinalSpeed = caliDriver.setAvgSpeedMph(40);
        if(caliFinalSpeed == -1){
            System.out.println("Speed Limit exceeded");
        }else{
            double caliFinalDistanece = caliDriver.calculateDistance(7);
            if(caliFinalDistanece == -1){
                System.out.println("Time Limit exceeded");
            }else{
                System.out.println("Total Distance in Cali = " + caliFinalDistanece + " MILES.");
            }
        }

        System.out.println("---EU IN CALI DRIVER---");
        avgSpeed euInCaliDriver = new californiaAdapter(new californiaSpeed());
        double euInCaliFinalSpeed = euInCaliDriver.setAvgSpeed(50);
        if(euInCaliFinalSpeed == -1){
            System.out.println("Speed Limit exceeded");
        }else{
            double euInCaliFinalDistance = euInCaliDriver.calculateDistance(7);
            if(euInCaliFinalDistance == -1){
                System.out.println("Time Limit exceeded");
            }else{
                System.out.println("Cali distance (EU adapted) = " + euInCaliFinalDistance + " MILES.");
            }
        }
    }
}