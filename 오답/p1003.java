//실행은 맞는데 runtime error

import java.util.Scanner;

public class p1003 {
    static int a = 0, b = 0;

    public static int fibonacci(int n){
        if (n == 0) {
            a++;
            return 0;
        } else if (n == 1) {
            b++;
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sel, i = 0, num = scanner.nextInt();
        int [][] result = new int[num][2];
        while(i < num){
            sel = scanner.nextInt();
            if(sel < 40 && sel >= 0) fibonacci(sel);

            result[i][0] = a;
            result[i][1] = b;

            i++;
            a = 0;
            b = 0;
        }

        i = 0;
        while(i < num) {
            System.out.println(result[i][0] + " " + result[i][1]);
            i++;
        }

    }
}
