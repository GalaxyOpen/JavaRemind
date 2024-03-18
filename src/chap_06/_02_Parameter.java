package chap_06;

public class _02_Parameter {
    public static void power(int a){ // Parameter, 매개변수
        int result = a * a;
        System.out.println(a + "의 제곱은 " + result + "임");
    }

    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 제곱은 " + result);
    }
    public static void main(String[] args) {
        // 전달값, 파라미터
        // ex : 거듭제곱을 계산해주는 method 출력
        // 2를 입력하면 2*2=4, 3을 입력하면 3*3=9

        // Argument, 인수. 아래에서는 2라고 보면 됨.
        power(2); // 2*2 = 4
        power(3); // 3*3 = 9
        powerByExp(2,3); // 2*2*2
        powerByExp(3,3); // 3*3*3
        powerByExp(10,0);
    }
}
