package MULTITHREADING.part1;
//it helps to make sure that only 1 thread goes inside the particular section of code
//(synchronized)
public class MonitorLocks
{
    public synchronized void task1()
    {
        try
        {
            System.out.println("inside t1");
            Thread.sleep(10000);
            System.out.println("done");
        } catch (Exception e)
        {

        }
    }

    public void task2()
    {
        System.out.println("Before sync");
        synchronized (this)
        {
            System.out.println("inside synchronized");
        }
    }

    public void task3()
    {
        System.out.println("task3");
    }

}

class Moni
{
    public static void main(String[] args)
    {
        MonitorLocks obj = new MonitorLocks();
        Thread t1 = new Thread(() ->{
            obj.task1();
        });

        Thread t2 = new Thread(() ->{
            obj.task2();
        });

        Thread t3 = new Thread(() ->{
            obj.task3();
        });

        t1.start(); //this obj will get monitor lock and thread will sleep for x sec
        t2.start();//it will wait until then t1 completes the task bcz of t1 monitor lock
        t3.start();//this has no lock so it will print directly
    }
}
