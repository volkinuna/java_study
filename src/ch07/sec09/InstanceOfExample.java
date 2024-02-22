package ch07.sec09;

public class InstanceOfExample {
    public static void main(String[] args) {

        Person p1 = new Person("최볼키");
        personInfo(p1);
        
        // 자동타입변환
        Person p2 = new Student("최코코", 10);
        personInfo(p2);

    }

    public static void personInfo(Person person) { // Person person = new Student();
        System.out.println("name : " + person.name);
        person.walk();

        // 강제타입변환을 하기전에 instanceof를 사용해 타입을 확인한다.
//        if (person instanceof Student) {
//            // person이 Student 객체를 가지고 있을 경우 강제타입변환
//            Student student = (Student) person;
//
//            // Student 객체에 있는 필드와 메소드 사용 가능
//            System.out.println("studentNo : " + student.studentNo);
//            student.study();
//        }
        // Java 12버전 이후
        if (person instanceof Student student) {
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }
    }
}
