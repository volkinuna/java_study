package ch16.sec03;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.println(name + "이 " + job + "을 합니다.");
        });

        person.action2(word -> System.out.println(word + "라고 말합니다."));
        //매개변수 이름은 달라도 상관없다. 매개변수가 하나일때는 매개변수의 ()와 구현부의 {}는 생략 가능하다.
    }
}
