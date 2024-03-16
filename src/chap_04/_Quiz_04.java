package chap_04;
// 주차 요금은 시간당 4천원 (일일 최대 요금은 30000원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인

// 일반 차량 5시간 주차시 20000원
// 경차 5시간 주차시 10000원
// 장애인 차량 10시간 주차시 15000원

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; // 주차 시간
        boolean isSmallCar1 = false; // 경차여부
        boolean withDisabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 정산 요금 ( 시간당 4000원 곱하기 )

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000){
            fee = 30000;
        }

        // 경차 또는 장애인 차량의 경우 50% 할인.
        if(isSmallCar1 || withDisabledPerson){
            fee = fee / 2 ;
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");

    }
}
