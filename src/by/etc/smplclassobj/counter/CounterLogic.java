package by.etc.smplclassobj.counter;


public class CounterLogic {

    public boolean increaseCount(Counter counter) {
        counter.setCount(counter.getCount() + 1);

        if(counter.getCount() > counter.getMaxRange()) {
            return false;
        }

        return true;
    }

    public boolean decreaseCount(Counter counter) {
        counter.setCount(counter.getCount() - 1);

        if(counter.getCount() < counter.getMinRange()) {
           return false;
        }

        return true;
    }
}
