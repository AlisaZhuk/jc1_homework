package secondhomework;

public class Task18 {
    public static void main(String[] args) {
               int [] m = new int [10];
        for(int i = 0; i < m.length;i ++) {
            m[i] = (int) (Math.random() * 10 - 1);
            System.out.print(m[i] + " ");
        }
        System.out.println();
        System.out.println("Последний элемент массива: " + m[9]);


    }
}
