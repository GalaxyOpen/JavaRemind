package chap_05;

import java.sql.SQLOutput;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 [ 2차원 배열 위주 ]
        // ex) 소규모 영화관을 예로 들면
        // A1 - A5
        // B1 - B5
        // C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 x 5  = 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        //B2에 접근하려면?
        System.out.println(seats[1][1]);

        //C5에 접근하려면? 세로로 확인한 숫자, 가로로 확인한 숫자
        System.out.println(seats[2][4]);

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A3에 접근하려면?
        System.out.println(seats2[0][2]);

        // A5라는 값은 없지만 만약 접근하려고 한다면?
        // System.out.println(seats[0][4]);
        // 에러가 발생함.

        // 3차원 배열도 가능하긴 함. (세로 x 가로 x 높이)
        String[][][] mArray = new String[][][]{
                {{},{},{}},
                {{},{},{}},
                {{},{},{}}
        };
    }
}
