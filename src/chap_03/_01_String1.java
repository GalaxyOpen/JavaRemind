package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 위의  s를 드래그해서도 알 수 있긴하다.

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자 변환 - I LIKE JAVA AND PYTHON AND C.
        System.out.println(s.toLowerCase()); // 소문자 변환 - i like java and python and c.

        // 포함관계
        System.out.println(s.contains("Java")); // 포함된다면 true, 포함되지 않으면 false 리턴
        System.out.println(s.contains("C#")); // 포함되지 않으므로 값은 false가 됨.

        System.out.println(s.indexOf("Java"));
        // Java라는 문자열 위치 정보를 알 수 있음.
        // 첫 위치 시작이 1이 아니라 0이어서 답은 7이 됨.

        System.out.println(s.indexOf("C#")); // C#은 포함되지 않으므로 -1을 리턴함.
        System.out.println(s.indexOf("and")); // 12  처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 True, 아니면 false 리턴.
        System.out.println(s.endsWith("and C.")); // 이 문자열로 끝나면 true, 아니면 false
    }
}
