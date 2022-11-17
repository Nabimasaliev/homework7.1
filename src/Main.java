import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int [] array = new int[7];
        int [] massive = new int[7];
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(1,30);
            System.out.print(array[i]+" ");
        }
        System.out.println("");

        for (int i = 0; i < array.length ; i++) {
            massive[i]= array[i];
            System.out.print(massive[i]+" ");
        }
    }
}