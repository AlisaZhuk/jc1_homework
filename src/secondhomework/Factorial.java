package secondhomework;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int i = 1;
        do {
            fact = fact * i;
            i++;
            System.out.println(fact);
        } while(i<=10);
    }
}