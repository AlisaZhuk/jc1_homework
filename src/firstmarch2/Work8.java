package firstmarch2;

public class Work8 {
    public static void main(String[] args) {
        int n = 344;
        int lastNumber = n%10;

        if(lastNumber == 1)
            System.out.println(n+" рубль");
        else if ((lastNumber == 2)||(lastNumber == 3)||(lastNumber == 4))
            System.out.println(n+" рубля");

            else if ((lastNumber == 0)||(lastNumber >= 5))
            System.out.println(n+" рублей");
    }
}
