import java.util.Scanner;
import static java.lang.Math.*;

public class p1002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num, x1, y1, r1, x2, y2, r2, k = 0;
        double temp;
        num = scanner.nextInt();
        int [] result = new int[num];

        while(k < num){
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            r1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            r2 = scanner.nextInt();
            temp = sqrt(pow(x1-x2,2)+pow(y1-y2,2));

            if((r1 + r2 == temp && abs(r1-r2) < temp) || abs(r1-r2) == temp) result[k] = 1;
            if(r1 + r2 > temp && abs(r1-r2) < temp) result[k] = 2;
            if((r1 + r2 < temp && abs(r1-r2) < temp) || abs(r1-r2) > temp || (r1 != r2 && temp == 0)) result[k] = 0;
            if(r1 == r2 && temp == 0) result[k] = -1;

            k++;
        }
        for(int i = 0; i < num; i++){
            System.out.println(result[i]);
        }
    }
}