package teststream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author charwayH
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        //打开创建一个输出流
        File file = new File("E:\\Test\\Test1.txt");
        FileOutputStream fos = null;

        {
            try {
                //将原先文件里的内容清空
                fos = new FileOutputStream(file);
                //把新增内容添加到文件末尾
                fos = new FileOutputStream(file, true);
                //插入一个Unicode码
                //int b = 98;
                //插入一个数组
                //byte[] b = new byte[]{98, 97, 96};
                //插入一个字符串
                String str = "1+1=2";
                //将String类型转换为byte类型
                byte[] b = str.getBytes();
                //写入相应内容
                fos.write(b);
                //保证输出流管道中的内容都进入到文件中
                fos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
