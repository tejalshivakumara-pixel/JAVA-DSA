package Threads.MainSingleThread.ThreadJoin;
class MyTask implements Runnable{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Child is running");
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        MyTask m = new MyTask();
        Thread t1 = new Thread(m);
        t1.start();
        try{
            t1.join();
        }catch(Exception e){}

    }
}
