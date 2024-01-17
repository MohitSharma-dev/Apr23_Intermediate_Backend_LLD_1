package AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder x = new Adder(v);
        Subtractor y = new Subtractor(v);
        ExecutorService ec = Executors.newCachedThreadPool();

        Future<Void> adderFuture= ec.submit(x);
        Future<Void> subtractorFuture= ec.submit(y);

        // Wait for both the tasks to get completed
        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);
    }
}
