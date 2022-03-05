package secondhomework;

public class Poizvedenie{
    public static void main(String[] args) {
        int number = 25;
        long num1 = 1;
        int i = 1;
        do{ num1 = num1 * i;
            i++;
        }while(i<=number);
        System.out.println("Произведение чисел числа "+ number + ": " + num1);
    }
}

