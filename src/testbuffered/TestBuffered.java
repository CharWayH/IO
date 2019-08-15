package testbuffered;

import java.io.*;

/**
 * @author charwayH
 */
public class TestBuffered {

    public static void main(String[] args) {
        File file = new File("E:\\Test\\test.txt");
        try {

            FileReader fileReader = new FileReader(file);
            //缓冲流
            BufferedReader br = new BufferedReader(fileReader);
            //读取缓冲流中的内容
            String value = br.readLine();
            while(value!=null){
                System.out.println(value);
                value = br.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = null;
        try {
            File file1 = new File("E:\\Test\\testBufferedWrite.txt");
            FileWriter fw = new FileWriter(file1);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write("Hello,Dai");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bw!=null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
