package firstmarch;

public class work7 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int r = 9;
        double rc = Math.sqrt( (double) (a * a) + (double) (b * b)) / 2;

        if(r >= rc) {
            System.out.println("Картнка перекрывает отверстие");
            return;
        }

        System.out.println("Картнка  не перекрывает отверстие");
    }
}
