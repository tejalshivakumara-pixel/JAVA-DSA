package StringDemo.StringBufferBuilder;
public class StringBuilderExample {
    public void stringAppend() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Old string :" + sb);
        sb.append("World");
        System.out.println("New string :" + sb);
    }
    public void stringInsert() {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("Enter old string:" + sb);
        sb.insert(1, "oo");
        System.out.println("Enter new string:" + sb);
    }
    public static void main(String[] args) {
        StringBuilderExample obj = new StringBuilderExample();
        obj.stringAppend();
        obj.stringInsert();
    }
}
