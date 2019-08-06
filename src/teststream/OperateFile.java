package teststream;

import java.io.*;

/**
 * @author charwayH
 * 操作文件
 *
 */
public class OperateFile {
    private void CopyFile(File file, String path){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //将原始文件放入输入流中
            fis = new FileInputStream(file);
            //创建一个新的文件放入输出流中
            File newFile = new File(path+"\\"+file.getName());
            fos = new FileOutputStream(newFile);
            //字节数组，一般为1-8k
            byte[] b = new byte[1024];
            //读取输入流中的字节内容
            int count = fis.read(b);
            while(count != -1){
                //将输出流中的内容写入到文件中
                fos.write(b,0,count);
                fos.flush();
                //继续读取输入流中的字节内容
                count = fis.read(b);
            }
            System.out.println("复制完毕！！");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                //关闭输入流和输出流
                if(fis != null) {
                    fis.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        try {
            //关闭输入流和输出流
            if(fos != null) {
                fos.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
    public static void main(String[] args) {
       OperateFile operateFile = new OperateFile();
       File file = new File("E:\\Test\\1.png");
       operateFile.CopyFile(file, "C:\\Test");

    }
}
