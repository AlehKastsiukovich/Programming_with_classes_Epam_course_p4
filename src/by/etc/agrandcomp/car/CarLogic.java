package by.etc.agrandcomp.car;


public class CarLogic {

    public void refulingCar(Car car) {
        if (car.getFuel() < 10) {
            car.setFuel(car.getFuel() + 30);
            System.out.println("Done!");
        } else {
            System.out.println("The car is fueled");
        }
    }

    public void replaceWheel(Car car, Wheel wheel) {
        for (Wheel wl : car.getWheels()) {

            if (wl.isBroken()) {
                wl = wheel;
            }
        }
    }

    public boolean move(Car car) {
        if ((car.getEngine() != null) && (car.getWheels().length == 4)) {
            return true;
        }

        return false;
    }

    public Wheel[] createComplect(String wheelBrand, int dim, int num, boolean broken) {
        Wheel[] wheels = new Wheel[num];

        for (int i = 0; i < num; i++) {
            wheels[i] = new Wheel(wheelBrand, dim, broken);
        }

        return wheels;
    }
}
