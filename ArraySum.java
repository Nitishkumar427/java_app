public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int sum = 0;
        for(int n : arr) {
            sum += n;
        }
        System.out.println("Sum of array = " + sum);
    }
}
