package MULTITHREADING.Future_Callable_CompletableFuture;

import MULTITHREADING.ThreadPool_ExecutorFramework.CustomRejectedHandler;
import MULTITHREADING.ThreadPool_ExecutorFramework.CustomThreadFactory;

import java.util.concurrent.*;

public class FT {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
//        executor.allowCoreThreadTimeOut(true);
//
//   Future<?> fut =  executor.submit(() ->{
//            System.out.println("This is the task which thread will execute");
//        });
//        try
//        {
//            fut.get();
//        }
//        catch (Exception e)
//        {
//
//        }
//        System.out.println(fut.isDone());
//

        Future<?> futobj = executor.submit(() ->{
            try
            {
                Thread.sleep(7000);
                System.out.println("this is the task running from obj1");
            } catch (Exception e)
            {

            }
        });
        System.out.println(futobj.isDone());
        try
        {
            futobj.get(2,TimeUnit.SECONDS);
        }catch (TimeoutException e)
        {
            System.out.println("Exception timeout");
        } catch (Exception e)
        {

        }

        try
        {
            futobj.get();//it will wait until the task is completed
        }catch (Exception e)
        {

        }

        System.out.println(futobj.isDone()); //Yes
        System.out.println(futobj.isCancelled());//No it completed naturally
    }
}
