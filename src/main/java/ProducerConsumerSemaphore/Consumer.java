package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore prodSema;
    private Semaphore consSema;

    Consumer(Store st, Semaphore prodSema, Semaphore consSema){
        this.store = st;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    @Override
    public void run() {
        while(true){
            try {
                consSema.acquire();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSema.release();
        }
    }
}
