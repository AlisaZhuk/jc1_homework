package firstmarch;

public class Work5 {
    public static void main(String[] args) {
        long s = 5_000_000;
        double sec = s % 60;
        double m =(s - sec) / 60;
        double min = m % 60;
        double h = (m - min) / 60;
        double d = s / 84600;
        double day = d % 7 ;
        double week = (d - ( d % 7 )) / 7;


        System.out.println(h + " часов " + min + " минут " + sec + " секунд");
        System.out.println(week + " недель " + day + " дней ");

    }
}
