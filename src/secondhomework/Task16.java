package secondhomework;

public class Task16 {
    public static void main(String[] args) {
        int x = 1;
        int i = 1;
        String a = ("Hope!");
        for (x = 1; x <= 100; x++) {
            if (x % 7 == 0) {
                System.out.println(a);
            } else {
                System.out.println(x);
                i++;
            }
        }
    }
}
