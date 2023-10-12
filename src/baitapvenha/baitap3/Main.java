package baitapvenha.baitap3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File newFile = new File("C:\\Users\\Owner\\Desktop\\JAVA-CORE\\SS16\\src\\baitapvenha\\baitap3\\fileText2");
        newFile.createNewFile();
        String str = "Bài tập đếm số dòng trong file file file\n" +
                "Mục tiêu: luyện tâp đọc file.\n" +
                "Đề bài: Viết chương trình đọc nội dung từ file text và đếm số dòng trong file đó.";
        Writer writer = new FileWriter(newFile);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        try (bufferedWriter) {
            writer.write(str);
        } catch (IOException e) {
            System.out.println("File ghi bị lỗi: ");
        }

        Reader file= new FileReader(newFile);;
        BufferedReader bufferedReader=new BufferedReader(file);;
        try {
            List<String> stringList = new ArrayList<>();
            List<String> listDuplicate = new ArrayList<>();
            String[] list;
            String lines;
            while ((lines = bufferedReader.readLine()) != null) {
                list = lines.split(" ");

                for (String string : list) {
                    if (stringList.contains(string)&&!listDuplicate.contains(string)) {
                        listDuplicate.add(string);
                    } else {
                        stringList.add(string);
                    }
                }
            }
            System.out.println("stringList"+stringList);
            for (String string : listDuplicate) {
                System.out.println(string);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
