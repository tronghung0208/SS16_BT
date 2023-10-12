package baitapvenha.baitap5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File newFile = new File("C:\\Users\\Owner\\Desktop\\JAVA-CORE\\SS16\\src\\baitapvenha\\baitap4\\file4.txt");
        newFile.createNewFile();
        String str = "Bài tập đếm số dòng trong file\n" +
                "Mục tiêu: luyện tâp đọc file.\n" +
                "Đề bài: Viết chương trình đọc nội dung từ file text và đếm số dòng trong file đó.";
        Writer writer = new FileWriter(newFile);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        try (bufferedWriter) {
            writer.write(str);
        } catch (IOException e) {
            System.out.println("lỗi");
        }


        try {
            Reader reader = new FileReader(newFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            List<String> listArr = new ArrayList<>();
            String[] listString;
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                listString = string.split(" ");
                for (String item:listString
                ) {
                    listArr.add(item);
                }
            }
            int index=0;
            int maxLength=listArr.get(index).length();


            for (int i = 0; i < listArr.size(); i++) {
                if (maxLength<listArr.get(i).length()){
                    maxLength=listArr.get(i).length();
                    index=i;
                }
            }
            System.out.println("Phần tử có độ dài lớn nhất là "+ maxLength+" là phần tử: "+ listArr.get(index));
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
    }
}
