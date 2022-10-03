package chapter6; // 패키지 선언

public class SportsCar { // 클래스 선언
    public SportsCar(){
        new Tire(); // 클래스 변수 = new 클래스();
        // new 연산자는 객체를 생성시킨 후 객체의 주소를 리턴함
    }
}


class Tire{ // 한 파일 내 여러개의 클래스를 작성 할 수 있지만 결국 공개 클래스가 되는 것은
            // 파일명과 클래스명이 같은 클래스만 가능하다.
    static int number = 1;

    public static void plus(){
        number = 2;
    }
}