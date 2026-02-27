package GarbageCollection.Eligibility;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Demo {
    public void finalize(){
        System.out.println("garbage collected!");
    }

    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
            Demo obj = new Demo();
            obj=null;
        }
        System.gc();//very less time only gc will run
    }
}
//first we are creating 10k objects and then declaring them as null
//so all of them are eligible for gc
//so we call system.gc where gc forcefully calls gc to collect all 10k objects but
//it is not necessary that all 10k objects will be removed