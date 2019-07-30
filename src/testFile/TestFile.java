package testFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author charwayH
 */
public class TestFile {
    public static void main(String[] args) {
        //绝对路径
        File file = new File("E:\\Test\\test.txt");
        //相对路径
        //File file = new File("test\\test.txt");
        //是否可以执行
        System.out.println(file.canExecute());
        //是否可读
        System.out.println(file.canRead());
        //是否可写
        System.out.println(file.canWrite());
        //是否可隐藏
        System.out.println(file.isHidden());
        //是否为一个路径
        System.out.println(file.isDirectory());
        //文件的字节大小
        System.out.println(file.length());
        //最后修改时间
        long time = file.lastModified();
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        //获取文件的绝对路径
        System.out.println(file.getAbsolutePath());
        //获取文件名
        System.out.println(file.getName());

        //创建文件夹1
        //File file1 = new File("src/testFile/dir1");
        //System.out.println(file1.mkdir());

        //创建文件夹2
        //File file2 = new File("src/testFile/dir2");
        //System.out.println(file2.mkdir());

        //获取父路径的名字
        //System.out.println(file.getParent());

        //获取父文件对象
        //File file4 = file.getParentFile();
        //System.out.println(file4.getName());






    }


}
