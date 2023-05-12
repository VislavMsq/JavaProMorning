package lesson3Summary.vahicles;

public class Motorbike extends Vehicle{
    private boolean sidecar = false;

    public Motorbike(String serialNumber, int maxVelocity, EngineType engineType) {
        super(serialNumber, maxVelocity, engineType);
    }

    public Motorbike(String serialNumber, int maxVelocity, EngineType engineType, boolean sidecar) {
        super(serialNumber, maxVelocity, engineType);
        this.sidecar = sidecar;
    }


    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }
}
