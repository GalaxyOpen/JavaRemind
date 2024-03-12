package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 규칙
        /*
        1. 저장할 값에 어울리는 이름을 적어야 함.
        2. 밑줄, 문자, 숫자 가능함. 근데 공백은 안됨
        3. 밑줄 또는 문자로 시작 가능.
        4. 한 단어 또는 2개 이상의 연속으로 지음.
        5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 단어는 제외)
        6. 예약어는 변수로 사용이 불가능함. (ex : public, static, void, int, double, float, ...)
        */

        // ex : 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "현덕"; // 이름
        String lastName = "유"; // 성
        String dateOfBirth = "2001-12-31";
        String residentialAddress = "형주호텔"; // 제휴지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE747"; // 항공편명
        String _flightNo = "KE757"; // 밑줄로 시작해도 됨
        String _flight_no_2 = "KE767"; // 밑줄과 숫자 포함
        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        // 세관 신고를 위한 데이터
        String item1 = "쌍구검";
        String item2 = "청룡언월도";
        String item3 = "장팔사모";

        // 프로그램의 흐름을 위해 사용되는 경우 등에는 이름이 크게 중요하지 않다.
        int i = 0;
        String s = "";
        String str = "";

        // 절대 변하지 않는 상수는 대문자로 적는다.
        final String Code = "KR";
        // Code = "US";  에러, final 예약어가 붙으면 다른 값을 대입할 수 없다.
    }
}
