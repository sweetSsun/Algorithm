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
        int i = start+1;
        int j = end;
        int temp;

        while(i <= j) {
            while(i <= end && arrInt[i] <= arrInt[key]) {
                i++;
            }
            while(j > start && arrInt[j] >= arrInt[key]) {
                j--;
            }

            if(i > j) {
                temp = arrInt[j];
                arrInt[j] = arrInt[key];
                arrInt[key] = temp;
            } else {
                temp = arrInt[j];
                arrInt[j] = arrInt[i];
                arrInt[i] = temp;
            }
        }

        recursion(start, j-1);
        recursion(i, end);
    }
}
