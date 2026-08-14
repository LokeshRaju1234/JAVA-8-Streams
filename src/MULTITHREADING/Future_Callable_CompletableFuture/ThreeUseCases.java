package MULTITHREADING.Future_Callable_CompletableFuture;

import MULTITHREADING.ThreadPool_ExecutorFramework.CustomRejectedHandler;
import MULTITHREADING.ThreadPool_ExecutorFramework.CustomThreadFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreeUseCases {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,1,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(10),new CustomThreadFactory(),new CustomRejectedHandler());
//        executor.allowCoreThreadTimeOut(true);

        //use case 1
        Future<?> futobj1 = executor.submit(()->{
            System.out.println("Task1 with Runnable");
        });

        try
        {
            Object obj = futobj1.get();
            System.out.println(obj == null); //true bcz Runnable doesnt return anything
        }catch (Exception e)
        {

        }

        //use case 2
        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> futobj2 = executor.submit(()->
        {
            output.add(100);
            System.out.println("Task2 with Runnable and return object");
        },output);//submit(Runnable,result)

        try
        {
            List<Integer> outputfutobj2 = futobj2.get();
            System.out.println(outputfutobj2.get(0));
        } catch(Exception e)
        {

        }

        //use case 3
        Future<List<Integer>> futobj = executor.submit(()->{
            List<Integer> out = new ArrayList<>();
            out.add(300);
            return out;
        });

        try
        {
            List<Integer> out = futobj.get();
            System.out.println(out.get(0));
        }catch (Exception e){}

        executor.shutdown();
    }
}
