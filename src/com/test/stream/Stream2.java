package com.test.stream;

import java.util.ArrayList;
import java.util.List;

import com.test.oop.Member;

// class Member {
//     private String name;
//     private String gender;
//     private int age;

//     public Member(String name, String gender, int age){
//         this.name = name;
//         this.gender = gender;
//         this.age = age;
//     }

//     public String getName(){
//         return this.name;
//     }

//     public String getGender(){
//         return this.gender;
//     }

//     public int getAge(){
//         return this.age;
//     }
// }

public class Stream2 {

    public static void main(String[] args) {
        
        List<Member> list = new ArrayList<Member>(); //업캐스팅
        list.add(new Member("김철수", "male", 54));
        list.add(new Member("김민성", "male", 38));
        list.add(new Member("최지희", "female", 28));
        list.add(new Member("김현주", "female", 44));

        // list.stream().map(c->c.getName()).sorted().forEach(s->System.out.println("이름 = " + s)); //게시판 출력할때 사용!

        for(int i=0; i<list.size(); i++){
            System.out.println("이름 : " + list.get(i).getName() + "\t"
                                         + list.get(i).getGender() + "\t"
                                         + list.get(i).getAge());
        }

        System.out.println();

        for(Member member: list) //컬렉터 전용 for 문 --> for(리스트 요소의 타입선언:리스트 객체명)
            System.out.println("이름 : " + member.getName() + "\t"
                                         + member.getGender() + "\t"
                                         + member.getAge()); //스프링에서 많이 사용! 추천!!
    }
}
