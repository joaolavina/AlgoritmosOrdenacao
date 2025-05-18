public class Ordenador {
    // bubbleSort

    public int[] bubbleSort(int[] info) {
        int n = info.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (info[j] > info[j + 1]) {
                    int temp = info[j];
                    info[j] = info[j + 1];
                    info[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return info;
    }

    // quickSort

    public int[] quickSort(int[] info){ 
        int n = info.length - 1;
        return quickSort(info, 0, n);
    }

    private int[] quickSort(int[] info, int start, int end) {
        if (start < end) {
            int index = partition(info, start, end);
            info = quickSort(info, start, index - 1);
            info = quickSort(info, index + 1, end);
        }

        return info;
    }

    private int partition(int[] info, int start, int end) {
        int a = start;
        int b = end +1;
        int pivot = info[start];

        while (true) {
            do {
                a++;
            } while (a <= end && info[a] < pivot);

            do {
                b--;
            } while (b > start && info[b] > pivot);

            if (a >= b) {
                break;
            }

            info = swap(info, a, b);
        }

        info = swap(info, b, start);
        return b;
    }   

    private int[] swap(int[] info, int a, int b) {
        int temp = info[a];
        info[a] = info[b];
        info[b] = temp;
        return info;
    }

    // mergeSort

    public int[] mergeSort(int[] info) {
        int n = info.length -1;
        return mergeSort(info, 0, n);
    }

    public int[] mergeSort(int[] info, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            info = mergeSort(info, start, mid);
            info = mergeSort(info, mid + 1, end);
            info = merge(info, start, mid, end);
        }
        return info;
    }

    public int[] merge(int[] info, int start, int mid, int end) {
        int leftLength = mid - start + 1;
        int[] left = new int[leftLength];

        for (int i = 0; i < leftLength - 1; i++) {
            left[i] = info[start + i];
        }

        int rightLength = end - mid;
        int[] right = new int[rightLength + 1];

        for (int i = 0; i < rightLength; i++) {
            right[i] = info[mid + 1 + i];
        }

        int cLeft = 0;
        int cRight = 0;

        int i;

        for (i = start; i < end; i++) {
            if(cLeft < leftLength && cRight < rightLength) {
                if (left[cLeft] <= right[cRight]) {
                    info[i] = left[cLeft];
                    cLeft++;
                } else {
                    info[i] = right[cRight];
                    cRight++;
                }
            } else{
                break;
            }
        }

        while (cLeft < leftLength) {
            info[i] = left[cLeft];
            cLeft++;
            i++;
        }

        while (cRight < rightLength) {
            info[i] = right[cRight];
            cRight++;
            i++;
        }

        return info;
    }
}
 