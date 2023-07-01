package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortTest {
    int[] arrInt = {1, 10, 8, 5, 2, 6, 9, 7, 4, 3};
    int[] expectedArr = Arrays.stream(arrInt).sorted().toArray();

    @Test
    public void selectionSort() {
        SelectionSort ss = new SelectionSort();
        int[] actualArr = ss.selectionSort(arrInt);

        Assertions.assertArrayEquals(expectedArr, actualArr);
    }


    @Test
    public void bubbleSort() {
        BubbleSort bs = new BubbleSort();
        int[] actualArr = bs.bubbleSort(arrInt);

        Assertions.assertArrayEquals(expectedArr, actualArr);
    }

    @Test
    public void insertionSort() {
        InsertionSort is = new InsertionSort();
        int[] actualArr = is.insertionSort(arrInt);

        Assertions.assertArrayEquals(expectedArr, actualArr);
    }

    @Test
    public void quickSort() {
        QuickSort qs = new QuickSort();
        int[] actualArr = qs.quickSort(arrInt);

        Assertions.assertArrayEquals(expectedArr, actualArr);
    }
}