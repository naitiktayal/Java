public class threadlifecycle {

    public static void main(String[] args) {
        MyThread thread = new MyThread();

        System.out.println("Thread state (before start): " + thread.getState()); // New state

        thread.start();

        System.out.println("Thread state (after start): " + thread.getState()); // Runnable state (might be running as well)

        while (thread.getState() != Thread.State.TERMINATED) {
            // DO make the whilem 
            // Do something while the thread is running or waiting
            //DO write the bulb of snake
            //gfg hi the snake theard like 
            
        }

        System.out.println("Thread state (after termination): " + thread.getState()); // Terminated state
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread running...");
        // Simulate some work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
