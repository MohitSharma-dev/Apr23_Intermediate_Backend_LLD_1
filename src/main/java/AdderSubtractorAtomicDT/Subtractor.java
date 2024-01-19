package AdderSubtractorAtomicDT;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    Subtractor(Value x){
        v = x;
    }

    public Void call (){
        for(int i = 1;i <=5000; i++){
//            if(i == 100){
//                System.out.println("Adasd");
//            }
            this.v.value.addAndGet(-i);
        }
        return null;
    }
}
