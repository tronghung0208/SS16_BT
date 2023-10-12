package baitapvenha.baitap1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File creatText = new File("C:\\Users\\Owner\\Desktop\\JAVA-CORE\\SS16\\src\\baitapvenha\\baitap1\\data.txt");
        creatText.createNewFile();
        String string = "Viết chương trình đọc nội dung từ file text và hiển thị số lượng từ trong file đó.";
        Writer writer = new FileWriter(creatText);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        try (bufferedWriter) {
            writer.write(string);
        } catch (IOException e) {
            System.out.println("Lỗi !!");
        }


        try {
            Reader reader = new FileReader(creatText);

            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            int count = 0;
            if (line != null) {
                String[] strings = line.split("\\s+");
                count = strings.length;
            }
            System.out.println("số từ là: " + count);

        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp: " + e.getMessage());
        }


//        try (BufferedReader reader = new BufferedReader(new FileReader(creatText))) {
//            String line;
//            int wordCount = 0;

//            while ((line = reader.readLine()) != null) {
//                String[] words = line.split("\\s+");
//                wordCount += words.length;
//            }
//            System.out.println("Số lượng từ trong file: " + wordCount);
//        } catch (IOException e) {
//            System.err.println("Lỗi khi đọc tệp: " + e.getMessage());
//        }
    }
}
