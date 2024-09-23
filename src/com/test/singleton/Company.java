package com.test.singleton;

public class Company {

    private static Company instance = new Company();
    private Company() { } //생성자 선언/정의

    public static Company getInstance() { //메소드 정의
        
        if(instance == null) //null --> 無
        instance = new Company(); //인스턴스 생성

        return instance;
    }

}
