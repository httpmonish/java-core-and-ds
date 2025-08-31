import java.util.Arrays;

public class rightrotation {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining n-k elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse entire array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int A[] = {3, 9, 0, 6, 5, 3, 2, 4, 7, 6};
        int k = 3; // Number of positions to rotate left

        System.out.println("Original Array: " + Arrays.toString(A));
        rotateLeft(A, k);
        System.out.println("Left Rotated Array: " + Arrays.toString(A));
    }
}
