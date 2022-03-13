package secondhomework;

public class Task15 {
    public static void main(String[] args) {
        boolean second = false;
        for (int x = 50; x <= 70; x++) {
            boolean b = true;
            for (int i = 2; i < 11; i++) {
                if (x % i == 0) {
                    b = false;
                }
            }
            if (b) {
                if (second) {
                    System.out.println(x);
                    break;
                }
                second = true;
            }
        }
    }
}