import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args)throws IOException {
        MyLineNumberReader mlnr = new MyLineNumberReader(new FileReader("a.txt"));

        mlnr.setLinNumber(10);

        String line = null;
        while((line = mlnr.readLine())!= null){
            System.out.println(mlnr.getLinNumber()+":"+line);
        }
        mlnr.close();
    }
}
