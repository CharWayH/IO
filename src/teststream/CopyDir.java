package teststream;

import java.io.*;

/**
 * @author charwayH
 * 拷贝文件夹
 *
 */
public class CopyDir {
    private void Copy(File src,File des){
        File[] files = src.listFiles();
        if(files != null && files.length != 0) {
            for (File file : files) {
                FileInputStream fis = null;

                FileOutputStream fos = null;

                byte[] b = new byte[5];

                try {
                    fis = new FileInputStream(src);
                    fos = new FileOutputStream(des);
                    int count = fis.read(b);
                    if(count != -1){
                        String value = new String(b, 0, count);
                        b = value.getBytes();
                        fos.write(b);
                        fos.flush();

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        fos.close();
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                this.Copy(file,des);
            }
        }
    }

    public static void main(String[] args) {
        //原始文件
        File src = new File("E:\\Test");
        //目标文件
        File des = new File("C:\\Test");
        CopyDir copyDir = new CopyDir();
        copyDir.Copy(src, des);




    }
}
