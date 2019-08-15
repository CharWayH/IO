package testobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author charwayH
 */
public class TestObjectOutputStream {
    public static void main(String[] args) {
        //将对象记录到文件中 永久保存 对象持久化
        Person pl =  new Person("charwayH",18);
        Person p2 =  new Person("PassGreat",23);
        Person p3 = new Person("主流豆腐",16);
        //对象输出流
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("E:\\Test\\Person.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(pl);
            oos.writeObject(p2);
            oos.writeObject(p3);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }





}
