package MULTITHREADING.Future_Callable_CompletableFuture.CompletableFuture;

import jdk.jfr.Threshold;

import java.util.concurrent.*;

public class Completablefuture
{
    public static void main(String[] args) {
    ThreadPoolExecutor executor1 = new ThreadPoolExecutor(1,1,1,
            TimeUnit.SECONDS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

    CompletableFuture<String> asyncTask = CompletableFuture.supplyAsync(()->{
        return "Task completed";
    },executor1);//giving executor so that it will pick the thread from it orelse it uses default ThreadPool

    try{

        System.out.println(asyncTask.get());
    } catch (Exception e)
    {

    }

    //methods for method chaining
        //ṭhenapply method is synchronous method means one after another will execute
        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(()->{
            return "Task is going on";
        },executor1).thenApply((String val)->{
            return val + " and completed";
        });

        try {
            System.out.println(asyncTask1.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        //thenapplyasync -> which will do the task asynchronously and ordering cant be
        //guaranteed bcz they run concurrently
        try {
            ThreadPoolExecutor executor2 = new ThreadPoolExecutor(1,1,1,
                    TimeUnit.SECONDS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> comp = CompletableFuture.supplyAsync(() -> {
                try {
                    System.out.println("Supply Async method " + Thread.currentThread().getName());
                    Thread.sleep(5000);
                } catch (Exception e) {
                }
                return "Task completed";
            }, executor2);

            CompletableFuture<String> comp1 = comp.thenApply((String val) -> {
                System.out.println("Thread name of thenApply " + Thread.currentThread().getName());
                return val + " completed";
            }).thenApplyAsync((String val)-> {
                System.out.println("Async thread " + Thread.currentThread().getName());
                return val + " Dusted";
            },executor2);
            try{
                System.out.println(comp1.get());
            }catch (Exception e){}
        }catch (Exception e){}

        CompletableFuture<String> obj = CompletableFuture.supplyAsync(()->{
            System.out.println("async task practice: ");
            return "val";
        },executor1).thenApplyAsync((String val)->{
            return val + " i will";
        },executor1).thenApplyAsync((String val)-> {
            return val + " do it";
        },executor1).thenApplyAsync((String val)-> {
            return val + " no matter what";
        },executor1);

        try {
            System.out.println(obj.get());
        } catch (Exception e){}

        //thencompose and thencomposeasync
        //for async tasks we can bring some ordering using this
        CompletableFuture<String> t1 = CompletableFuture.supplyAsync(()->{
            System.out.println("Thencompose " + Thread.currentThread().getName());
            return "concept and ";
        },executor1).thenCompose((String val)-> {
            return CompletableFuture.supplyAsync(()->{
                System.out.println("Thread in compose " + Thread.currentThread().getName());
                return val + "coding";
            },executor1);
        });
        try {
            System.out.println(t1.get());
        } catch (Exception e){}
    }

}
