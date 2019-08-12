import java.io.IOException;
import java.io.Reader;

/**
 * 用Reader模拟Buffered的readLine()功能
 *
 * readLine():一次读取一行，根据换行符判断是否结束，只返回内容，不返回换行符
 */
public class MyBufferedReader{
    private Reader r;
    public MyBufferedReader(Reader r) {
        this.r = r;
    }
        public String readLine()throws IOException{
            StringBuilder sb = new StringBuilder();
            //什么是否结束？结束之前应该是一直读取，直到-1
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
                //为了防止数据丢失，判断sb的长度不能大于0
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