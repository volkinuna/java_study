package ch04.sec05;

public class SumFrom1To100 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("1~100까지의 합 : " + sum); //5050
    }
}
