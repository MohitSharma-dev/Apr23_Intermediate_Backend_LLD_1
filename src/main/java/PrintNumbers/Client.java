package PrintNumbers;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
//        ExecutorService ex1 = Executors.newFixedThreadPool();
        for(int i = 1;i <= 10000000; i+= 1){
            if(i == 80){
                System.out.println("somethign");
            }
            PrintNumber task = new PrintNumber(i);
//            task.run();
            ex.execute(task);
//            Thread t = new Thread(task);
//            t.start();
        }
    }
}



