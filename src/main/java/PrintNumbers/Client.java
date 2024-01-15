package PrintNumbers;

public class Client {
    public static void main(String[] args) {
        for(int i = 1;i <= 1000000; i+= 1){
            PrintNumber task = new PrintNumber(i);
            Thread t = new Thread(task);
            t.start();
        }
    }
}
