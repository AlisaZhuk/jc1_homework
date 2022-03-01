package firstmarch2;

public class NextDay {
    public static void main(String[] args) {
        int year = 2022;
        int month = 1;
        int day = 31;
        if (month == 1 || month == 3 || month == 5 || month == 1 || month == 7
                || month == 8 || month == 10) {
            if (!(1 > day) && !(day > 30)) {
                day++;
                System.out.println(day + "." + month + "." + year);
            } else if (day == 31) {
                day = 1;
                month++;
                System.out.println(day + "." + month + "." + year);
            }
        } else if (month == 2) {
            if (!(0 > year) && !(year > 3000))
                if (year % 400 == 0) {
                    if (!(1 > day) && !(day > 28)) {
                        day++;
                        System.out.println(day + "." + month + "." + year);
                    } else if (day == 29) {
                        day = 1;
                        month++;
                        System.out.println(day + "." + month + "." + year);
                    }
                } else if (year % 4 == 0 && year % 100 != 0) {
                    if (!(1 > day) && !(day > 28)) {
                        day++;
                        System.out.println(day + "." + month + "." + year);
                    } else if (day == 29) {
                        day = 1;
                        month++;
                        System.out.println(day + "." + month + "." + year);
                    }
                } else {
                    if (!(1 > day) && !(day > 27)) {
                        day++;
                        System.out.println(day + "." + month + "." + year);
                    } else if (day == 28) {
                        day = 1;
                        month++;
                        System.out.println(day + "." + month + "." + year);
                    }
                }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (!(1 > day) && !(day > 29)) {
                day++;
                System.out.println(day + "." + month + "." + year);
            } else if (day == 30) {
                day = 1;
                month++;
                System.out.println(day + "." + month + "." + year);
            }
        } else if (month == 12) {
            if (!(1 > day) && !(day > 30)) {
                day++;
                System.out.println(day + "." + month + "." + year);
            } else if (day == 31) {
                day = 1;
                year++;
                month = 1;
                System.out.println(day + "." + month + "." + year);
            }
        }
    }
}

