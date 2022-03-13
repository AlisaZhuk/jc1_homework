package secondhomework;

public class Task20 {
    public static void main(String[] args) {
        int massive[] = {5, 36, 56, 2, 3, 87, 7, 57, 32, 3, 14};
        int max = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > max) {
                max = massive[i];
            }
        }
        System.out.println(max);
    }
}

