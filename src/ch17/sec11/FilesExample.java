package ch17.sec11;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {

    public static void main(String[] args) throws Exception {
        String data = "" +
                "id : winter\n" +
                "email : winter@naver.com\n" +
                "tel : 010-1111-2222";

        //Path 객체 생성
        Path path = Paths.get("C:/Temp/user.txt");

        //파일 생성 및 데이터 저장
        Files.writeString(Paths.get("C:/Temp/user.txt"), data,
                Charset.forName("UTF-8"));

        //파일 정보 얻기
        System.out.println("파일 유형: " + Files.probeContentType(path));
        System.out.println("파일 크기: " + Files.size(path) + "bytes");

        //파일 읽기
        String content = Files.readString(path, Charset.forName("UTF-8"));
        System.out.println(content);
    }
}