package testApplication.testTask.task3;

import java.util.Iterator;

public class NumberRepository implements Container{
    private Iterator source;
    private Number number;

    public NumberRepository(Iterator source, Number number) {
        this.source = source;
        this.number = number;
    }

    @Override
    public Iterator getIterator() {
        return new NumberIterator(source, number);
    }
}
