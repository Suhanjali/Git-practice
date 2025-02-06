import java.util.Arrays;

public class Demo064 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(num));
        if (num.length >= 2) {
            int temp = num[0];
            num[0] = num[num.length - 1];
            num[num.length - 1] = temp;
            System.out.println("Array after swapping first and last element: " + Arrays.toString(num));
        } else {
            System.out.println("Array must have at least two elements.");
        }
    }
}
