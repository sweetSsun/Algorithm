package org.sort;

public class SelectionSort {
    public int[] selectionSort(int[] arrInt) {
        int length = arrInt.length;
        int i, j, index, min, temp;

        for (i = 0; i < length; i++) {
            index=i;
            min = arrInt[i];

            for (j = i; j < length; j++) {
                if (min > arrInt[j]) {
                    min = arrInt[j];
                    index = j;
                }
            }

            temp = arrInt[i];
            arrInt[i] = min;
            arrInt[index] = temp;
        }

        return arrInt;
    }
}
