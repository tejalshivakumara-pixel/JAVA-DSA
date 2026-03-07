package Threads.MainSingleThread.WaysOfCreatingThread;

class Mythread extends Thread { //this is one thread
    public void run(){
        System.out.println("Thread is running");
    }
}
public class Demo{
    public static void main(String[] args) { //this is a main thread
        Mythread t1 = new Mythread();//t1 is the thread that is getting created
        t1.start();//if you give run() here then it just becomes a local function which is called
    }
}
//with the start() function run() function also comes along
