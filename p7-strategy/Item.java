public class Item {

    //Item to buy

    private String upcCode;
    private int price;

    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }

    //get barcode
    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

}
