package chap_01;

public class _03_variables {
    public static void main(String[] args) {
        String name = "이기홍"; // name 이라는 문자열이 선언된 것.
        int hour = 15;

        System.out.println( name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println( name + "님, 배송이 완료되었습니다. ");

        double score = 90.5; // 실수 자료형 double
        char grade = 'A'; // 한글자 표현 character, 줄여서 char
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 "+ score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? "+ pass);

        double d = 3.14123456789; // double 이 float 보다 더 정밀함.
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // int 보다 훨씬 더 큰 값을 담을 수 있음.
        l = 1_000_000_000_000L; // 중간에 _를 넣어도 표현 가능함.
        System.out.println(l);

    }

}
