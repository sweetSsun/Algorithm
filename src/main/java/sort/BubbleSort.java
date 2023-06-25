package sort;

public class BubbleSort {
    public int[] bubbleSort(int[] arrInt) {
        int length = arrInt.length;
        int i, j, temp;

        for(i = 0; i < length; i++) {
            for(j = 0; j < length-1-i; j++) {
                if (arrInt[j] > arrInt[j+1]) {
                    temp = arrInt[j+1];
                    arrInt[j+1] = arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }

        return arrInt;
    }
}
