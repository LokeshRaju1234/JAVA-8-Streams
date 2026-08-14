package MULTITHREADING.Future_Callable_CompletableFuture.OwnRunnable;

import MULTITHREADING.ThreadPool_ExecutorFramework.CustomRejectedHandler;
import MULTITHREADING.ThreadPool_ExecutorFramework.CustomThreadFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,1,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(10),new CustomThreadFactory(),new CustomRejectedHandler());
//        executor.allowCoreThreadTimeOut(true);

        List<Integer> out = new ArrayList<>();
      Future<List<Integer>> fut =  executor.submit(new OwnRunnable(out),out);

        try
        {
            fut.get();
            //1 way
            System.out.println(out.get(0));

            //2 way
            List<Integer> out1 = fut.get();
            System.out.println(out1.get(0));
        }catch (Exception e){}

    }
}
