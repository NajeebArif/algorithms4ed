package narif.poc.dsalgo.sorting;

public class InsertionSort<T> implements BaseSortable<T> {
    @Override
    public void sort(Comparable<T>[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            // insert a[i] among a[i-1], a[i-2], .....
            for (int j = i; j>0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }
}
