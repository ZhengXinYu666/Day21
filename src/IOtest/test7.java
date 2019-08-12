package IOtest;

import java.io.*;

/**
 * 需求：复制指定目录下的指定文件，并修改后缀名
 * 指定文件时：.java文件
 * 指定后缀名：.jad文件
 * 指定的目录：jad
 *
 * 分析：
 *  1、封装目录
 *  2、获取该目录下的java文件的File数组
 *  3、遍历该数组，得到每一个File对象
 *  4、把该File进行复制
 *  5、在目的目录下改名
 */
public class test7 {
    public static void main(String[] args)throws IOException {
        File srcFolder = new File("");
        File destFolder = new File("");

        if(! destFolder.exists()){
            destFolder.mkdir();
        }

        File[] fileArray = srcFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile()&&name.endsWith(".java");
            }
        });

        for(File file:fileArray){
            String name = file.getName();
            File newFile = new File(destFolder,name);
            copyFile(file,newFile);
        }

        //目的地改名
        File[] destFileArray = destFolder.listFiles();
        for(File destFile:destFileArray){
           String name = destFile.getName();
           String newName = name.replace("","");


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
