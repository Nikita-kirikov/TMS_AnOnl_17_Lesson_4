import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int[] numbers = {1,2,4,3,2,1,2,3};
        int count = 0;

        for (int n : numbers) {
            if (n != input) {
                count++;
            }
        }

        int[] copyNumbers = new int[count];

        if ( count > 0) {
            for (int i =0, j = 0; i < numbers.length; i++) {
                if (input != numbers[i]) {
                    copyNumbers[j] = numbers[i];
                    j++;
                }
            }
        }

        System.out.println(Arrays.toString(copyNumbers));

    }
}
