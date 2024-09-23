package com.test.oop;

abstract class PP {

    void pp1(){
        System.out.println("PP 추상클래스의 일반메소드1");

    }

    abstract void pp2(); //추상 메소드

    void pp3(){
        System.out.println("PP 추상클래스의 일반메소드2");

    }
}

class CCC extends PP{

    int a = 10;
    int b = 20;
    int sum = a + b;

    @Override //아노테이션(Annoatation) :  컴파일러 이 코드가 뭐라는 걸 추가로 설명해 줌.
    void pp2() {
        System.out.println("PP 추상클래스의 추상메소드");   
    }

    //오버라이딩(Overriding)
    @Override
    void pp3(){ //가상 메소드
        System.out.println("CCC 클래스의 멤버 변수 합 = "+ sum);

    }

}

public class AbstractExam01 {
    public static void main(String[] args) {
        CCC cc = new CCC();
        cc.pp2();

        cc.pp3();
    }

}
