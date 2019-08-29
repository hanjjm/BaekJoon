import java.util.Scanner;

public class p1003 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sel, i = 0, num = scanner.nextInt();    //변수설정
        int [][] result = new int[41][2];   //결과를 저장할 배열 선언
        int [] temp = new int[num]; //임시배열
        result[0][0] = 1;
        result[0][1] = 0;
        result[1][0] = 0;
        result[1][1] = 1;   //초깃값 셋팅

        for(i = 2; i <= 40; i++){
            result[i][0] = result[i-1][0] + result[i-2][0];
            result[i][1] = result[i-1][1] + result[i-2][1];
        }   //result배열에다가 피보나치 결과값 저장
        i = 0;

        while(i < num){
            sel = scanner.nextInt();
            temp[i] = sel;
            i++;
        }   //결과를 한번에 출력해주기 위해 임시배열에 값을 넣어줌
        i = 0;

        while(i < num){
            System.out.println(result[temp[i]][0] + " " + result[temp[i]][1]);
            i++;
        }   //출력
    }
}
