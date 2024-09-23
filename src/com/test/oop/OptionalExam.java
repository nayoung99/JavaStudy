package com.test.oop;

import java.util.Optional;

public class OptionalExam {

    public static void main(String[] args) {
        
        String str = "Hello";
        String isNullString = null;
        int a;
        /* trycatch문 사용
        try {
            if(isNullString.equals(isNullString))
            a = 4;
        }catch(NullPointerException e){
            System.out.println("NULL이 들어 왔어요");
        }
        */
        //Optional 사용
        String retValue = Optional.ofNullable(isNullString).orElse("NULL이다");
        System.out.println(retValue); //위의 trycatch문을 간단하게 대체
        //삼항연산자 사용
        String retValue1 = isNullString == null?"NULL이다":isNullString;
        System.out.println(retValue1);
    }

}
