package by.etc.agrandcomp.car;



public class Car {
    private String carBrand;
    private Engine engine;
    private Wheel[] wheels;
    private int fuel;

    public Car(String carBrand, int fuel) {
        this.carBrand = carBrand;
        this.fuel = fuel;
    }

    public class Engine {
        private String brand;

        public Engine(String brand) {
            this.brand = brand;
        }
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
