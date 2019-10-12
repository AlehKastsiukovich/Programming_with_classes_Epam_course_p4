package by.etc.pwc.simpleclassandobj;

/**
 * Создайте класс Test2 c двумя переменными. Добавит конструктор с входными параметрами.
 * Добавьте конструктов инициализирующий члены класса по умолчанию. Добавьте метод
 * set и get для полей экземпляра класса.
 */

public class Test2 {
    private int a;
    private int b;

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Test2() {

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2(1,2);
        int c = test2.getA();
        test2.setA(23);
    }
}
