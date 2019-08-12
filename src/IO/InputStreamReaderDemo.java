package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader(INputStream in):根据默认编码读取数据
 * InputStreamReader(InputStream in,String charsetNmae)：根据指定编码读取数据
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(
           "osw.txt"),"UTF-8");
        //读取数据
        int ch = 0;
        while((ch=isr.read())!= -1){
            System.out.print((char)ch);
        }
        //释放数据
        isr.close();
    }
}
