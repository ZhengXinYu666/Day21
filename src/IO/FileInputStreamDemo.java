package IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 由于字节流操作字符文件不是特别的方便
 * 所以Java就提供了转换流
 *
 * 字符流=字节流+编码表
 * 编码表：由现实世界的字符和对应的数值组成的一张表
 *
 * ASCII  最高位为符号位，其余为数值位
 *  'a' 97
 *  'A' 65
 *  '0' 48
 *  ISO-8859-1：拉丁码表   8位表示一个数据
 *  GB2312：简体中文码表
 *  GBK：中文编码表的升级，融合了更多的中文文字符号
 *  BIG-5：港台地区繁体字编码方案
 *  GB18030：GBK的取代版本
 *  Unicode：国际标准码，融合了多种文字，java语言使用的就是Unicode
 *
 *  UTF-8：最多用三个字节来表示一个字符
 *      定义了一种区间规则，可以喝ASCII码保持最大兼容
 *      能用一个就用一个（ASCII兼容）
 *      一个表示不了了用两个，最多用三个
 *      （实现了国际化）
 *
 *
 *
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
//        int by =0;
//        while((by = fis.read())!= -1){
//            System.out.println((char)by);
//        }
        byte[] bys = new byte[1024];
        int len = 0;
        while((len=fis.read(bys))!= -1){
            System.out.println(new String(bys,0,len));
        }
        fis.close();
    }
}
