package src.main.java.com;

public class AbstractComputerBuilder implements Builder{
    protected int ramCapacity;
    protected String ramType;
    protected int hardDriveCapacity;
    protected String hardDriveType;
    protected int screenDimension;
    protected String screenQuality;

    //Setters = set value for different
    @Override
    public void buildRamType(String ramType) {
        this.ramType = ramType;
    }
    @Override
    public void buildRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }
    @Override
    public void buildHardDriveType(String hardDriveType) {
        this.hardDriveType = hardDriveType;
    }
    @Override
    public void buildHardDriveCapacity(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }
    @Override
    public void buildScreenDimensions(int screenDimensions) {
        this.screenDimension = screenDimension;
    }
    @Override
    public void buildScreenQuality(String screenQuality) {
        this.screenQuality = screenQuality;
    }

    @Override
    public String toString(){
        return "Computer {" +
                "RAM: " + ramCapacity + "GB " + ramType + ", " +
                "Hard Drive: " + hardDriveCapacity + "GB " + hardDriveType + ", " +
                "Screen: " + screenDimension + "' " + screenQuality + "}";
    }
}
