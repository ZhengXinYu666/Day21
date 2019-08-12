package IOtest;

import java.io.*;

/**
 * 需求：复制单级文件夹
 *
 * 数据源：/Users/Z/DeskTop/day21/code/demo/e.mp3
 * 目的地：/Users/Z/DeskTop/Demo
 *
 * 分析：
 *      1、封装目录
 *      2、获取该目录下的所有文本的File数组
 *      3、遍历该File数组，得到每一个File对象
 *      4、把该File复制
 *
 */
public class test6 {
    public static void main(String[] args)throws IOException{
        File srcFolder = new File("/Users/Z/DeskTop/day21/code/demo");
        File destFolder = new File("/Users/Z/DeskTop/Demo");
        //如果目的地文件夹不存在，就创建
        if(!destFolder.exists()){
            destFolder.mkdir();
        }

        //获取该目录下所有文本的File数组
        File[] fileArray = srcFolder.listFiles();

        //遍历File数组，得到每一个File对象
        for(File file: fileArray){
            String name = file.getName();
            File newFile = new File(destFolder,name);

            copyFile(file,newFile);
        }
    }
    private static void copyFile(File file,File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));

        byte[] bys = new byte[1024];
        int len = 0;
        while((len=bis.read())!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
