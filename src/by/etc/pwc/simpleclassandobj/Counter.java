package by.etc.pwc.simpleclassandobj;


import java.util.Random;

/**
 * Описать десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
 * в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными
 * значениями. Счетчик имеет методы увеличения и уменьшения состояния и метод позволяющий получать
 * текущее значение.Написать код демонстрирующий все возможности класса.
 */

public class Counter {
    private int minRange;
    private int maxRange;
    private int count;

    public Counter() {
        this.minRange = 0;
        this.maxRange = 50;
        Random random = new Random();
        this.count = random.nextInt(50);
    }

    public Counter(int minRange, int maxRange, int count) {
        this.maxRange = minRange;
        this.maxRange = maxRange;
        this.count = count;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getCount() {
        return count;
    }

    public void increaseCount() {
        count++;
        if(count > maxRange) {
            System.out.println("You are out of range");
        }
    }

    public void decreaseCount() {
        count--;
        if(count < minRange) {
            System.out.println("You are out of range");
        }
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10,100, 40);
        counter1.increaseCount();
        counter2.decreaseCount();
    }
}
