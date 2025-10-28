package src.main.java.com;

import java.util.HashMap;

//Pool of intrinsic state objects (objects for common info/states)
public class FlyweightFactory {

    HashMap<String,Flyweight> flyweightPool = new HashMap<>();
    //Using String to identify Taxi, Bus or Police as Keys
    //Using Flyweight as value to allow all 3 concrete flyweights to be in the hashMap

    public Flyweight getFlyweight(String vehicleType) {

        if (flyweightPool.containsKey(vehicleType)) {
            return flyweightPool.get(vehicleType); //return existing flyweight (object with arguments common to all of its type)
        }else{
            Flyweight fw;
            switch (vehicleType.toLowerCase()) {
                case "taxi":
                    fw = new ConcreteFlyweightTaxi("Taxi", "yellow", "taxi");
                    break;
                case "bus":
                    fw = new ConcreteFlyweightBus("Bus", "light_blue", "bus");
                    break;
                case "police":
                    fw = new ConcreteFlyweightPolice("Police", "dark_blue", "police");
                    break;
                default:
                    throw new IllegalArgumentException("Unknown vehicle type");
            }
            flyweightPool.put(vehicleType, fw); //Add new flyweight to pool
            return fw;
        }

    }

}
