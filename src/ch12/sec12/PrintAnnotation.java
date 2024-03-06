package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 정의
// 메소드에서만 해당 어노테이션 사용 가능하도록 지정
@Target({ElementType.METHOD}) // 하나만 쓸땐 { } 생략 가능
// 실행 중 계속 어노테이션 정보(어떻게 처리해야할지)를 유지한다.
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
    String value() default "-";
    int number() default 15;
}
