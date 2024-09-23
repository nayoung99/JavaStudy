package com.test.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface MyLambdaFunction {
    int sum(int a, int b);
}

@FunctionalInterface
interface MyPrint {
    String printLambda();
}

public class LambdaExam {
    public static void main(String[] args) {
        
        //람다식을 이용한 익명함수 : 2개의 인자를 받아서 메소드로 계산 후 반환
        MyLambdaFunction lambdaFunction = (int a, int b) -> a + b;
        System.out.println("람다식을 이용한 익명함수 : 2개의 인자를 받아서 메소드로 계산 후 반환하는 예: " 
        +lambdaFunction.sum(3, 5));

        //람다식을 이용한 익명함수 : 인자 없이 문자열을 반환
        MyPrint myPrint = () -> "Hello World !!!";
        System.out.println("람다식을 이용한 익명함수 : 인자 없이 문자열을 반환하는 예 : " 
        +myPrint.printLambda());

        //Supplier : 매개변수 없이 값만 반환하는 함수형 인터페이스 
        Supplier<String> supplier = () -> "안녕하세요???";
        System.out.println("Supplier : 매개변수 없이 값만 반환하는 함수형 인터페이스 사용 예 = "
        +supplier.get());

        //Consumer : 객체 T를 매개변수로 받아서 사용하며, 반환값이 없는 함수형 인터페이스 
        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
        consumer.andThen(s->System.out.println("Consumer : 객체 T를 매개변수로 받아서 사용하며, 반환값이 없는 함수형 인터페이스 사용 예 = " + s))
                .accept("반갑습니다...");
        // System.out.println("Consumer : 객체 T를 매개변수로 받아서 사용하며, 반환값이 없는 함수형 인터페이스 = " 
        // + consumer.andThen(System.out::println).accept("반갑습니다..."));        
        
        //Function : 객체 T를 매개 변수로 받아서 처리한 후, R로 반환하는 (익명형)함수형 인터페이스 
        Function<String,Integer> function = (str) -> str.length(); 
        System.out.println("Function : 객체 T를 매개 변수로 받아서 처리한 후, R로 반환하는 함수형 인터페이스 사용 예 = " 
        + function.apply("값 입력")); //Integer로 출력

        //Predicate : 객체 T를 매개변수로 받아 처리한 후 Boolean을 반환
        Predicate<String> predicate = (str) -> str.equals("Hello");
        System.out.println("Predicate : 객체 T를 매개변수로 받아 처리한 후 Boolean을 반환하는 예 = "
        + predicate.test("Hel"));

        //메소드 참조(method reference) : 람다 표현식이 단 하나의 메소드만을 호출하는 경우에 
        //해당 람다 표현식에서 불필요한 매개변수를 제거하고 사용할 수 있게 해준다.
        // 클래스이름::메소드이름

        //Function<String,Integer> func = str -> str.length(); 
        Function<String,Integer> func = String::length;
        System.out.println(func.apply("오늘 날씨는???"));
        

    }

}
