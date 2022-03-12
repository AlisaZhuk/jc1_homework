package secondhomework;
import java.util.Scanner;

    public class Factorial {
        public static void main(String[] args) {
            outPut();
            calcFactorial();
        }
        public static void outPut() {
            System.out.print("Факториал какого числа от 0 до 10 найти: ");
        }


        public static int calcFactorial () {
            Scanner scanner = new Scanner(System.in);
            int fact = 1;
            int i = 1;
            while (true) {
                int value = scanner.nextInt();
                while (i <= value) {
                    fact *= i;
                    i++;
                }
                if (value > 10) {
                    System.out.println("Вы ввели число больше 10");
                    System.exit(0);
                } else {
                    System.out.println("Факториал числа " + value + " будет равен " + fact);

                }
            }
        }
    }


