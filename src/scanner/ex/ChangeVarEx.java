package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int tmp = 0;

        tmp = a;
        a = b;
        b = tmp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
