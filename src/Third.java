import java.util.Arrays;

public class Third {
    public static void Run() {
        int[] array1 = {1,6,4,2,8};
        int[] array2 = {1,8,4,6,3};

        float sum1 = 0F;
        float sum2 = 0F;

        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        if ((sum1 / array1.length) > (sum2 / array2.length)) {
            System.out.println("Среднее арифметическое больше у первого массива");
        } else if ((sum2 / array2.length) > (sum1 / array1.length)) {
            System.out.println("Среднее арифметическое больше у второго массива");
        } else {
            System.out.println("Среднее арифметическое равно");
        }
    }
}
