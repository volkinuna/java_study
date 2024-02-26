package ch08.sec02;

public interface RemoteControl {

    // 필드 상수 선언
    int MAX_VOLUME = 10; // public static final 생략됨
    int MIN_VOLUME = 0;  // static 키워드가 붙은건 객체를 생성하지 않고 사용 가능

    // 추상메소드
    // 인터페이스에서 추상메소드는 접근제한자는 public으로만 가능
    public void turnOn(); // abstract가 생략됨

}
