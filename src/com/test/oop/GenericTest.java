package com.test.oop;

class GStack<T>{

    int tos;
    Object[] stck;

    public GStack(){
        tos = 0;
        stck = new Object[10];
    }

    //10개의 데이터를 채울 수 있는 스택에 데이터를 채운다(입력)
    public void push(T item){
        if(tos == 10) return; //조건문을 종료
        stck[tos] = item;
        tos ++;
    }

    //10개의 데이터를 채울 수 있는 스택에서 데이터를 빼낸다(출력)
    public T pop(){
        if(tos == 0) return null; //조건문을 종료
        tos--;
        return (T)stck[tos];
    }

}

public class GenericTest {
    public static void main(String[] args) {

        //GStack 클래스에 String 타입의 값을 보낼거라고 컴파일러에게 언급
        GStack<String> stringStack = new GStack<String>(); //뒤에 newGStack에 <String>안써줘도된다.

        stringStack.push("Seoul");
        stringStack.push("Busan");
        stringStack.push("LA");

        for(int i=0; i<3; i++){
            System.out.println(stringStack.pop());
        }
    }
}
