package by.etc.pwc.simpleclassandobj;


import java.util.Scanner;

/**
 * Описать класс определяющий треугольник. Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки пересечения медианы.
 */

public class Triangle {
    private double xA;
    private double xB;
    private double xC;
    private double yA;
    private double yB;
    private double yC;

    private double a;
    private double b;
    private double c;

    public double getxA() {
        return xA;
    }

    public void setxA(double xA) {
        this.xA = xA;
    }

    public double getxB() {
        return xB;
    }

    public void setxB(double xB) {
        this.xB = xB;
    }

    public double getxC() {
        return xC;
    }

    public void setxC(double xC) {
        this.xC = xC;
    }

    public double getyA() {
        return yA;
    }

    public void setyA(double yA) {
        this.yA = yA;
    }

    public double getyB() {
        return yB;
    }

    public void setyB(double yB) {
        this.yB = yB;
    }

    public double getyC() {
        return yC;
    }

    public void setyC(double yC) {
        this.yC = yC;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void initCoordinates() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("coordinates of A: ");
        setxA(scanner.nextDouble());
        setyA(scanner.nextDouble());

        System.out.println("coordinates of B: ");
        setxB(scanner.nextDouble());
        setyB(scanner.nextDouble());

        System.out.println("coordinates of C");
        setxC(scanner.nextDouble());
        setyC(scanner.nextDouble());
    }

    public static Triangle createTriangle() {
       Triangle triangle = new Triangle();
       triangle.initCoordinates();

        double a = Math.sqrt(Math.pow(triangle.getxA() - triangle.getxB(),2) + Math.pow(triangle.getyA() - triangle.getyB(),2));
        double b = Math.sqrt(Math.pow(triangle.getxA() - triangle.getxC(),2) + Math.pow(triangle.getyA() - triangle.getyC(),2));
        double c = Math.sqrt(Math.pow(triangle.getxB() - triangle.getxC(),2) + Math.pow(triangle.getyB() - triangle.getyC(),2));

       triangle.setA(a);
       triangle.setB(b);
       triangle.setC(c);

       return triangle;
    }

    public double findArea() {
        double p = (findPerimeter())/(2.0);
        double sqrt = Math.sqrt(p * (p - this.getA()) * (p - this.getB()) * (p - this.getC()));
        return sqrt;
    }

    public double findPerimeter() {
        return getA() + getB() + getC();
    }

    public void intersectionPointMed() {
        double xMed = (getxA() + getxB() + getxC()) / 3.0;
        double yMed = (getyA() + getyB() + getyC()) / 3.0;
        System.out.println(String.format("%.2f %.2f",xMed, yMed));
    }

    public static void main(String[] args) {
        Triangle tr = createTriangle();
        System.out.println(String.format("%.2f", tr.findArea()));
        tr.intersectionPointMed();
    }
}
