package AdderSubtractorSyncKeyword;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock;
    Adder(Value x, Lock lock){
        v = x;
        this.lock = lock;
    }
    public Void call (){
//        lock.lock();
        for(int i = 1;i <=100; i++){
            synchronized (v) {
                System.out.println("Adder acquired the Lock at" + i);
                this.v.value += i;
            }
        }
//        lock.unlock();
        return null;
    }
}


// int -> Integer
// void -> Void
