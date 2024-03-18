public class ArraySum{
    public static void main(String[] args) {
        int[] arr = {100, 52, 43, 99, 42, 40, 91};
        int sum = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]% 5 == 0 && arr[i]% 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of numbers divisible by both 5 and 2:" + sum);
    }
}