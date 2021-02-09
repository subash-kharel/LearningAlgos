package subash.learning.multithreading;
//new thread can be create by extending thread.
public class CreatingThreadExtendingThread extends Thread{

    public void run(){
        int i =0;
        while(i <100) {
            System.out.println("My First Thread....");
            i++;
        }
    }

    public static void main(String[] args) {
        //what ever we write here will be executed in main thread
        //thread always executes jobs in sequence
        //Execution Context
        CreatingThreadExtendingThread creatingThreadExtendingThread = new CreatingThreadExtendingThread();
       //doing this will trigger the run method that is overriden inside the new thread.
        creatingThreadExtendingThread.start();
        //Main thread and CreatingThreadExtendingThread are running parallelly and concurrently.
        //So the order of the printouts are different every time.
        System.out.println("This is the main thread");
    }
}
