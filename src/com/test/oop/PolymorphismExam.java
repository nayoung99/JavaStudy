package com.test.oop;

class Family {
    void hello(){
        System.out.println("가족들과 인사하고 지냅시다");
    }

}

class KimFamily extends Family{
    void hello(){
         System.out.println("김선생님 안녕하세요?");
    }

    void dinner(){
        System.out.println("같이 식사나 한번 하시죠");
    }

    void drink(){
        System.out.println("술 한잔 하시죠");
    }

}

class ParkFamily extends Family{
    void hello(){
        System.out.println("박선생님 안녕하세요?");
    }

    void fishing(){
        System.out.println("낚시 한번 하시죠");
    }
}


class ChoiFamily extends Family{
    void hello(){
        System.out.println("최선생님 안녕하세요?");
    }

    void meeting(){
        System.out.println("가족모임 한번 하시죠");
    }

}


public class PolymorphismExam {
    public static void main(String[] args) {

        //Upcasting의 경우는 생성된 인스턴스의 메소드를 실행 --> 가상 메소드
        Family f;
        f = new KimFamily();//각각 메소드의 인스턴스만 실행
        f.hello();
        
        f = new ParkFamily();//인스턴스 생성
        f.hello();

        f = new ChoiFamily();
        f.hello();
    }


}
