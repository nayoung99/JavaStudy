package com.test.oop;

class Animal {
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human1 extends Animal {
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }
}

class Tiger1 extends Animal{
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle1 extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
}

class AnimalMove {
    Animal animal;
    public AnimalMove(Animal animal){//생성자를 통한 인스턴스 주입
        this.animal = animal;
        animal.move();
    }
}

public class PolymorphismExam03 {
    public static void main(String[] args) {
        new AnimalMove(new Human1());
        new AnimalMove(new Tiger1());
        new AnimalMove(new Eagle1());
    }

}
