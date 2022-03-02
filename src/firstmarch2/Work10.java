package firstmarch2;

public class Work10 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 6;
        int d = 3;
        int e = 10;
        int f = 8;
        System.out.println("Стороны 1 дома " + a + "x" + b);
        System.out.println("Стороны 2 дома " + c + "x" + d);
        System.out.println("Стороны участка " + e + "x" + f);


        // 1 способ: a + c параллельно е, b параллельно d параллельно f.

        if ((a + c) <= e) {
            if ((b <= f) && (d <= f)) {
                System.out.println("Cпособ-1 позволяет разместить");
            } else {
                System.out.println("Cпособ-1 не позволяет разместить");
            }
        }
        // 2 способ: a + c параллельно f, b параллельно d параллельно е.
        else if ((a + c) <= f) {
            if ((b <= e) && (d <= e)) {
                System.out.println("Cпособ-2 позволяет разместить");
            } else {
                System.out.println("Cпособ-2 не позволяет разместить");
            }
        }

        // 3 способ: b + c параллельно e, a параллельно d параллельно f.
        if ((b + c) <= e) {
            if ((a <= f) && (d <= f)) {
                System.out.println("Cпособ-3 позволяет разместить");
            } else {
                System.out.println("Cпособ-3 не позволяет разместить");
            }
        }
        // 4 способ: b + c параллельно f, a параллельно d параллельно e.
        else if ((b + c) <= f) {
            if ((a <= e) && (d <= e)) {
                System.out.println("Cпособ-4 позволяет разместить");
            } else {
                System.out.println("Cпособ-4 не позволяет разместить");
            }
        }

        // 5 способ: a + d параллельно e, b параллельно c параллельно f.
        if ((a + d) <= e) {
            if ((b <= f) && (c <= f)) {
                System.out.println("Cпособ-5 позволяет разместить");
            } else {
                System.out.println("Cпособ-5 не позволяет разместить");
            }
        }
        // 6 способ: a + d параллельно f, b параллельно c параллельно e.
        else if ((a + d) <= f) {
            if ((b <= e) && (c <= e)) {
                System.out.println("Cпособ-6 позволяет разместить");
            } else {
                System.out.println("Cпособ-6 не позволяет разместить");
            }
        }

    }
}
