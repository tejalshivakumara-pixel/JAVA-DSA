package Threads.MainSingleThread.ThreadJoin;
class MyThread extends Thread{ //here thread and mythread are the same
    //implements cant be written here because it doesnt support multiple threads
    public void run(){
        for(int i =1;i<=5;i++){
            System.out.println("child :"+i);
        }
    }
}
public class Demo {
    public static void main(String[] args) {//here we can also write throws exception because of which the
        // exception will be given to JVM
        //throws are the exception handled by JVm whereas throw is the exception handled by us
        MyThread t1 = new MyThread();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){}
    }
}
