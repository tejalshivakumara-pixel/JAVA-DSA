package StringDemo.StringBufferBuilder;

public class StringBufferExample {
        public void stringAppend() {
            StringBuffer sb = new StringBuffer("Hello");
            System.out.println("Old string :" + sb);
            sb.append("World");
            System.out.println("New string :" + sb);
        }

        public void stringInsert() {
            StringBuffer sb = new StringBuffer("hello");
            System.out.println("Enter old string:" + sb);
            sb.insert(1, "oo");
            System.out.println("Enter new string:" + sb);
        }

        public static void main(String[] args) {
            StringBufferExample obj = new StringBufferExample();
            obj.stringAppend();
            obj.stringInsert();
        }
    }

