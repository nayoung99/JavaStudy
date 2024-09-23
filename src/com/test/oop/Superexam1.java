package com.test.oop;

class Point {
    int x =10;
    int y =20;

    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }
}

class Point3D extends Point{
    int z = 30;
    Point3D(){
        this(100,200,300); //자기 클래스의 인자가 3개인 생성자 실행
    }

    Point3D(int x, int y, int z){
        super(x, y); //부모 클래스의 인자가 두개인 생성자 실행
        this.z = z;


    }

}

public class Superexam1 {
    public static void main(String[] args) {
        Point3D point3d = new Point3D();
        System.out.println("point3d의 값 = " + point3d.x + "\t" 
        + point3d.y + "\t" + point3d.z);
    }

}
