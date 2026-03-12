package Assignment;

    class Addition{
        int sum(int a , int b){
            return a+b;
        }
        int sum (int a ,int b,int c){
            return a+b+c;
        }
    }
    class Candy{
        void sour(){
            System.out.println("Candy is sour");
        }
    }
    class Waffers extends Candy{
        @Override
        void sour(){
            System.out.println("Candy is bitter");
        }
    }
    public class OverloadingOverriding{
       public static void main(String[] args) {
          Addition a1= new Addition();
          System.out.println("addtion of two numbers:"+a1.sum(2,5));
          System.out.println("addtion of two numbers:"+a1.sum(7,9));
          Candy c1= new Waffers();
          c1.sour();
        }
    }
