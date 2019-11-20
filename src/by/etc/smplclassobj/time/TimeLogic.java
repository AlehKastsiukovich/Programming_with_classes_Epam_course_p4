package by.etc.smplclassobj.time;


public class TimeLogic {

    public void changeTime(Time time, int hourChange, int minChange, int secChange) {
        time.setHour(time.getHour() + hourChange);
        time.setMinute(time.getMinute() + minChange);
        time.setMinute(time.getSecond() + secChange);
    }
}
