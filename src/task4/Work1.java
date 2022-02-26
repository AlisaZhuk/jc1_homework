package task4;

public class Work1 {


    public static void main (String[] args){
        int a, b;
        int c = uravnenie(2,8);

        System.out.println(c);
    }

    public static int uravnenie(int a, int b){

        int result = (a + b) + a * b;
        return result;
    }



}
