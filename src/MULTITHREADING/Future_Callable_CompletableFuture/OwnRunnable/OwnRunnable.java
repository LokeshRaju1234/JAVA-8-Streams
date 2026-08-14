package MULTITHREADING.Future_Callable_CompletableFuture.OwnRunnable;

import java.util.List;

public class OwnRunnable implements Runnable{

    List<Integer> list;

    public OwnRunnable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        list.add(300);
    }
}
