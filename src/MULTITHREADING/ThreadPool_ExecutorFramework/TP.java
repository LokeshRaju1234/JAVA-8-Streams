package MULTITHREADING.ThreadPool_ExecutorFramework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TP {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,1,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(10),new CustomThreadFactory(),new CustomRejectedHandler());
        executor.allowCoreThreadTimeOut(true);

        for(int i = 0;i < 25;i++)
        {
            executor.submit(()->{
                try
                {
                    Thread.sleep(5000);
                    System.out.println("Name" + Thread.currentThread().getName());
                }
                catch(Exception e)
                {

                }
            });
        }

        executor.shutdown();
    }
}
