package by.etc.smplclassobj.counter;


/**
 * Описать десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
 * в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными
 * значениями. Счетчик имеет методы увеличения и уменьшения состояния и метод позволяющий получать
 * текущее значение.Написать код демонстрирующий все возможности класса.
 */

public class Main {

    public static void main(String[] args) {
        CounterLogic logic = new CounterLogic();
        Counter counter = new Counter(10, 100, 1);

        logic.decreaseCount(counter);
        logic.increaseCount(counter);
    }
}
