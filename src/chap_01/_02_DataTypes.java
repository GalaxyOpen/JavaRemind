package chap_01;

public class _02_DataTypes {
    public static void main(String[] args) {
        // 정확히 이 위영역은 psvm 으로 치면 자동으로 나옴.
        // 귀찮으면 main이라고만 쳐도 나옴.

        System.out.println("Hello World");
        System.out.println("안녕하세요?");
        // 문자열 출력

        System.out.println(12); // 숫자출력 : 따옴표 없어도 된다.
        System.out.println(-34); // 음수 숫자 출력 : 모두 출력됨
        System.out.println(3.14); // 소수점 : 모두 출력됨
        // 위 세 개를 숫자자료형이라고 함.


        System.out.println(true); // true는 참 : 출력됨 (문자열인데, 왜..?)
        System.out.println(false); // false는 거짓 : 출력됨 (문자열인데, 왜..?)
        // 두 가지 자료형을 가지고 있는 것을 boolean 자료형이라고 함.

        System.out.println(123 + 345);
    }
}
