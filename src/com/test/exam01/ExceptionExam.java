package com.test.exam01;

public class ExceptionExam {

    class FoolException extends Exception {


    }

    public static void main(String[] args) throws Exception{ //ArithmeticException exception
        int b;
        int c;
        b = 0;
        c = 0;//스코프,초기화 해줘야 함
        //try {
        //    c = 4/b;
        //} catch(ArithmeticException exception){
        //    b = -1; //에러가 발생되면 해 줄 명령어
        //} finally { //에러가 발생하더라도 반드시 수행해야 하는 명령
        //   System.out.println("다행이다...");
        //}
        //System.out.println("c = "+ c);

        //c = 12/b;

        //System.out.println("c = "+ c);

        ExceptionExam exam = new ExceptionExam();
        exam.sayNickname("fool");
        

    }

    public void sayNickname(String nickname){ //String 래퍼클래스
        if(nickname.equals("fool"))
            try {
                throw new FoolException();
            } catch (FoolException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        System.out.println("당신의 별명은 " + nickname + "입니다.");
        
    }

}



