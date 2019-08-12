package IOtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * 需求：有一个文本文件存储了几个名称，写一个程序实现随机获取一个人的名字
 *
 * 分析：
 *      A、把文本文件的数据存储到集合中
 *      B、随机产生一个索引
 *      C、根据索引获取一个值
 */
public class test5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        ArrayList<String> array = new ArrayList<String>();
        String line = null;
        while((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();

        //随机产生一个索引
        Random r = new Random();
        int index = r.nextInt(array.size());

        //根据该索引获取一个值
        String name = array.get(index);
        System.out.println("下一把玩"+name);
    }
}
