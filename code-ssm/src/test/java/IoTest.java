import org.junit.Test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class IoTest {
    @Test
    public void dataStreamTest() throws Exception{
    
        DataInputStream inputStream = new DataInputStream(new FileInputStream("F://test.txt"));
        DataOutputStream out = new DataOutputStream(new FileOutputStream("F://test.txt"));
        out.writeInt(1);
        out.writeInt(2);
        out.flush();
        out.close();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//        String count;
//        while ((count = reader.readLine()) != null){
//            System.out.println(count);
//        }
        int aa;
//        while ((aa = inputStream.readInt()) != 0){
//            System.out.println(aa);
//        }
        while(inputStream.available()>0) {
            // read four bytes from data input, return int
            int k = inputStream.readInt();
    
            // print int
            System.out.print(k + " ");
        }
        inputStream.close();
    
//        reader.close();
        DataInputStream dis = new DataInputStream(System.in);
        byte[] buf = new byte[10];
        int len = 0;
        while((len=dis.read(buf))!=-1) {
    
            String s = new String(buf, 0, len);
            System.out.print(s);
        }
    }
    
    public static void main (String[] args) throws Exception{
//        String val = "2.33634444444444";
//        System.out.println(Float.parseFloat(val));
//        System.out.println(Float.valueOf(val));
//        System.out.println(String.format("%.2f", Float.parseFloat(val)));
//        System.out.println(Float.parseFloat("1330.22"));
        Date date = new Date();
        System.out.println(date.getTime());
        Thread.sleep(3000);
        System.out.println(date.getTime() - new Date().getTime() > 5000);
        
    }
}
