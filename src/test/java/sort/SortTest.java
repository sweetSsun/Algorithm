package sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortTest {
    int[] arrInt;
    int[] expectedArr;

    @BeforeEach
    public void init() {
        // 1~100 사이의 길이 생성
        int length = (int) (Math.random() * 100) + 1;
        arrInt = new int[length];

        for(int i = 0; i < length; i++) {
            // 1~1000 사이의 난수를 배열에 입력
            arrInt[i] = (int) (Math.random() * 30) + 1;
        }

        expectedArr = Arrays.stream(arrInt). sorted().toArray();
    }

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

    @Test
    public void revertQuickSort() {
        Integer[] expectedReverseArr = Arrays.stream(arrInt).boxed().toArray(Integer[]::new);
        Arrays.sort(expectedReverseArr, Comparator.reverseOrder());

        QuickSort qs = new QuickSort();
        int[] actualArr = qs.reverseQuickSort(arrInt);

        Assertions.assertArrayEquals(expectedReverseArr, Arrays.stream(actualArr).boxed().toArray(Integer[]::new));
    }

    @Test
    public void mergeSort() {
        MergeSort ms = new MergeSort();
        int[] actualArr = ms.mergeSort(arrInt);

        Assertions.assertArrayEquals(expectedArr, actualArr);
    }

    @Test
    public void heapSort() {
        HeapSort hs = new HeapSort();
        int[] actualArr = hs.heapSort(arrInt);

        Assertions.assertArrayEquals(expectedArr, actualArr);
    }
}