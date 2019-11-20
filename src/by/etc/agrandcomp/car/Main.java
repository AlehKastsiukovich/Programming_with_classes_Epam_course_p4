package by.etc.agrandcomp.car;


/**
 * Создать объект класса Автомобиль. Использую классы колесо, двигатель. Методы: ехать, заправлять
 * менять колесо, вывести на консоль марку автомобиля.
 */

public class Main {

    public static void main(String[] args) {
        CarLogic logic = new CarLogic();
        Car car = new Car("Volvo", 50);
        Car.Engine engine = car.new Engine("606e");

        Wheel[] wheels = logic.createComplect("Nokian", 16, 4 , false);
        car.setWheels(wheels);
        car.setEngine(engine);

        System.out.println(logic.move(car));
    }
}
