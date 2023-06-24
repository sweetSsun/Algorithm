package org.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    public void selectionSort() {
        int[] arrInt = new int[]{1, 60, 32, 74, 21, 37, 20, 8, 89};

        SelectionSort ss = new SelectionSort();
        int[] actualArr = ss.selectionSort(arrInt);

        int[] expectedArr = Arrays.stream(arrInt).sorted().toArray();

        Assertions.assertArrayEquals(expectedArr, actualArr);
    }
}