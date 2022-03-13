package secondhomework;

public class Task20 {
    public static void main(String[] args) {
        int massive[] = {5, 36, 56, 2, 3, 87, 7, 57, 32, 3, 14};
        int maxValue = 0;
        int maxIndex = 0;
        System.out.print("Массив целочисленных чисел: ");
        for (int i = 0; i < massive.length; i++) {
            System.out.print(+massive[i] + " ");
            if (massive[i] > maxValue) {
                maxValue = massive[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("Максимальное значение массива  " + maxValue);
        System.out.println("Индекс максимального начения  " + maxIndex);
            }
}

