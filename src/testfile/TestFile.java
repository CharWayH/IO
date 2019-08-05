package testfile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author charwayHf
 */
public class TestFile {
    public static void main(String[] args) {
        //绝对路径
        File file = new File("E:\\Test\\test.txt");
        //相对路径
        //File file = new File("test\\test.txt");
        //是否可以执行
        System.out.println("是否可以执行: " + file.canExecute());
        //是否可读
        System.out.println("是否可读: " + file.canRead());
        //是否可写
        System.out.println("是否可写: " + file.canWrite());
        //是否可隐藏
        System.out.println("是否可隐藏: " + file.isHidden());
        //是否为一个路径
        System.out.println("是否为一个路径: " + file.isDirectory());
        //文件的字节大小
        System.out.println("文件的字节大小: " + file.length());
        //最后修改时间
        long time = file.lastModified();
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("最后修改时间: " + sdf.format(date));
        //获取文件的绝对路径
        System.out.println("获取文件的绝对路径: " + file.getAbsolutePath());
        //获取文件名
        System.out.println("获取文件名: " + file.getName());

        //创建文件夹1
        //File file1 = new File("src/testfile/dir1");
        //System.out.println("创建文件夹1: " + file1.mkdir());

        //创建文件夹2
        //File file2 = new File("src/testfile/dir2");
        //System.out.println("创建文件夹2: " + file2.mkdir());

        //获取当前file父路径名字
        //System.out.println("获取当前file父路径名字: " + file.getParent());

        //获取当前file父文件对象
        //File file4 = file.getParentFile();
        //System.out.println("获取当前file父文件对象: " + file4.getName());

        //File file5 = new File("src/");
        //获取当前file的子文件名
        //String[] names = file5.list();
        //System.out.println("获取当前file的子文件名: " + names);

        //获取当前file的子文件对象  数组对象为空则为一个文件，数组对象不为空则为一个文件夹
        //File[] files = file5.listFiles();
        //System.out.println("获取当前file的子文件对象: " + files);
        //对象数组的长度不为0，则证明当前file内有元素
        //System.out.println("获取当前file的子文件对象个数: " + files.length);

        //File file6 = new File("src/testfile/dir1");
        //System.out.println("是否删除文件： " + file6.delete());




    }


}
