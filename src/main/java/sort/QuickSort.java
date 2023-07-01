package sort;

public class QuickSort {
    private int[] arrInt;

    public int[] quickSort(int[] arrInt) {
        this.arrInt = arrInt;
        recursion(0, arrInt.length-1);

        return this.arrInt;
    }

    private void recursion(int start, int end) {
        if(start >= end) return;

        int key = start;
        int left = start+1;
        int right = end;
        int temp;

        while(left <= right) {
            while(left <= end && arrInt[left] <= arrInt[key]) {
                left++;
            }
            while(right > start && arrInt[right] >= arrInt[key]) {
                right--;
            }

            if(left > right) {
                temp = arrInt[right];
                arrInt[right] = arrInt[key];
                arrInt[key] = temp;
            } else {
                temp = arrInt[right];
                arrInt[right] = arrInt[left];
                arrInt[left] = temp;
            }
        }

        recursion(start, right-1);
        recursion(left, end);
    }

    public int[] reverseQuickSort(int[] arrInt) {
        this.arrInt = arrInt;
        reverseRecursion(0, arrInt.length-1);

        return this.arrInt;
    }

    private void reverseRecursion(int start, int end) {
        if(start >= end) return;

        int key = start;
        int left = start+1;
        int right = end;
        int temp;

        while(left <= right) {
            while(left <= end && arrInt[left] >= arrInt[key]) {
                left++;
            }
            while(right > start && arrInt[right] <= arrInt[key]) {
                right--;
            }

            if(left > right) {
                temp = arrInt[right];
                arrInt[right] = arrInt[key];
                arrInt[key] = temp;
            } else {
                temp = arrInt[right];
                arrInt[right] = arrInt[left];
                arrInt[left] = temp;
            }
        }

        reverseRecursion(start, right-1);
        reverseRecursion(left, end);
    }
}
