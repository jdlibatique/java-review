import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageIntegers {
    public static void main(String[] args) throws IOException {
        minMaxAve(null, 0, 0);
    }

    public static void minMaxAve(int[] iNum, int iMin, int iMax) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        iNum = new int[5];
        for (int i = 0; i < iNum.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            iNum[i] = Integer.parseInt(reader.readLine());
        }
        int sum = 0;
        iMax = -2147483648;
        iMin = 2147483647;
        for (int number : iNum) {
            if (number < iMin) {
                iMin = number;
            }
            if (number > iMax) {
                iMax = number;
            }
            sum += number;
        }
        float average = (float) sum / iNum.length;
        System.out.println("Average of " + iNum.length + " numbers: " + average);
        System.out.println("Minimum value entered: " + iMin);
        System.out.println("Maximum value entered: " + iMax);
    }
}
