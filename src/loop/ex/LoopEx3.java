package loop.ex;

public class LoopEx3 {
    public static void main(String[] args) {
        int i = 0;
        int max = 100;
        int sum = 0;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);
        sum = 0;

        for (i = 0; i <= max; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
