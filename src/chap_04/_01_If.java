package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; // 오전 10시

        if (hour > 14)
            System.out.println("아이스 아메리카노 +1");
            // 한문장만 쓴다면 중괄호{}가 없어도 됨.

        if(hour  < 14 ){
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이전이면서 모닝 커피를 마시지 않은 경우에만
        hour = 10;
        boolean morningCoffee = false; // 모닝커피
//        if(hour < 14 && morningCoffee == false){
        if(hour < 14 && !morningCoffee == false){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료#2");

        // 오후 2시 이후이거나 모닝커피를 마신 이후
        hour = 15;
        morningCoffee =  false;
        if (hour >= 14 || morningCoffee == true) {
            System.out.println("아이스 아메라카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료#3");
    }
}
