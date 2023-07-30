package sort;

public class HeapSort {
    public int[] heapSort(int[] arr) {
        topDownHeapify(arr);

        for(int i = arr.length - 1; i > 0; i--) {
            // 최대힙을 만들었으므로 정렬된 값 제외하면, 인덱스 0에 있는 값이 최대값
            if (arr[0] > arr[i]) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
            downTopHeapify(arr, i);
        }

        return arr;
    }

    public void topDownHeapify(int[] arr) {
        int num =  arr.length;

        for (int i = 1; i < num; i++) {
            int child = i;
            while (child != 0) {
                int parent = (child - 1) / 2;
                if (arr[parent] < arr[child]) {
                    int temp = arr[parent];
                    arr[parent] = arr[child];
                    arr[child] = temp;
                }
                child = parent;
            }
        }
    }

    public void downTopHeapify(int[] arr, int sortedIndex) {
        int num = sortedIndex;

        int parent = 0;
        int child;
        while(parent <= num / 2) {
            child = parent * 2 + 1;
            // 처음 힙구조 만드는 것이 아닌 경우, 정렬된 인덱스 이후로는 탐색 중지
            if (child >= num) {
                break;
            }
            // 자식노드 중에 큰 값을 탐색
            if (child < num-1 && arr[child] < arr[child+1]) {
                child++;
            }
            // 부모노드보다 자식노드가 더 크면 값 교체 (최대힙 만들기)
            if (arr[parent] < arr[child]) {
                int temp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = temp;
            }
            parent++;
        } ;
    }
}
