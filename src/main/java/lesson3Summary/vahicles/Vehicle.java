package lesson3Summary.vahicles;

public abstract class Vehicle {
    private String serialNumber;
    private int maxVelocity;
    private EngineType engineType;


    public Vehicle(String serialNumber, int maxVelocity, EngineType engineType) {
        this.serialNumber = serialNumber;
        this.maxVelocity = maxVelocity;
        this.engineType = engineType;
    }

    public enum EngineType {
        ELECTRIC,
        DIESEL,
        GAS
    }

}
