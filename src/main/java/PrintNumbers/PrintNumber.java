package PrintNumbers;

public class PrintNumber implements Runnable{
    int noToPrint;
    PrintNumber(int x){
        this.noToPrint = x;
    }
    @Override
    public void run() {
        System.out.println("Number : " + noToPrint + " Thread : " + Thread.currentThread().getName());
    }
}
