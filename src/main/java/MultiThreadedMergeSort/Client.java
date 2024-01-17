package MultiThreadedMergeSort;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(8, 1 , 6 , 2 , 3 , 9 ,7 , 5);
        ExecutorService ex = Executors.newCachedThreadPool();
        Sorter task = new Sorter(arr, ex);
        Future<List<Integer>> sortedArrayFuture = ex.submit(task);
        List<Integer> sortedArr = sortedArrayFuture.get();
        System.out.println(sortedArr);

    }
}
