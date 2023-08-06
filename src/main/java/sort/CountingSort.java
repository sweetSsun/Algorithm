package sort;

public class CountingSort {
    public int[] countingSort(int[] arrInt, int maxNum) {
        int length = arrInt.length;
        int[] count = new int[maxNum];

        // 0으로 초기화
        for (int i = 0; i < maxNum; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < length; i++) {
            count[arrInt[i] - 1]++;
        }

        int index = 0;
        for (int i = 0; i < maxNum; i++) {
            for (int j = 0; j < count[i]; j++) {
                arrInt[index++] = i+1;
            }
        }

        return arrInt;
    }
}
