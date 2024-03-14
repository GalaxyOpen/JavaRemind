package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주민등록번홍에서 생년월일 및 성별까찌만 출력하는 프로그램을 작성하시오
        String a = "901231-1234567";
        String b = "";

        System.out.println(a.substring(a.indexOf("9"), a.indexOf("234")));
        System.out.println(b.substring(b.indexOf("03"), b.indexOf("56")));

        // 유튜브 답안

        String id ="901231-1234567";
        System.out.println(id.substring(0,8));
        id = "030708-4567890";
        System.out.println(id.substring(0,id.indexOf("-") + 2)); // -을 찾고 거기에 두개의 수를 더한다.
    }
}
