package by.etc.smplclassobj.triangle;


import java.util.Scanner;

public class TriangleLogic {

    public void initCoordinates(Triangle triangle) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("coordinates of A: ");
        triangle.setxA(scanner.nextDouble());
        triangle.setyA(scanner.nextDouble());

        System.out.println("coordinates of B: ");
        triangle.setxB(scanner.nextDouble());
        triangle.setyB(scanner.nextDouble());

        System.out.println("coordinates of C");
        triangle.setxC(scanner.nextDouble());
        triangle.setyC(scanner.nextDouble());
    }

    public Triangle createTriangle() {
        Triangle triangle = new Triangle();
        initCoordinates(triangle);

        double a = Math.sqrt(Math.pow(triangle.getxA() - triangle.getxB(), 2) + Math.pow(triangle.getyA() - triangle.getyB(), 2));
        double b = Math.sqrt(Math.pow(triangle.getxA() - triangle.getxC(), 2) + Math.pow(triangle.getyA() - triangle.getyC(), 2));
        double c = Math.sqrt(Math.pow(triangle.getxB() - triangle.getxC(), 2) + Math.pow(triangle.getyB() - triangle.getyC(), 2));

        triangle.setA(a);
        triangle.setB(b);
        triangle.setC(c);

        return triangle;
    }

    public double triangleArea(Triangle triangle) {
        double p = (trianglePerimeter(triangle)) / (2.0);
        double area = Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));
        return area;
    }

    public double trianglePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    public double[] intersectionPointMed(Triangle triangle) {
        double[] point = new double[2];

        double xMed = (triangle.getxA() + triangle.getxB() + triangle.getxC()) / 3.0;
        double yMed = (triangle.getyA() + triangle.getyB() + triangle.getyC()) / 3.0;

        return point;
    }
}
