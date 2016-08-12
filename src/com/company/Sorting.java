package com.company;

import java.util.ArrayList;

/**
 * Created by 김동준 on 2016-08-08.
 */
public class Sorting {
    int arr[] = new int[]{2, 3, 5, 1, 4};

    public Sorting() {
        Merge(arr, 0, arr.length - 1);
    }


    public void Merge(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            Merge(arr, start, mid);
            Merge(arr, mid + 1, end);
            process(arr, start, mid, end);
        }

    }

    public void process(int arr[], int start, int mid, int end) {
        int temp[] = new int[arr.length];
        int i, j, k, m, n;
        i = start;
        j = mid + 1;
        k = start;

        while (i <= mid && j <= end) {
            temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];
        }

        m = (i > mid) ? j : i;
        n = (i > mid) ? end : mid;

        for (; m <= n; m++) {
            temp[k++] = arr[m];
        }

        for (m = start; m <= end; m++) {
            arr[m] = temp[m];
        }
        System.out.println();
        print(arr);

    }

    public void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
