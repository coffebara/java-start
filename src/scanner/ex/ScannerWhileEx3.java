package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        int num = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        while (true) {
            num = sc.nextInt();
            if (num == -1) {
                break;
            }

            sum += num;
            cnt++;
        }

        double avg = (double) sum / cnt; // 형변환 주의
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);


    }
}
