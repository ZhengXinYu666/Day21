import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader2 extends MyLineNumberReader{
    private Reader r;

    private int lineNumber = 0;

    public MyLineNumberReader2(Reader r){
        super()r;
    }
    public int getLineNumber(){
        return lineNumber;
    }
    public void setLineNumber(int lineNumber){
        this.lineNumber = lineNumber;
    }

    public String readLine()throws IOException{
        return super.readline();

    }
}