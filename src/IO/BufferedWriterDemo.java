package IO;

import java.io.*;

/**
 * 字符缓冲流
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));

        char[] chs = new char[1024];
        int len = 0;
        while((len = br.read(chs)) != -1){
            bw.write(chs,0,len);
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
