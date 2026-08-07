package MULTITHREADING.part1;
class sharedResource
{
    boolean itemAvailable = false;

    public synchronized void addItem()
    {
        itemAvailable = true;
        System.out.println("Item added by: " + Thread.currentThread().getName() + " and invoking " +
                "all threads");
        notifyAll();//all waiting threads will wake up
    }

    public synchronized void consumeItem()
    {
        System.out.println("ConsumeItem method invoked by: " + Thread.currentThread().getName());

        //using while loop to avoid spurious wake up,Sometimes bcz of system noise
        while(!itemAvailable)
        {
            try
            {
                System.out.println("Thread" + Thread.currentThread().getName() + " is waiting now");
                wait();// releases all monitor locks
            } catch (Exception e)
            {

            }
        }

        System.out.println("Item consumed by: " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}

class ProduceTask implements Runnable
{
    sharedResource res;
    ProduceTask(sharedResource sharedResource)
    {
        this.res = sharedResource;
    }

    @Override
    public void run() {
        System.out.println("Producer Thread: " + Thread.currentThread().getName());
        try{
            Thread.sleep(50002);
        }catch (Exception e)
        {

        }

        res.addItem();
    }
}

class ConsumeItem implements Runnable
{
    sharedResource res;
    ConsumeItem(sharedResource sharedResource)
    {
        this.res = sharedResource;
    }


    @Override
    public void run() {
        System.out.println("Consumer Thread: " + Thread.currentThread().getName());
        res.consumeItem();
    }
}
public class ThreadAllMethods
{
    public static void main(String[] args) {
        System.out.println("Main method");

        sharedResource res = new sharedResource();
        Thread producerThread = new Thread(new ProduceTask(res));
        Thread consumerThread = new Thread(new ConsumeItem(res));

        producerThread.start();
        consumerThread.start();
        System.out.println("Main method");
    }
}
