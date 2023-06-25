package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortTest {
    @Test
    public void selectionSort() {
        int[] arrInt = {1, 10, 8, 5, 2, 6, 9, 7, 4, 3};

        SelectionSort ss = new SelectionSort();
        int[] actualArr = ss.selectionSort(arrInt);

        int[] expectedArr = Arrays.stream(arrInt).sorted().toArray();

        Assertions.assertArrayEquals(expectedArr, actualArr);
    }


    @Test
    public void bubbleSort() {
        int[] arrInt = {1, 10, 8, 5, 2, 6, 9, 7, 4, 3};

        BubbleSort bs = new BubbleSort();
        int[] actualArr = bs.bubbleSort(arrInt);

        int[] expectedArr = Arrays.stream(arrInt).sorted().toArray();

        Assertions.assertArrayEquals(expectedArr, actualArr);
    }
}