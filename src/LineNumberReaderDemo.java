import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * BufferedReader
 *      LineNumberReader
 */
public class LineNumberReaderDemo {
    public static void main(String[] args)throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("a.txt"));


        //从10开始比较好
        lnr.setLineNumber(10);

        String line = null;
        while((line=lnr.readLine())!= null){
            System.out.println(lnr.getLineNumber()+":"+line);
        }
        lnr.close();
    }

}
