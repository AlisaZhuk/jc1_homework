package firstmarch;

public class Work4 {
    public static void main (String[] args){
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1_000_000;
        long l = 0xFFFFFFFFL;
        char c = 'a';
        float f = .25F;
        double d = .00001234;
        boolean bool = true;
        System.out.println(b + "\n" + s +"\n" + i + "\n" + l + "\n" + c +"\n" + f + "\n" + d + "\n" + bool);
    }
}
