package src.main.java.com;

import java.util.Random;

//Logic class -- "Real objects"
public class SensorLogic implements SensorDevice {

    private String type;
    private String unit;
    Random random = new Random(); //to generate random data value

    public SensorLogic(String type, String unit) {
        this.type = type;
        this.unit = unit;
    }

    @Override
    public double readData() {

        //simulate fetching the values from the sensor
        try{
            Thread.sleep(2000); //2s
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        //random value for sensor
        double value = 0;
        if(type.equals("Humidity")){
            value = 30 + random.nextDouble()*40;
        }else if(type.equals("Wind")){
        value = random.nextDouble()*30;
        }else if(type.equals("UV index")){
            value = random.nextDouble()*11;
        }

        value = Math.round(value*100.0)/100.0;
        System.out.println("[Real Sensor] Data received: " + value + " " + unit);

        return value;
    }

}
