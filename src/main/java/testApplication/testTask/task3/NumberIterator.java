package testApplication.testTask.task3;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public class NumberIterator implements Iterator {

    private Iterator source;
    private Number numberLimit;

    private boolean stopFlag = false;

    public NumberIterator() {
    }

    public NumberIterator(Iterator source, Number numberLimit) {
        this.source = source;
        this.numberLimit = numberLimit;
    }

    @Override
    public boolean hasNext() {
        if (stopFlag) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            Number currentNumber = (Number) source.next();
            if (currentNumber.longValue() < numberLimit.longValue()) {
                return currentNumber;
            } else {
                stopFlag = true;
            }
        }
        return null;
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Objects.requireNonNull(action);
        while (hasNext()) {
            Object next = next();
            if (next != null) {
                action.accept(next);
            }
        }
    }
}
