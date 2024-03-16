package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        System.out.println("어서오세요, GalaxyOpen 입니다.");
        // 또다른 손님들이 들어오면
        System.out.println("어서오세요, GalaxyOpen 입니다.");
        System.out.println("어서오세요, GalaxyOpen 입니다.");
        System.out.println("어서오세요, GalaxyOpen 입니다.");
        System.out.println("어서오세요, GalaxyOpen 입니다.");
        System.out.println("어서오세요, GalaxyOpen 입니다.");
        System.out.println("어서오세요, GalaxyOpen 입니다.");
        // 만약에 인사 법이 바뀌고 또다른 손님들이 들어오면
        System.out.println("환영합니다. GalaxyOpen 입니다.");
        System.out.println("환영합니다. GalaxyOpen 입니다.");
        System.out.println("환영합니다. GalaxyOpen 입니다.");
        // 매장 이름이 바뀌면
        System.out.println("환영합니다. GalaxyClose 입니다.");

        System.out.println("-------------반복문 사용-------------");

        //반복문 사용 for
        for (int i = 0; i < 10; i++ ){
//            System.out.println("어서오세요. GalaxyOpen 입니다." + i);
//            System.out.println("환영합니다. GalaxyOpen 입니다." + i);
            System.out.println("환영합니다. GalaxyClose 입니다." + i);
        }

        // 짝수만 출력 fori만 적고 엔터
        for(int i = 0; i < 10; i+=2){
            System.out.print(i);
        }

        System.out.println(); // 줄바꿈 용도
        // 홀수만 출력
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }
        System.out.println(); // 줄바꿈 용도

        // 거꾸로 숫자
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        // 1~10까지 수들의 합
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
            System.out.println("현재까지 총합은 "+ sum + " 입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 "+sum+"입니다.");

    }
}
