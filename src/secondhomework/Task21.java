package secondhomework;

public class Task21 {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }

        for (int j : array) {
            System.out.print(j + " ");
        }

        int min = array[0];
        for(int i=1;i<10;i++) {
            if(array[i]<min) {
                min=array[i];
            }
        }
        int minIndex = 0;
        for(int i=0;i<10;i++) {
            if(array[i] == min) {
                minIndex = i;
                break;
            }
        }
        int max = array[0];
        for(int i=1;i<10;i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        int maxIndex = 9;
        for(int i=9;i>0;i--) {
            if(array[i] == max) {
                maxIndex = i;
                break;
            }
        }

        System.out.println();

        int sum = 0;
        if (minIndex < maxIndex) {
            for (int i = minIndex; i <= maxIndex; i++) {
                sum = sum + array[i];
            }
        } else {
            for (int i = maxIndex; i <= minIndex; i++) {
                sum = sum + array[i];
            }
        }

        System.out.println(sum);

    }
}