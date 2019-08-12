package IOtest;

import java.io.*;

/**
 * 复制图片
 * BufferedInputStream
 * BufferedOutputStream
 */
public class test2 {
    public static void main(String[] args) throws IOException {
        //高效字节流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));

        byte[] bys = new byte[1024];
        int len = 0;
        while((len=bis.read(bys))!= -1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();


    }
}
