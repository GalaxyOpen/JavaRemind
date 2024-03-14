package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환 : 자르거나 바꿀 때
        System.out.println(s.replace(" and",","));
        // 이러면 and 를 ,로 바꾸게 된다.

        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작( 이전 내용은 삭제함)
        System.out.println(s.substring(s.indexOf("Java"))); // 이렇게 써도 됨. 자바 위치를 파악하고 그 위치부터 끝가지 값만 표현.
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
        // 시작 위치부터 끝 위치 "직전" 까지
        // Java 부터 시작하는 위치부터 . "."이 시작하는 위치 바로 앞 까지 표현한다.

        // 공백 제거
        s = "             I love Java.             ";
        System.out.println(s);
        System.out.println(s.trim()); // 불필요한 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java, Python
        System.out.println(s1.concat(",").concat(s2)); // Java, Python
    }
}
