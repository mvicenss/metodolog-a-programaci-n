package src.main.java.com;

public class Computer {
    private String ramType;
    private int ramCapacity;
    private String hardDriveType;
    private int hardDriveCapacity;
    private int screenDimension;
    private String screenQuality;

    public Computer(String ramType, int ramCapacity, String hardDriveType, int hardDriveCapacity, int screenDimension, String screenQuality) {
        this.ramType = ramType;
        this.ramCapacity = ramCapacity;
        this.hardDriveType = hardDriveType;
        this.hardDriveCapacity = hardDriveCapacity;
        this.screenDimension = screenDimension;
        this.screenQuality = screenQuality;
    }

    @Override
    public String toString(){
        return "Computer.java {" +
                "RAM: " + ramCapacity + "GB " + ramType + ", " +
                "Hard Drive: " + hardDriveCapacity + "GB " + hardDriveType + ", " +
                "Screen: " + screenDimension + "' " + screenQuality + "}";
    }
}