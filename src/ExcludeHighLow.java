import java.util.Arrays;

public class ExcludeHighLow
{

    public static void main(String[] args) {

    }

    public static int sum(int[] numbers)
    {
        int sum = 0;

        if (numbers.length == 0)
            return 0;

        Arrays.sort(numbers);

        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}