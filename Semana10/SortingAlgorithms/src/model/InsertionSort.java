package model;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public  void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }

    //try doing it with arraylist
    public void insertionSort(ArrayList<Integer> array) {
        int size = array.size();

        for (int step = 1; step < size; step++) {
            int key = array.get(step);
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array.get(j)) {
                array.set(j + 1, array.get(j));
                --j;
            }

            // Place key at after the element just smaller than it.
            array.set(j + 1, key);
        }
    }



    //try doing it with list
    public static void insertionSortList(List<Integer> array) {
        int size = array.size();

        for (int step = 1; step < size; step++) {
            int key = array.get(step);
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array.get(j)) {
                array.set(j + 1, array.get(j));
                --j;
            }

            // Place key at after the element just smaller than it.
            array.set(j + 1, key);
        }
    }

    //method to find the median of a list of integers
    public int findMedian(ArrayList<Integer> array) {
        int size = array.size();
        int median = 0;
        if (size % 2 == 0) {
            median = (array.get(size / 2) + array.get((size / 2) - 1)) / 2;
        } else {
            median = array.get(size / 2);
        }
        return median;
    }

    //doit with LIST
    public int findMedianList(ArrayList<Integer> array) {
        int size = array.size();
        int median = 0;
        if (size % 2 == 0) {
            median = (array.get(size / 2) + array.get((size / 2) - 1)) / 2;
        } else {
            median = array.get(size / 2);
        }
        return median;
    }

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     *
     * sample input 1:
     * 12
*-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470
* sample output 1:
* -520 -470 -20 30
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        insertionSortList(arr);
        int minDiff = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i + 1));
            if (diff < minDiff) {
                minDiff = diff;
                result.clear();
                result.add(arr.get(i));
                result.add(arr.get(i + 1));
            } else if (diff == minDiff) {
                result.add(arr.get(i));
                result.add(arr.get(i + 1));
            }
        }
        return result;
    }


}
