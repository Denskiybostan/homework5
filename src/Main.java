import java.util.Arrays;

public class Main {
    private static double aDouble;

    public static void main(String[] args) {
        int [] number = new int[3];
        number[0] = 1;
        System.out.println(number[0]);
        double [] number1 = {1.57, 7.654, 9.986};
        System.out.println(number1[1]);
        int [] numbers = {10, 9, 8, 7, 6, 5, 4, 3};
        System.out.println(numbers[3]);
        int [] number4 = {1,2,3};
        for (int i = 0; i < number4.length; i++) {
            System.out.print(number4[i] + ",");
        }
        System.out.println( );
        double [] number5 = {1.57, 7.654, 9.986};
        for (int i = 0; i < number.length; i ++) {
            System.out.print(number5[i] + ",");
        }
        System.out.println( );
        int [] number6 = {1,2,3};
        for (int i = number6.length - 1; i >= 0; i--){
            System.out.print(number6[i] + ",");
        }
        System.out.println( );
        double[] number7 = {1.57, 7.654, 9.986};
        for (int i = number7.length - 1; i >= 0; i--){
            System.out.print(number7[i] + ",");
        }
        System.out.println( );

        int[] number8 = {1, 2, 3};
        for (int i = 0; i < number8.length; i++){
            if (number8[i] % 2 !=0){
                number8[i] += 1;
            System.out.println(Arrays.toString(number8));
            }
        }
        }
    }
