package com.test.oop;

//생성자의 역할과 생성자/메소드 오버로딩의 이해를 위한 예제
class A {

    int a = 3; //멤버변수
    int b = 4;

    public A(){
        //멤버 변수를 초기화  
        a = 30;
        b = 40;

        //인스턴스 생성 시 어떤 명령을 수행
        System.out.println("클래스 A 인자가 없는 생성자를 통해 인스턴스 생성");

    } 
    //인자가 없는 생성자의 경우는 생성자를 클래스  내에
    // 적어 두지 않아도 컴파일러가 자동으로 컴파일시 생성

    public A(int a, int b){
        this.a = a;
        this.b = b; 

        System.out.println("클래스 A 인자가 두 개인 생성자를 통해 인스턴스 생성");
    }

    public int aa(){ //메소드

        return a + b;
    }

    public int cal(int a, int b){ //메소드 오버로딩

        return a * b;
    }

    public int cal(int a, int b, int c){

        return a + b + c;
    }


}

public class Exam02 {
    public static void main(String[] args) {
        
        A a = new A(); //A 클래스 생성자를 통해 인스턴스를 생성하고 
        //생성된 인스턴스의 주소를 a에 할당

        A a1 = new A(100,200);

        System.out.println("인자가 없는 생성자를 통해 초기화 된 멤버 변수의 합 = "+ a.aa());
        System.out.println("인자가 두 개인  생성자를 통해 초기화 된 멤버 변수의 합 = "+ a1.aa());
        
        System.out.println(a.cal(3, 4));
        System.out.println(a.cal(3, 4,7));
    }
}
