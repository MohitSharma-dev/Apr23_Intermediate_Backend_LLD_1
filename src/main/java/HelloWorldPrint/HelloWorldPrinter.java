package HelloWorldPrint;

public class HelloWorldPrinter implements Runnable{
    public void doSomething(){
        // statement 3
        System.out.println("DO something " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        // within the run method, define the task
        // statement 2
        System.out.println("Hello World! " + Thread.currentThread().getName());
        doSomething();
    }
}
