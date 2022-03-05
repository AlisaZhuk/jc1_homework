package secondhomework;

public class Task15 {
    public static void main(String[] args) {
        boolean b = true;
        for (int x = 50; x <= 70; x++) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(x);
            else b = true;
        }
    }
}