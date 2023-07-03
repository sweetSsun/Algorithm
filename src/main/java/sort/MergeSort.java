package sort;

public class MergeSort {
    private int sorted[];

    public int[] mergeSort(int[] arrInt) {
        int length = arrInt.length;
        this.sorted = new int[length];

        recursion(arrInt, 0, length - 1);

        return sorted;
    }

    private void recursion(int[] arrInt, int m, int n) {
        if (m < n) { // 크기가 1보다 큰 경우
            int middle = (m + n) / 2;
            recursion(arrInt, m, middle);
            recursion(arrInt, middle + 1, n);
            merge(arrInt, m, middle, n);
        }
    }

    private void merge(int[] arr, int m, int middle, int n) {
        int i = m;
        int j = middle + 1;
        int k = m;

        while (i <= middle && j <= n) {
            this.sorted[k] = arr[i] <= arr[j]
                    ? arr[i++]
                    : arr[j++];
            k++;
        }
        if (i > middle) {
            for (; k <= n; k++) {
                this.sorted[k] = arr[j++];
            }
        } else {
            for (; k <= n; k++) {
                this.sorted[k] = arr[i++];
            }
        }

        for(int t = m; t <= n; t++) {
            arr[t] = sorted[t];
        }
    }
}
