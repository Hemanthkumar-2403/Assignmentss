
// Assignment 8: Function + Array – Count How Many Are Divisible by 3

public class assi8 {

    
    public static int countdiv(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, 9, 10, 12};

        int result = countdiv(numbers);

        System.out.println("Count of numbers divisible by 3: " + result);
    }
}
