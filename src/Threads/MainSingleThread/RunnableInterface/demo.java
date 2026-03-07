package Threads.MainSingleThread.RunnableInterface;

class MyTask implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }
}
public class demo{
    public static void main(String[] args) {
        MyTask obj = new MyTask(); //task not a thread
        Thread t1 = new Thread(obj); //thread 1
        Thread t2 = new Thread(obj); //thread 2
    }
}
