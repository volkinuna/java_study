package ch12.sec12;

public class Service {

    @PrintAnnotation
    public void method1() {}

    @PrintAnnotation("*") // 하나만 사용할때는 처음것만 사용 가능
    public void method2() {}

    @PrintAnnotation(value = "#", number = 20) // 순서가 바뀌어도 상관없다.
    public void method3() {}
}
