package teststream;

import java.io.*;

/**
 * @author charwayH
 * 操作文件
 *
 */
public class OperateFile {
    /**
     * 文件夹复制
     * @param file  源文件
     * @param path 目标路径
     */
    public void copyFile(File file, String path){
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

    /**
     * 文件夹的复制 file可以代表文件也可以代表文件夹
     * @param file          被初始文件
     * @param newPath
     */
    public void superCopyFile(File file,String newPath){
        //获取file的绝对路径，拼串的方式获取新文件名字
        String oldFilePath = file.getAbsolutePath();
        String newFilePath = newPath+oldFilePath.split(":")[1];
        //创建一个新的文件/文件夹
        File newFile = new File(newFilePath);
        //file是一个文件夹 才有数组对象

        //判断当前传入的file是个文件还是文件夹
        //获取当前传递进来的file对象所有子元素
        File[] files = file.listFiles();
        if(files != null){
            //通过新的file对象操作 在硬盘上创建一个文件夹
            newFile.mkdir();
            System.out.println(newFile.getName()+"文件夹复制完毕！");
            //里面的元素
            if(files.length!=0){
                for(File f:files){
                    this.superCopyFile(f,newPath);
                }
            }
        }//file是一个文件，没有子元素，不需要数组对象
        else {
            //创建两个文件流
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(file);
                fos = new FileOutputStream(newFile);
                byte[] b = new byte[1024];
                int count = fis.read(b);
                while(count!=-1) {
                    fos.write(b, 0, count);
                    fos.flush();
                    //别忘了再读一次
                    count = fis.read(b);
                }
                System.out.println(newFile.getName()+"文件复制完毕");
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        OperateFile operateFile = new OperateFile();
        File file = new File("E:\\Test1");
        operateFile.superCopyFile(file, "C:\\");
    }
}
