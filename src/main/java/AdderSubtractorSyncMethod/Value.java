package AdderSubtractorSyncMethod;

public class Value {
    public int value = 0;

    public synchronized void incrementBy(int x){
        value += x;
    }

    public synchronized void decrementBy(int x){
        value -= x;
    }
}
