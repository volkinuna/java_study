package ch17.sec11;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws Exception {
        //File 객체 생성
        File dir =  new File("C:/Temp/images");
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");
        File file3 = new File("C:/Temp/file3.txt");

        //존재하지 않으면 디렉토리, 파일 생성
        if (dir.exists() == false) dir.mkdirs();
        if (file1.exists() == false) file1.createNewFile();
        if (file2.exists() == false) file2.createNewFile();
        if (file3.exists() == false) file3.createNewFile();
        
        //Temp 폴더의 내용을 출력
        File temp = new File("C:/Temp");
        File[] content = temp.listFiles(); //해당 디렉토리에 있는 모든 폴더와 파일을 읽어옴

        for (File file : content) {
            if (file.isDirectory()) {
                System.out.println(file.getName());
            } else {
                System.out.println(file.length() + " " + file.getName());
            }
        }
    }
}
