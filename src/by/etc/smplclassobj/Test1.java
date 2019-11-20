package by.etc.smplclassobj;


/**
 * Создайте класс Test1 c двумя переменными. Добавьте метод вывода на экран и методы
 * изменения этих переменных. Добавьте метод которых находит сумму значений этих переменных
 * и метод который находит наибольшее значение из этих двух переменных.
 */

public class Test1 {
    private int a;
    private int b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printVar() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public int sumOfVar() {
        int sum = a + b;

        return sum;
    }

    public int maxOfVar() {
        return a > b ? a : b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1(5, 10);
        test1.printVar();

        System.out.println("Sum of var is " + test1.sumOfVar());
        System.out.println("Max var is " + test1.maxOfVar());
    }
}
