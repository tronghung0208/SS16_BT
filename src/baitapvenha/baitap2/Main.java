package baitapvenha.baitap2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File newFile = new File("C:\\Users\\Owner\\Desktop\\JAVA-CORE\\SS16\\src\\baitapvenha\\baitap2\\fileText");
        newFile.createNewFile();
        String str = "Bài tập đếm số dòng trong file\n" +
                "Mục tiêu: luyện tâp đọc file.\n" +
                "Đề bài: Viết chương trình đọc nội dung từ file text và đếm số dòng trong file đó.";
        Writer writer = new FileWriter(newFile);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        try (bufferedWriter) {
            writer.write(str);
        } catch (IOException e) {
            System.out.println("File ghi bị lỗi: ");
        }
        try {
            Reader reader = new FileReader(newFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String strs;
            int line=0;
            while ((strs = bufferedReader.readLine()) != null) {
                System.out.println(strs);
                line++;
            }
            System.out.println("số dòng trong file là: "+line);

        } catch (IOException e) {
            System.out.println("Đọc file bị lỗi: ");
        }
    }
}
