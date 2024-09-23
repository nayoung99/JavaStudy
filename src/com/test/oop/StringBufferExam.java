package com.test.oop;

public class StringBufferExam {

    /*
     * StringBuffer는 멀티 스레드 환경에서 안전하다는 장점이 있고,
     * StringBuilder는 StringBuffer보다 성능이 우수한 장점이 있음.
     */

     public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");//append로 추가
        sb.append(" ");
        sb.append("My World");
        String result1 = sb.toString();
        System.out.println(result1);

        sb.insert(0, "Everyone "); //0번째 위치에 Everyone 삽입
        String result2 = sb.toString();
        System.out.println(result2);

        //문자열 0부터 시작해서 8번째 자리까지의 "문자열"을 리턴
        String result3 = sb.substring(0,8);
        System.out.println(result3);

        
     }
    

}
