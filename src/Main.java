import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File forder1 =new File("C:/Users/Owner/Desktop/JAVA-CORE/ouput");
        forder1.mkdir();
        File forder2 =new File("C:\\Users\\Owner\\Desktop\\JAVA-CORE\\ouput\\hello.txt");
        forder2.createNewFile();
        File forder3 =new File("C:\\Users\\Owner\\Desktop\\JAVA-CORE\\ouput\\subfolder\\output1");
        forder3.mkdirs();
        File forder4 =new File("C:\\Users\\Owner\\Desktop\\JAVA-CORE\\ouput\\subfolder\\output1\\output1.txt");
        forder4.createNewFile();

    }
}