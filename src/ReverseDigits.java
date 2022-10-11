import java.util.Arrays;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(3531)));
    }
    public static int[] digitize(long n) {
        int[] inputArray = Long.toString(n).chars().map(c -> c-'0').toArray();
        for (int i = 0; i < inputArray.length / 2; i++) {
            inputArray[i] = inputArray[i] + inputArray[inputArray.length - 1 - i];
            inputArray[inputArray.length - 1 - i] = inputArray[i] - inputArray[inputArray.length - 1 - i];
            inputArray[i] = inputArray[i] - inputArray[inputArray.length - 1 - i];
        }
        return inputArray;
    }
}
