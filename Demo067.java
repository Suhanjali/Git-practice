import java.util.Arrays;
public class Demo067 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Even elements of array: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " ");

            }
        }
    }
}