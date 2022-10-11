import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountToInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer value to count to: ");
        int n = Integer.parseInt(reader.readLine());
        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }
    }
}
