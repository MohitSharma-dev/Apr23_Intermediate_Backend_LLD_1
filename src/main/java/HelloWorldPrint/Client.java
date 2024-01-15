package HelloWorldPrint;

public class Client {
    public static void main(String[] args) {
        // statement 1

        HelloWorldPrinter task1 = new HelloWorldPrinter();
        Thread t = new Thread(task1);
        t.start();
        System.out.println("Thread : " + Thread.currentThread().getName());
    }
}

// Runnable x = new _______ which implements run the method;
// Runnable x = task1;
// x.run();


// Task
// Print 1 -> 100 in different threads

// step 1
