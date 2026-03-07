package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerVsBufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();//doesnt know if the reader will give the input or no
        // this will used by jvm itself
        //exception propagation means
    }
}
