package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 */
public class FileOutputStreamWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw2.txt"));
        //写数据
//        osw.write('a');
//        osw.write(97);
        //为什么数据没有进去呢？
        //1字符=2字节
        //电脑上文件中存储数据的基本单位是字节
        //字符无法进去
        //void.flush()
        char[] chs = {'a','b','c','d','e'};
        //osw.write(chs);
        //osw.write(chs,1,3);
        //osw.write("我爱郑黑脸");
        osw.write("我爱郑黑脸",2,3);//从2开始，来三个
        osw.flush();
        osw.close();
    }
}
