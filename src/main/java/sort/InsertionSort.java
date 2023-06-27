package sort;

public class InsertionSort {
    public int[] insertionSort(int[] arrInt) {
        int length = arrInt.length;
        int i, j, temp;

        for (i = 0; i < length-1; i++) {
            j = i;
            while (arrInt[j] > arrInt[j+1]) {
                temp = arrInt[j+1];
                arrInt[j+1] = arrInt[j];
                arrInt[j] = temp;
                j--;
            }
        }

        return arrInt;
    }
}
