import java.util.Scanner;

public class SubArrayExample {
    public int[] getSubArray(int[] arr, int start, int end) {
        if (arr == null || start < 0 || end > arr.length || start > end) {
            throw new IllegalArgumentException("Invalid start or end index");
        }

        int[] result = new int[end - start];
        int index = 0;

        for (int i = start; i < end; i++) {
            result[index] = arr[i];
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            SubArrayExample obj = new SubArrayExample();

            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the start index (inclusive): ");
            int start = sc.nextInt();

            System.out.print("Enter the end index (exclusive): ");
            int end = sc.nextInt();

            int[] result = obj.getSubArray(arr, start, end);

            if (result.lenth > 0) {
                System.out.println("Sub-array elements: ");
                for (int num : result) {
                    System.out.print(num + " ");
                } else {
                    System.out.println("The sub-array is empty")
                }
            }
        }
    }
}