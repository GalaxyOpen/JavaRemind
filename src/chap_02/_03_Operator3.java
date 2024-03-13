package chap_02;

public class _03_Operator3 {

    public static void main(String[] args) {
        // 비교연산자
        System.out.println(5 > 3); // 5는 3보다 크다. - > True , 거짓이면 False 를 리턴함.
        System.out.println(5 >= 3); // 참이니까 true
        System.out.println(5 >= 5); // 참이니까  true
        System.out.println(5 >= 7); // 거짓이니까 false

        System.out.println(5 < 3); // 5는 3보다 작다. - >  false
        System.out.println(5 <= 3); // 참이니까 true

        // 등호는 ==를 쓴다.
        System.out.println(5 == 5); // true
        System.out.println(5 == 3); // false

        // 같지 않다는 !=를 쓴다.
        System.out.println(5 != 5); // false
        System.out.println(5 != 3); // true

    }


}
