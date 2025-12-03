
public class Main {
    public static void main(String[] args) {
        MediaMarkt shop = new MediaMarkt(); //ConcreteSubject

        //Observers with their name + interests
        Client pablo = new Client("Pablo", "smartphones", null, null);
        Client victor = new Client("Victor", "consoles", null, null);
        Client tom = new Client("Tom", "smartphones", "PCs", "consoles");

        //Subscribe observers to ConcreteSubject
        shop.attach(pablo);
        shop.attach(victor);
        shop.attach(tom);

        //Promotion -- newPromotion will call notifiyAllObservers
        //Said method will check if a certain observer is interested in the productType -- If it is, it will send a notif.
        shop.newPromotion("smartphones", "🔥 50% off on Samsung Galaxy!");
        shop.newPromotion("consoles", "🎮 PS5 now available!");
    }
}
