public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder string = new StringBuilder("(" + numbers[0] + numbers[1] + numbers[2] + ") ");
        for (int i = 3; i < numbers.length; i++) {
            string.append(numbers[i]);
            if (i == 5) {
                string.append("-");
            }
        }
        return string.toString();
    }
}