package AdderSubtractorAtomicDT;

import java.util.concurrent.atomic.AtomicInteger;

public class Value {
    public AtomicInteger value = new AtomicInteger(0);
}

// int => AtomicInteger

// x += i;
// t <- x
// t += i
// t -> x

// single instruction