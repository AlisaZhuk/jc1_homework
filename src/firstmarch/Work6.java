package firstmarch;

public class Work6 {


    public static void main(String[] args){
        System.out.println(lastNumberSeven(455));
    }
    public static boolean lastNumberSeven(int a){
        boolean b;
        int lastCharacter = a%10;
        b = lastCharacter == 7;
        return b;
    }
}
