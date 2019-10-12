package by.etc.pwc.agregandcomp.car;


/**
 * Создать объект класса Автомобиль. Использую классы колесо, двигатель. Методы: ехать, заправлять
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Car {
    private String carBrand;
    private Engine engine;
    private Wheel[] wheels;
    private int fuel;

    public Car(String carBrand, int fuel, Engine engine) {
        this.carBrand = carBrand;
        this.fuel = fuel;
        this.engine = engine;
    }

    public void refulingCar() {
        if(fuel < 10) {
            fuel += 30;
            System.out.println("Done!");
        } else {
            System.out.println("The car is fueled");
        }
    }

    public void wheelReplacement() {
        for(Wheel wl: wheels) {
            String brand = wl.getWheelBrand();
            int dim = wl.getDim();

            if(wl.isBroken()) {
                wl = new Wheel();
                wl.setDim(dim);
                wl.setWheelBrand(brand);
            }
        }
    }

    public void move() {
        if ((engine != null)&&(wheels.length == 4)){
            System.out.println("Car moves.");
        } else {
            System.out.println("Cant cant move, check engine or wheels!");
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

    public static void main(String[] args) {
        Engine engine = new Engine("Mx");
        Car car = new Car("Mazda", 60, engine);
        car.setWheels(Wheel.createComplect("Nokian", 16, 4));
        System.out.println(car.getCarBrand());
        car.move();
    }
}
