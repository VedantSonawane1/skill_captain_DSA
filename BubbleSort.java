public class BubbleSort {
    public void bubbleSort(int[] arr, int n) {
        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        sorter.bubbleSort(arr, n);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
