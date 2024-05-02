package multithreadingAndConcurrency.producerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;


import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    private ConcurrentLinkedDeque items;

    public Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

//    public List<Objects> getItems() {
//        return items;
//    }

//    public void setItems(List<Objects> items) {
//        this.items = items;
//    }

    public void addItem() {
        this.items.add(new Object());
        System.out.println("Item Produced. New Count: " + this.items.size());
    }

    public void removeItem() {
        this.items.remove(0);
        System.out.println("Item Consumed. New Count: " + this.items.size());
    }
}
