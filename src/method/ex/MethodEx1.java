package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        sum(1,2,3);
        sum(15,25,35);
    }

    public static void sum(int a, int b, int c) {
        int sum = a + b + c;
        double avg = (double) sum / 3;
        System.out.println("평균값: " + avg);
    }
}
