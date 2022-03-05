package secondhomework;

public class Factorial {
    public static void main(String[] args) {
        int number = 10;
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}