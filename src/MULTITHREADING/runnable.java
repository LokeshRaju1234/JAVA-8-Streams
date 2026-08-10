package MULTITHREADING;

public class runnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("code executed by thread "+ Thread.currentThread().getName());
    }
}

class conc
{
    public static void main(String[] args)
    {
        System.out.println("Going inside main method " + Thread.currentThread().getName());
        runnable ob = new runnable();
        Thread th = new Thread(ob);
        th.start();//it starts the thread and internally it is calling running method

        System.out.println("Finished main: " + Thread.currentThread().getName());
    }
}
