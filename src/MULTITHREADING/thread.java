package MULTITHREADING;

public class thread extends  Thread
{
    @Override
    public void run()
    {
        System.out.println("code executes: " + Thread.currentThread().getName());
    }
}

class Main
{
    public static void main(String[] args) {
        thread t = new thread();
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
