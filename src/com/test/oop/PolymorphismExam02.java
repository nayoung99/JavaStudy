package com.test.oop;

class Animal {
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class PolymorphismExam02 {
    public static void main(String[] args) {
        PolymorphismExam02 animalText = new PolymorphismExam02();
        animalText.moveAnimal(new Human());//인스턴스를 주입(Injection)
        animalText.moveAnimal(new Tiger());
        animalText.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }

}
