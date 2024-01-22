package ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;

    // concurrent DS

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
//        System.out.println("Producer produced time, current size " + this.items.size());
    }

    public void removeItem() {
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove();
//        System.out.println("Consumer item, current size " + this.items.size());
    }
}
