package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참일 경우 결과값이 출력됨) : (거짓일 경우 결과 값이 출력됨)

        int x = 6;
        int y = 5;
        int max = (x > y) ? x : y; // x 가 y 보다 크면 x를, 작으면 y를 출력. 정답은 x.
        System.out.println(max);

        int min = (x < y) ? x : y; // x 가 y 보다 작으면 x를, 작으면 y를 출력. 정답은 y.
        System.out.println(min);

        boolean b =  (x == y) ? true : false ;
        System.out.println(b);

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s);
    }
}
