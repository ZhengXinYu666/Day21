import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader {
    private Reader r;
    private int linNumber = 0;

    public MyLineNumberReader(Reader r) {
        this.r = r;
    }

    public int getLinNumber() {
        linNumber++;
        return linNumber;
    }

    public void setLinNumber(int linNumber) {
        this.linNumber = linNumber;
    }

    public String readLine()throws IOException {
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while((ch=r.read())!=-1){
            if(ch=='\r'){
                continue;
            }
            if(ch=='\n'){
                return sb.toString();
            }else{
                sb.append((char)ch);
            }
            if(sb.length()>0){
                return sb.toString();
            }
        }
        return null;
    }
    public void close()throws IOException{
        this.r.close();
    }
}
