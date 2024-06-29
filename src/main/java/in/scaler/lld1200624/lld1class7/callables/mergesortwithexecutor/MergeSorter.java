package in.scaler.lld1200624.lld1class7.callables.mergesortwithexecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;

    public MergeSorter(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public List<Integer> call() throws Exception {
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }
        int mid = arrayToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            leftArray.add(arrayToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();
        for (int i = mid; i < arrayToSort.size(); i++) {
            rightArray.add(arrayToSort.get(i));
        }

        in.scaler.lld1200624.lld1class7.callables.mergesortwithoutthread.MergeSorter leftMergeSorter = new in.scaler.lld1200624.lld1class7.callables.mergesortwithoutthread.MergeSorter(leftArray);
        in.scaler.lld1200624.lld1class7.callables.mergesortwithoutthread.MergeSorter rightMergeSorted = new in.scaler.lld1200624.lld1class7.callables.mergesortwithoutthread.MergeSorter(rightArray);

        List<Integer> leftSortedArray = leftMergeSorter.call();
        List<Integer> rightSortedArray = rightMergeSorted.call();

        // Merge both sorted halves
        List<Integer> sortedArray = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                ++i;
            } else {
                sortedArray.add(rightSortedArray.get(i));
                ++j;
            }
        }
        // Add remaining elements
        if( i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            ++i;
        }
        if(j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            ++j;
        }
        return sortedArray;
    }
}