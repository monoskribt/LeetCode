package Easy;

public class SortThePeople {

    public static String[] sortPeople(String[] names, int[] heights) {
        int[] indices = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            indices[i] = i;
        }

        quickSort(indices, heights, 0, names.length - 1);

        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            result[i] = names[indices[i]];
        }

        return result;

    }


    private static void quickSort(int[] indices, int[] heights, int start, int end) {
        if(start < end) {
            int partitionIndex = partition(indices, heights, start, end);
            quickSort(indices, heights, start, partitionIndex - 1);
            quickSort(indices, heights, partitionIndex + 1, end);
        }
    }


    private static int partition(int[] indices, int[] heights, int start, int end) {
        int pivotIndex = (start + end) / 2;
        int pivot = heights[indices[pivotIndex]];

        swap(indices, pivotIndex, end);

        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (heights[indices[j]] >= pivot) {
                i++;
                swap(indices, i, j);
            }
        }


        swap(indices, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] indices, int i, int j) {
        int temp = indices[i];
        indices[i] = indices[j];
        indices[j] = temp;
    }
}
