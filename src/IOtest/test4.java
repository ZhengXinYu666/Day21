package IOtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 需求：从文本文件汇总读取数据（每一行为一个字符串数据）到集合中，并遍历集合
 *
 *  分析：
 *      通过题目的意思我们可以直到如下的一些内容
 *          数据源是一个文本文件
 *          目的地的是一个集合
 *          元素是字符串
 *
 *      数据源：
 *          b.txt---FileReader---BufferedReader
 *      目的地：
 *          ArrayList<String>
 */
public class test4 {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        //封装目的地
        ArrayList<String> array = new ArrayList<String>();

        //读取数据
        String line= null;
        while((line=br.readLine())!= null){
            array.add(line);
        }
        br.close();

        //遍历集合
        for(String s:array){
            System.out.println(s);
        }
    }
}
