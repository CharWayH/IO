import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
*   windows系统
 */
public class FileInputStreamTest {

    FileInputStream fileInputStream;

        {
            try {
                fileInputStream = new FileInputStream("C:\\Users\\charwayH\\Desktop");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
}
