import java.util.Scanner;
import java.util.Arrays;

public class Zero {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int[] numbers = {5,4,3,1,2,9,7,8,6};
        Arrays.sort(numbers);

        int result = Arrays.binarySearch(numbers, input);

        if (result > 0 ) {
            System.out.println("Ваше число есть в массиве");
        } else {
            System.out.println("Такого числа в массиве нету");
        }
    }
}
