package com.test.exam01;

public class Sample 
{
    /* 
    클래스의 내부에 선언된 변수 --> 인스턴스 변수
    인스턴스 변수의 scope은 이 변수가 선언된 클래스 전체에 미친다.
    단, main 메소드 내에서 영향을 미치기 위해서는 인스턴스 선언이 필요.
    인스턴스 변수의 라이프타임은 이 객체가 존재할 때까지...
    */
    int x, y; 

    /* 
    클래스의 내부에 선언된 static 변수 --> 클래스 변수
    클래스 변수의 scope은 이 변수가 선언된 클래스 전체에 미친다.
    */
    static int result; 

    void add(int a, int b){//메소드 선언
        //매개변수 --> 지역변수
        x = a;
        //x는 인스턴스 변수로 이미 선언이 된 상태이고
        //매개변수 a의 값이 인스턴스 변수 x에 할당된다.
        y = b;
        int sum = x + y; //선언과 동시에 할당 --> 초기화
        result = 88; //클래스 변수에 88을 할당
        System.out.println("result = "+result);
        System.out.println("Sum = "+sum);
    }

    void add2(){
        int a =3;
        int b =2;
    }

    public static void main(String[] args) 
    {
        Sample obj = new Sample(); //인스턴스 선언
        obj.add(10, 20);
        System.out.println("x = "+ obj.x);
        System.out.println("y = "+ obj.y);
        System.out.println("result = "+result);
        result = 77;
        System.out.println("result = "+ result);
        System.out.println("안녕");
        System.out.println("\"반갑\"");
        System.out.println("네~~");
        
        


    }

}
