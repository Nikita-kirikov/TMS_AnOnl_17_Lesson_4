import java.util.Arrays;

public class Seventh {
    public static void Run() {
        int[] numbers = {43,56,13,1,34,2,8,9,4};
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            int prev = 0;

            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] > numbers[i + 1]) {
                    isSorted = false;

                    prev = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = prev;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}
