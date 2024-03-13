package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(6 + 3); // 9
        System.out.println(6 - 3); // 3
        System.out.println(6 * 3); // 18
        System.out.println(6 / 3); // 2
        System.out.println(6 / 4); // 1.5 이어야 하지만, 정수 값으로 나타내므로 뒤 자리를 버리고 1만 나옴.
        System.out.println(4 / 6); // 0.333.. 이어야 하지만 마찬가지로 정수 값이기에, 뒤 자리를 버리고 0이 됨.
        System.out.println(6 % 4); // 2 나머지연산

        // 우선 순위 연산
        System.out.println(3 + 3 * 3); // 12 곱셈이 우선이므로 3 * 3이 먼저 계산되고 3을 더한다.
        System.out.println((3 + 3) * 3); // 3+3 에 우선순위를 주려면 괄호를 추가하여 준다.

        // 변수를 이용한 연산
        int a = 30;
        int b = 15;
        int c;

        c = a + b;
        System.out.println(c); // 45

        c = a - b ;
        System.out.println(c); // 15

        c = a * b ;
        System.out.println(c); // 450

        c = a / b ;
        System.out.println(c); // 2

        c = a % b ;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9
        // val++; // 연산을 수행하고 나서 다음에 증가
        // ++val; // 증가하고 나서 연산을 수행

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : "+ waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : "+ waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : "+ waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : "+ waiting++); // 대기 인원 : 3


    }
}
