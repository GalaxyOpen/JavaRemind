package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로, 실수형에서 정수형으로 변환하는 것을 의미.

        // int to float, double
        int score = 98;
        System.out.println(score); // 98
        System.out.println((float) score); // 98.0
        System.out.println((double) score); // 98.0

        // float, double to int
        float score_f = 98.8F;
        double score_d = 98.8;
        System.out.println((int)score_f); // 98.0 소수점 이하 버림
        System.out.println((int)score_d); // 98.0 소수점 이하 버림

        // 정수 + 실수 연산
        score = 98+ (int) 98.8; // 이러면 98+98 이 된다.
        System.out.println(score);

        score_d = 98+98.8; // 이렇게만 적어도 되는 이유는 98이 자동으로 double 형태가 된다.
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 현재 score 값은 196이지만 자동으로 Double 형태로 변환되어 들어가게 됨.

        int convertedScoreInt = (int)score_d; // (int)가 없다면 196.8을 196에 넣으려고 하니 에러가 발생함.
        // double -> float -> long -> int (수동으로 형변환 해줘야 한다).

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(94);
        System.out.println(s1); // 94

        String s2 = String.valueOf(98.7);
        s2 = Double.toString(98.4);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93"); // 따옴표 안에 있는 숫자를 파싱한다고 함.
        System.out.println(i);

        double d = Double.parseDouble("95.5");
        System.out.println(d);

//        int error = Integer.parseInt("자바");
        // 에러 : 따옴표 안에 문자가 있어 변환 불가능.

    }
}
