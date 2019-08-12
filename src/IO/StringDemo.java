package IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * String (byte[] bytes,String charsetName):通过指定的字符集解码字节数组
 * byte[] getBytes(String charsetName):使用指定的字符集合把字符串解码为字节数组
 *
 * 编码：把看得懂的变成看不懂的
 * String---byte[]
 *
 * 解码：把看不懂的变成看得懂的
 * byte[]---String
 *
 *
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好";

        byte[] bys = s.getBytes("UTF-8");//默认为GBK
        System.out.println(Arrays.toString(bys));
        String ss = new String(bys,"UTF-8");
        System.out.println(ss);
    }
}
