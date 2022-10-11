import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 43, 123, 3, 0, 100};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    
    public static int[] selectionSort(int[] input) {
        for (int position = 0; position < input.length - 1; position++) { // -1 we cant compare the last position with anything -> array already sorted
            int minValuePos = position; // at the start of search, we assume that the min value is at current position
            
            // find out on which position in array the smallest value is (excluding the already done part)
            for (int i = position; i < input.length; i++) {
                if (input[i] < input[minValuePos]) {
                    minValuePos = i;
                }
            }
            
            // switch minimum value to current position in array and other value to that pos
            int valueToSwitch = input[position];
            
            input[position] = input[minValuePos];
            input[minValuePos] = valueToSwitch;
        }
        return input;
    }
}