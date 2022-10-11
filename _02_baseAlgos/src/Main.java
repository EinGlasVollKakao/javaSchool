import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 3, 100, 200};
    
        System.out.println(Arrays.toString(revert(data)));
        System.out.println(min(data));
        System.out.println(max(data));
    }
    
    public static int[] revert(int[] input) {
        int[] reverted = new int[input.length];
        int pos = 0;
        
        for (int i = input.length - 1; i >= 0; i--) {
            reverted[pos] = input[i];
            pos++;
        }
        
        return reverted;
    }
    
    public static int min(int[] input) {
        int minValue = input[0];
        
        for (int i = 1; i < input.length; i++) {
            if (input[i] < minValue) {
                minValue = input[i];
            }
        }
        return minValue;
    }
    
    public static int max(int[] input) {
        int maxValue = input[0];
        
        for (int i = 1; i < input.length; i++) {
            if (input[i] > maxValue) {
                maxValue = input[i];
            }
        }
        return maxValue;
    }
}