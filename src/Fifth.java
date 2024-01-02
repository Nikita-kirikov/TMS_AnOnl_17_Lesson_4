import java.util.Arrays;
public class Fifth {
    public static void Run() {
        int[] array = {8,5,4,9,1,5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
