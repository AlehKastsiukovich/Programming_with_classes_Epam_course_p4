package by.etc.smplclassobj.counter;


import java.util.Random;

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

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
