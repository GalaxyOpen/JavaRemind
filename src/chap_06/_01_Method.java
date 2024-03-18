package chap_06;

public class _01_Method {

    // 메소드 정의
    public static void sayHello(){
        System.out.println("Hello, This is test method");
    }

    //메소드 호출
    public static void main(String[] args) {
        // 메소드 : 어떤 기능을 하는 프로그램들의 묶음
        System.out.println("메소드 호출 전.");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후.");
    }
}
