package demo.thread;

public class TryCatchTest {

    public static void main(String[] args) {
        System.out.println(t());
    }

    private static int t() {
        try {
            System.out.println(1111 + "s");
            return 1;
        } catch (Exception e) {

        } finally {
            return 2;
        }
    }
}
