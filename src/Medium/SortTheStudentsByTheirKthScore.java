package Medium;

import java.util.*;

public class SortTheStudentsByTheirKthScore {

    public int[][] sortTheStudents(int[][] score, int k) {
        sort(score, 0, score.length - 1, k);
        return score;
    }

    private void sort(int[][] arr, int start, int end,int k) {
        if(start < end) {
            int partitionIndex = partition(arr, start, end, k);
            sort(arr, start, partitionIndex - 1, k);
            sort(arr, partitionIndex + 1, end, k);
        }
    }

    private int partition(int[][] arr, int start, int end,int k) {
        int pivot = arr[end][k];
        int i = start - 1;

        for(int j = start; j < end; j++) {
            if(arr[j][k] > pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);
        return i;
    }

    public void swap(int[][] arr, int i, int j){
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
