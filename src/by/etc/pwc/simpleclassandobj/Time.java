package by.etc.pwc.simpleclassandobj;


import java.util.Scanner;

/**
 * Создать класс для представления времени. Предусмотрите возможность установки времени и изменения его
 * отдельных полей(час, минута, секунда) с проверкой допустимости вводимого. В случаа недопустимого
 * значения полей, поле установить в 0. Создать методы изменения времени на заданное количество часов,
 * минут, секунд
 */

public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute <= 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second >= 0 && second <= 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public void setTime() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hours: ");
        setHour(scanner.nextInt());
        System.out.println("Enter minutes: ");
        setMinute(scanner.nextInt());
        System.out.println("Enter seconds: ");
        setSecond(scanner.nextInt());

        System.out.println("Current time: " + this.toString());
    }

    public void changeTime(int hourChange, int minChange, int secChange) {
        setHour(this.hour + hourChange);
        setMinute(this.minute + minChange);
        setSecond(this.second + secChange);
    }

    public String toString() {
        String fullTime = String.format("%02d"+":"+"%02d"+":"+"%02d", getHour(), getMinute(), getSecond());
        return fullTime;
    }

    public static void main(String[] args) {
        Time time = new Time();
        time.setTime();
        time.changeTime(1,1,1);
        System.out.println("Time after changing: " +time.toString());
    }
}
