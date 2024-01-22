package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;
    Producer(Store st, Semaphore prodSema, Semaphore consSema) {
        this.store = st;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    @Override
    public void run() {
        while(true){
            try {
                prodSema.acquire();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consSema.release();
        }
    }
}

// acquire -> count --
// release -> count ++;

// prodSema = 5
// prodSema = 5 - 1 = 4
// consSema = 0
// consSema = 0 + 1 = 1