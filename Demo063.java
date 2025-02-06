import java.util.Arrays;
public class Demo063 {
    public static void main(String[] args) {
        int[] num = {5, 10, 15, 20, 25};
        if (num.length >= 2) {
            int sum = num[0] + num[num.length - 1];
            System.out.println("Array: " + Arrays.toString(num));
            System.out.println("Sum of 1st and last element: " + sum);
        } else {
            System.out.println("Array must have at least two elements.");
        }
    }
}
