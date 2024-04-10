package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int cnt = sc.nextInt();
        int[] nums = new int[cnt];
        int min = Integer.MAX_VALUE;
        int max = 0;

        System.out.println(cnt +"개의 정수를 입력하세요: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            min = (min > nums[i] ? nums[i] : min);
            max = (max < nums[i] ? nums[i] : max);

        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
