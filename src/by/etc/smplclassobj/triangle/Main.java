package by.etc.smplclassobj.triangle;


/**
 * Описать класс определяющий треугольник. Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки пересечения медианы.
 */

public class Main {

    public static void main(String[] args) {
        TriangleLogic logic = new TriangleLogic();
        Triangle triangle = logic.createTriangle();

        System.out.println(logic.triangleArea(triangle));
        System.out.println(logic.triangleArea(triangle));
    }
}
