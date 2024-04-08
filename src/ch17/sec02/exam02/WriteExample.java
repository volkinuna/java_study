package ch17.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");

            /*
            byte[] array = {10, 20, 30};

            os.write(array);
            */

            byte[] array = {10, 20, 30, 40, 50};

            os.write(array, 1, 3); //(배열, 인덱스번호, 갯수) : 해당 배열의 인덱스번호부터 갯수를 출력

            os.write(array);

            os.flush();
            os.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
