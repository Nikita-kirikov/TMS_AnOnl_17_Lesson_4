import java.util.Scanner;
import java.util.Arrays;
public class Zero {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        int result = Arrays.binarySearch(numbers, input);

        if(result > 0 ) {
            System.out.println("Ваше число есть в массиве");
        }
        else {
            System.out.println("Такого числа в массиве нету");
        }
    }
}
