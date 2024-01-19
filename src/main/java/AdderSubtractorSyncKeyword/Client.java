package AdderSubtractorSyncKeyword;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Lock lock = new ReentrantLock();
        Value v = new Value();
        // Both the tasks need to have the same lock
        Adder x = new Adder(v, lock);
        Subtractor y = new Subtractor(v, lock);
        ExecutorService ec = Executors.newCachedThreadPool();

        Future<Void> adderFuture= ec.submit(x);
        Future<Void> subtractorFuture= ec.submit(y);

        // Wait for both the tasks to get completed
        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);
    }
}
