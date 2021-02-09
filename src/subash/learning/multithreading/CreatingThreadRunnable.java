package subash.learning.multithreading;

public class CreatingThreadRunnable implements  Runnable {

    @Override
    public void run() {
        int i =0;
        while(i <100) {
            System.out.println("My First Thread....");
            i++;
        }
    }

    public static void main(String[] args) {

        Runnable  creatingThreadRunnable = new CreatingThreadRunnable();
        //Need to create an instance of task that has its own thread and pass that to thread
        Thread task = new Thread(creatingThreadRunnable);
        task.start();
        System.out.println("This is the main thread");
    }
}
