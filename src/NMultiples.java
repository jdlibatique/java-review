import java.util.Arrays;

public class NMultiples{

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(5, 1)));
    }

    public static int[] countBy(int x, int n){
        int[] intArray = new int[x];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = n * (i + 1);
            System.out.println(intArray[i]);
        }
        return intArray;
    }
}