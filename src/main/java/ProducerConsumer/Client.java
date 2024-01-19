package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);
        for(int i = 1; i<=8; ++i){
            ex.execute(new Producer(store));
        }
        for(int i = 1 ; i <=20; ++i){
          ex.execute(new Consumer(store));
        }
    }

}
