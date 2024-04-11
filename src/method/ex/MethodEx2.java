package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String msg = "Hello world";

        HelloRepeat(msg, 3);
        HelloRepeat(msg, 5);
        HelloRepeat(msg, 7);
    }

    public static void HelloRepeat(String m, int cnt) {
        for (int i = 0; i < cnt; i++) {
            System.out.println(m);
        }
    }
}
