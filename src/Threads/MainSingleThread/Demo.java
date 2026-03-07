package Threads.MainSingleThread;

public class Demo {
    public void main(String[] args) {//her main is a thread
        System.out.println("Main thread started:");
        for(int i =0; i<5 ; i++){
            System.out.println("Main Thread:"+i);
        }
    }
}
