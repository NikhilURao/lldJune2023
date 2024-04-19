package multithreadingAndConcurrency.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> display;

    Store(int max) {
        this.maxSize = max;
        this.display = new ArrayList<Object>();
    }

    void addItem(Object o) {
        display.add(o);
    }

    void removeItem() {
        display.remove(display.size()-1); // 0-1 = -1
    }

    int getMaxSize() {
        return this.maxSize;
    }

    int setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        return maxSize;
    }

    int getDisplaySize() {
        return this.display.size();
    }


}
