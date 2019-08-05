package teststream;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author charwayH
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        //创建一个字节型的输入流
/**
        try {
            //获取文件路径
            File file = new File("E:\\Test\\test.txt");
            //真实的读文件
            FileInputStream fis = new FileInputStream(file);
            //获取文件的字节内容
            int code = fis.read();
            while(code != -1) {
                code = fis.read();
                System.out.println(code);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\Test\\test.txt");
            //返回管道中有多少缓存的字节，读取网络数据的数据可能会有问题
            int v = fis.available();
            System.out.println(v);
            byte[] b = new byte[5];
            int count = fis.read(b);
            while (count != -1){
                //有多少字节就插入多少字符串
                String value = new String(b,0,count);
                System.out.print(value);
                count = fis.read(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
            if(fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
