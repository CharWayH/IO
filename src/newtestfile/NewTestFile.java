package newtestfile;

import java.io.File;

/**
 * @author charwayH
 */

public class NewTestFile {
    /**
     *  递归获取文件路径
     *  自底向上
     */
    public void showFile(File file){
        //获取文件子元素
        File[] files = file.listFiles();
        //如果子元素是个文件夹且文件夹中带有子元素
        if(files != null && files.length != 0) {
            //遍历子元素并递归
            for (File f :files) {
                this.showFile(f);
            }
        }
        //打印文件路径
        System.out.println(file.getAbsolutePath());
    }


    /**
     *  递归删除文件
     *  自底向上
     */
    public void deleteFile(File file){
        //获取文件子元素
        File[] files = file.listFiles();
        //如果子元素是个文件夹且文件夹中带有子元素
        if(files != null && files.length != 0) {
            //遍历子元素并递归
            for (File f :files) {
                this.deleteFile(f);
            }
        }
        //打印文件路径
        System.out.println(file.delete());
    }

    public static void main(String[] args) {
        NewTestFile newTestFile = new NewTestFile();
        File file = new File("E:\\Test\\a");
        newTestFile.deleteFile(file);

    }

}
