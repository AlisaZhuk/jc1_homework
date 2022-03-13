package secondhomework;

public class Task22 {
    public static void main(String[] args) {
        int [] m = new int [10];
        System.out.print("Массив целочисленных чисел: ");
        System.out.println();
        for(int i = 0; i < m.length;i ++) {
            m[i] = (int) (Math.random() * 10 - 1);
            System.out.print(m[i] + " ");
        }
        System.out.println();
        int n = m.length;
        int temp;

        for (int i = 0; i < n / 2; i++) {
            temp = m[n - i - 1];
            m[n - i - 1] = m[i];
            m[i] = temp;
        }
        System.out.println("Перевернутый массив: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }
}
