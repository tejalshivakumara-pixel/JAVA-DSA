package Threads.MainSingleThread.ControlOverThread;
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Child:" + i);
            try {
                Thread.sleep(2000);//gives pause and starts the execution
            } catch (Exception e) {
            }
        }
    }
}
    public class Demo {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            t1.start();
        }
    }

