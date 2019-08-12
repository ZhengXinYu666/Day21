package IO;

import java.io.*;

/**
 * 字符缓冲流的特殊方法
 * BufferedWriter：
 *      public void newLine():根据系统来决定换行符
 * BufferedReader：
 *      public void readLine()：一次读取一行数据
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        read();
        write();
    }


    private static void read() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("bw2.txt"));
        String line = null;
        while((line=br.readLine())!= null){
            System.out.println(line);
        }
        br.close();
    }

    private static void write()throws IOException{
            BufferedWriter bw = new BufferedWriter(new FileWriter("bw2.txt"));

            for(int x= 0;x<10;x++){
                bw.write("hello"+x);
                bw.newLine();
                bw.flush();
            }
            bw.close();
    }
}

