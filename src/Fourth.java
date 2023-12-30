import java.util.Arrays;
import java.util.Scanner;
public class Fourth {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        boolean isFlag = false;
        int input = 0;

        while(!isFlag && scan.hasNext()) {
            input = scan.nextInt();
            if(input <= 5 || input > 10) {
                System.out.println("Попробуйте еще раз");
            }
            else {
                isFlag = true;
            }
        }

            int[] array = new int[input];
            int size = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
                System.out.println(array[i]);

                if (array[i] % 2 == 0) {
                    size++;
                }
            }

            if(size != 0 ) {
                int[] array2 = new int[size];
                for (int i = 0, j = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        array2[j] = array[i];
                        j++;
                    }
                }
                System.out.println(Arrays.toString(array2));
            }
    }
}
