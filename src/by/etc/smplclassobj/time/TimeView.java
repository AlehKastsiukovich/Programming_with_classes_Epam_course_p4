package by.etc.smplclassobj.time;

public class TimeView {

    public void printTime(Time time) {
        System.out.println(String.format("%02d" + ":" + "%02d" + ":" + "%02d",
              + time.getHour(), time.getMinute(), time.getSecond()));
    }
}
