package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    } // ctrl alt l = 자동정렬
    public static void main(String[] args) {
        // 오버로딩 : 같은 이름의 메소드를 여러개 만드는 것
        // 같은 이름의 메소드를 여러 번 선언
        // 전달값의 타입이 다르거나
        // 전달값의 갯수가 다르거나
        System.out.println(getPower(3)); // 3 * 3
        System.out.println(getPower("4")); // 4 * 4
        System.out.println(getPower(4,4));
    }
}
