package secondhomework;

public class Summachisla {
    public static void main(String[] args) {
        int myArray[] = {7, 8, 9, 3, 8, 2, 3, 4, 4, 5};
        int sum = 0;
        int i = 0;
        do{ sum = sum + myArray[i];
            i++;
        } while(i < myArray.length); {
            System.out.println(sum);
        }
    }
}