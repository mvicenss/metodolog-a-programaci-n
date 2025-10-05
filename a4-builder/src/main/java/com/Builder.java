package src.main.java.com;

//general interface
public interface Builder{
    //these are like setters
    void buildRamType(String ramType);
    void buildRamCapacity(int ramCapacity);
    void buildHardDriveType(String hardDriveType);
    void buildHardDriveCapacity(int  hardDriveCapacity);
    void buildScreenDimensions(int screenDimensions);
    void buildScreenQuality(String screenQuality);
}