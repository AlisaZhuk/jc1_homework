package secondhomework;

    public class Factorial {
            public static void main(String[] args) {
                boolean b = true;
                long fact = 1;
                int i = 1;
                while (i <= 10){
                    fact = fact * i;
                    i++;
                    System.out.println(fact);
                }
            }
    }
    //как быть с нулем?