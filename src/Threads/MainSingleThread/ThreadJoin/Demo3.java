package Threads.MainSingleThread.ThreadJoin;
class Mythread extends Thread {
    Thread other;//we are creating a thread attribute here

    Mythread(Thread other) {//because attribute is present we are having constructor
        this.other = other;
    }

    public void run() {
        try {
            if (other != null) {
                other.join();
            }
        } catch (Exception e) {
        }
        System.out.println(Thread.currentThread().getName() + "Finished");
    }
}
public class Demo3 {
    public static void main(String[] args) {
       Mythread t1 = new Mythread((null));
        Mythread t2 = new Mythread(t1);
        t1.start();
        t2.start();
    }
}
