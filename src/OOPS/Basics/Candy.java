package OOPS.Basics;

public class Candy {
    String Flavour;
    int number;
    String store;

    public Candy(String Flavour, int Num, String Store) {
        this.Flavour = Flavour;
        number = Num;
        store = Store;
    }

    public void candyNames() {
        System.out.println("Flavour of the candy is:" + this.Flavour);
        System.out.println("Number of candy bought:" + number);
        System.out.println("Name of the store the candy is bought from:" + store);
    }
}
class mainly{
    public static void main(String[]args){
        Candy c3=new Candy("Sour",13,"Departmental store");
        Candy c4=new Candy("Almond",14,"Grocery store");
        c3.candyNames();
        c4.candyNames();
    }
}