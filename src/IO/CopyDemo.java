package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 由于常见的操作都是使用本地默认编码，所以，不用指定编码
 * 而转换流的名称有些长，所以Java提供了子类供我们使用
 * OutputStreamWriter = FileOutputStream+编码表（GBK）
 * FileWriter = FileOutputStream+编码表（GBK）
 * Input同理
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("b.txt");

//        int ch = 0;
//        while((ch=fr.read())!= -1){
//            fw.write(ch);
//        }
        char[] chs = new char[1024];
        int len = 0;
        while((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
            fw.flush();
        }

        fr.close();
        fw.close();
    }
}
