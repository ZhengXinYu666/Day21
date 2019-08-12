package IOtest;

import java.io.*;

/**
 * 需求：复制文本文件
 *
 * 分析：
 *      复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则字节流
 *      所以用字符流更方便
 *      而字符流有5中方式，所以做这个题目，我们有五种方式
 *      推荐掌握第五种
 *          字符高效流的特殊功能
 *
 *      数据源：
 *          a.txt
 *      目的地：
 *          b.txt
 *
 */
public class test1 {
    public static void main(String[] args)throws IOException {
        String srcString = "a.txt";
        String destString = "b.txt";
        method5(srcString,destString);
//        method2(srcString,destString);
//        method3(srcString,destString);
//        method4(srcString,destString);
//        method5(srcString,destString);
    }

    //基本字符流一次读写一个字符
//    private static void method1(String srcString,String destString)throws IOException {
//        FileReader fr = new FileReader(srcString);
//        FileWriter fw = new FileWriter(destString);
//
//        int ch = 0;
//        while((ch=fr.read())!=-1){
//            fw.write(ch);
//            fw.flush();
//        }
//        fw.close();
//        fr.close();
//    }
    //基本字符流一次读写一个字符
//    private static void method2(String srcString,String destString)throws IOException {
//        FileReader fr = new FileReader(srcString);
//        FileWriter fw = new FileWriter(destString);
//
//        char[] chs = new char[1024];
//        int len = 0;
//        while((len=fr.read(chs))!=-1){
//            fw.write(chs,0,len);
//            fw.flush();
//        }
//        fw.close();
//        fr.close();
//    }
    private static void method5(String srcString,String destString)throws  IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destString));

        String line = null;
        while((line=br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
