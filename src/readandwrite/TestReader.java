package readandwrite;

import java.io.*;

public class TestReader {
    public static void main(String[] args) {
        File file = new File("E:\\Test\\test.txt");
        FileReader reader = null;
        // FileWriter writer = null;
        try {
            reader = new FileReader(file);
            //writer = new FileWriter(file);
            /**
             char[] c = new char[5];
             int count  = reader.read(c);
             while(count!=-1){
             System.out.print(new String(c,0,count));
             count = reader.read(c);
             }
             */
            //String name = "林超";
            // writer.write(name);
            //writer.flush();
            int code = reader.read();
            System.out.println(code);
            System.out.println((char)code);


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
