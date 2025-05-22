public class Ordenador {
    // bubbleSort

    // pior caso: 2 + n * (2 + 5n)
    //          = 2 + 2n + 5n^2
    //          = 5n^2 + 2n + 2
    //          = O(n^2)
    // melhor caso: 2 + n * (2 + 1n)
    //          = 2 + 2n + n^2
    //          = n^2 + 2n + 2
    //          = Ω(n^2)
    //          caso o vetor já esteja ordenado

    // bubblesort não tem recorrencia! então não tem complexidade algoritmica para fazer aqui!
    public int[] bubbleSort(int[] info) {
        int n = info.length;                        // 1
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {           // n 
            swapped = false;                            // 1
            for (int j = 0; j < n - i - 1; j++) {       // n
                if (info[j] > info[j + 1]) {                // 1
                    int temp = info[j];                         // 1  
                    info[j] = info[j + 1];                      // 1
                    info[j + 1] = temp;                         // 1
                    swapped = true;                             // 1
                }
            }

            if (!swapped) {                             // 1
                break;
            }
        }

    return info;                                    // 1
    }

    // quickSort

    // pior caso: (2) + ()
    // melhor caso: (2) + (2)
    //             4
    //             caso o vetor esteja vazio ou tenha apenas 1 elemento
    public int[] quickSort(int[] info){ 
        int n = info.length - 1;                    // 1
        return quickSort(info, 0, n);         // 1
    }

    // pior caso: (2 + 2T(n)) + (2n^2 + 6n + 9)
    //           
    // melhor caso caso: 2
    private int[] quickSort(int[] info, int start, int end) {
        if (start < end) {                                      // 1
            int index = partition(info, start, end);                // 1   
            info = quickSort(info, start, index - 1);               // T(n)
            info = quickSort(info, index + 1, end);                 // T(n)
        }

        return info;                                            // 1
    }

    // pior caso: 9 + n * (n + n + 6)
    //          = 9 + 2n^2 + 6n
    //          = 2n^2 + 6n + 9
    // melhor caso: 9 + n * 8
    //          = 9 + 8n
    //          = 8n + 9
    private int partition(int[] info, int start, int end) {
        int a = start;                                      // 1
        int b = end +1;                                     // 1
        int pivot = info[start];                            // 1

        while (true) {                                      // n
            do {
                a++;                                                // 1
            } while (a <= end && info[a] < pivot);              // n

            do {
                b--;                                                // 1
            } while (b > start && info[b] > pivot);             // n

            if (a >= b) {                                       // 1
                break;
            }

            info = swap(info, a, b);                            // 1 + 4
        }

        info = swap(info, b, start);                        // 1 + 4
        return b;                                           // 1
    }   

    // melhor e pior caso = 4
    private int[] swap(int[] info, int a, int b) {
        int temp = info[a];                         // 1
        info[a] = info[b];                          // 1  
        info[b] = temp;                             // 1
        return info;                                // 1
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
 