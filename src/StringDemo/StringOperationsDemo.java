package StringDemo;

public class StringOperationsDemo {
    public static void main(String[] args) {
        String s1 = "Java program";
        String s2 = new String("java program");
        System.out.println("String is" + s1);
        //Lenght()
        System.out.println(" length is" + s1.length());
        //char()
        System.out.println(" charater at index 2 is " + s1.charAt(2));
        //toupper
        System.out.println(" UPPERCASE:" + s1.toUpperCase());
        //toLower()
        System.out.println(" LOWERCASE:" + s1.toLowerCase());
        //equals() and ==
        System.out.println(" using ==:" + s1 == s2);
        System.out.println(" using equal():" + s1.equals(s2));
        //Compare to
        System.out.println(" Using CompareTo(): " + s1.compareTo(s2));
        //substring()
        System.out.println(" substring(0 to 4):" + s1.substring(0, 4));
        //contain()
        System.out.println(" contains 'Programm':" + s1.contains("Programm"));
        //indexOf()
        System.out.println("Index of 'a' :" + s1.indexOf('a'));
        //replace
        System.out.println(" Replace Java with python " + s1.replace("java", "python"));
        //startwith() and endwith()
        System.out.println(" Start with Java " + s1.startsWith("Java"));
        System.out.println("Ends  with nming " + s1.endsWith("nming"));
        //trim()
        String s3 = "    Tejal     ";
        System.out.println("Before trim " + s3);
        System.out.println("After trim " + s3.trim());
        //concat()
        System.out.println("Concat():" + s1.concat("Language"));
        //isempty
        String str = "";
        System.out.println("Is empty" + str.isEmpty());
        //split
        String sentence = "Java is a very easy Language to learn!";
        String arr[] = sentence.split(" ");

        for (String i : arr) {
            System.out.println(i);
        }
    }
}








