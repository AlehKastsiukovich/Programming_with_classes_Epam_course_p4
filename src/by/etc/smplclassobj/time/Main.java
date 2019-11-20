package by.etc.smplclassobj.time;


/**
 * Создать класс для представления времени. Предусмотрите возможность установки времени и изменения его
 * отдельных полей(час, минута, секунда) с проверкой допустимости вводимого. В случаа недопустимого
 * значения полей, поле установить в 0. Создать методы изменения времени на заданное количество часов,
 * минут, секунд
 */

public class Main {

    public static void main(String[] args) {
        TimeView view = new TimeView();
        TimeLogic logic = new TimeLogic();
        Time time = new Time();

        time.setHour(10);
        time.setMinute(14);
        time.setSecond(32);

        view.printTime(time);

        logic.changeTime(time, 2, 4, 6);

        view.printTime(time);
    }
}
