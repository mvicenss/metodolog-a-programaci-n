package src.main.java.com;

import java.util.concurrent.ThreadLocalRandom;

public class Client{
    void main (String[] args){

        Flyweight taxi = new ConcreteFlyweightTaxi("Taxi", "yellow", "taxi");
        Flyweight bus = new ConcreteFlyweightBus("Bus", "light_blue", "bus");
        Flyweight police = new ConcreteFlyweightPolice("Police", "dark_blue", "police");

        System.out.println("== Rendering vehicles... === ");

        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        for (int i = 0; i < 2; i++) {
            int x = rnd.nextInt(0, 1001);
            int y = rnd.nextInt(0, 1001);
            double speed = Math.round(rnd.nextDouble(20.0, 121.0) * 100.0) / 100.0;
            int direction = rnd.nextInt(0, 360);
            taxi.render(x, y, speed, direction);
        }

        for (int i = 0; i < 2; i++) {
            int x = rnd.nextInt(0, 1001);
            int y = rnd.nextInt(0, 1001);
            double speed = Math.round(rnd.nextDouble(20.0, 81.0) * 100.0) / 100.0;
            int direction = rnd.nextInt(0, 360);
            bus.render(x, y, speed, direction);
        }

        {
            int x = rnd.nextInt(0, 1001);
            int y = rnd.nextInt(0, 1001);
            double speed = Math.round(rnd.nextDouble(20.0, 121.0) * 100.0) / 100.0;
            int direction = rnd.nextInt(0, 360);
            police.render(x, y, speed, direction);
        }

    }
}