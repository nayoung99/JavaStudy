package com.test.oop;


class AA {
    int a=1;
    int b=2;

    void aa(){
        System.out.println("a = "+a + " b = "+b);
    }
}

class BB {
    private int a=3;
    int b=4;
    static final int q = 100;

    void bb(){

        System.out.println("a = "+a + " b = "+b);
    }

    public int getAA(){
        return this.a;
    }

    public void setAA(int a){
        this.a = a;
    }
}


class CC {

    static int c = 33;
    final int k = 4; //상수
    void cc(){
        System.out.println("c = "+c);
        // k = 5; //에러남
    }
}

class DD {
    static int d = 88;
    static void dd(){
        System.out.println("d = "+d);
    }
}


public class Exam01 {

    public static void main(String[] args) {

        AA aa1 = new AA(); //인스턴스화-클래스 AA를 실제 실행해서 작동 될 수 있도록 하는 것
        AA aa2 = new AA();
        
        aa1.aa();

        aa1.a = 10;
        aa1.b = 20;
        System.out.println("a = "+aa1.a +" b = "+aa1.b);

        aa1.aa();

        aa2.aa();
        
        BB bb = new BB(); //생성자에 의한 초기화
        bb.setAA(100);

        System.out.println(bb.getAA());

        CC cc1 = new CC();
        CC cc2 = new CC();
   
        cc1.cc();
        cc2.cc();
     
        cc1.c = 44;
        cc1.cc();
        cc2.cc();
        
        DD.dd();


    }

}
