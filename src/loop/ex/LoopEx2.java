package loop.ex;

public class LoopEx2 {
    public static void main(String[] args) {
        int count = 2;

        while (count <= 20) {
            System.out.println(count);
            count += 2;
        }

        for (count = 2; count <= 20; count += 2) {
            System.out.println(count);
        }
    }
}
