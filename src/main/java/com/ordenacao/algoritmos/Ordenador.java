package com.ordenacao.algoritmos;

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
            } while (b >= start && info[b] > pivot);             // n

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

    // 2
    public int[] mergeSort(int[] info) {
        int n = info.length -1;                     // 1
        return mergeSort(info, 0, n);         // 1
    }

    // pior caso: O(n) + 2T(n/2) + 4
    //          = T(n) = Θ(n log n)
    // melhor caso: 2
    public int[] mergeSort(int[] info, int start, int end) {
        if (start < end) {                          // 1
            int mid = (start + end) / 2;            // 1
            info = mergeSort(info, start, mid);     // T(n/2)
            info = mergeSort(info, mid + 1, end);   // T(n/2)
            info = merge(info, start, mid, end);    // O(n)
        }
        return info;                                // 1
    }

    // pior caso: 8 + n + n + n(4) + n(3) + n(3)
    //          = 8 + 2n + 4n + 3n + 3n
    //          = 8 + 12n
    // melhor caso: 8 + n
    // ambos os casos são O(n)
    public int[] merge(int[] info, int start, int mid, int end) {
        int leftLength = mid - start + 1;           // 1
        int[] left = new int[leftLength];           // 1

        for (int i = 0; i < leftLength - 1; i++) {  // n
            left[i] = info[start + i];              // 1
        }

        int rightLength = end - mid;                // 1
        int[] right = new int[rightLength + 1];     // 1

        for (int i = 0; i < rightLength; i++) {     // n
            right[i] = info[mid + 1 + i];           // 1
        }

        int cLeft = 0;                              // 1   
        int cRight = 0;                             // 1       

        int i;                                      // 1

        for (i = start; i < end; i++) {             // n
            if(cLeft < leftLength && cRight < rightLength) {  // 1
                if (left[cLeft] <= right[cRight]) {           // 1
                    info[i] = left[cLeft];                    // 1
                    cLeft++;                                  // 1
                } else {
                    info[i] = right[cRight];                  // 1    
                    cRight++;                                 // 1
                }
            } else{
                break;
            }
        }

        while (cLeft < leftLength) {                // n
            info[i] = left[cLeft];                  // 1 
            cLeft++;                                // 1 
            i++;                                    // 1
        }

        while (cRight < rightLength) {              // n
            info[i] = right[cRight];                // 1
            cRight++;                               // 1 
            i++;                                    // 1
        }

        return info;                                // 1
    }
}
 