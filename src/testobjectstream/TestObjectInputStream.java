package testobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author charwayH
 *
 */
public class TestObjectInputStream {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("E:\\Test\\Person.txt");
            ois = new ObjectInputStream(fis);
            for (int i = 0; i < 4; i++) {
                Person p = (Person)ois.readObject();
                System.out.println(p);
                p.eat();
            }


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
