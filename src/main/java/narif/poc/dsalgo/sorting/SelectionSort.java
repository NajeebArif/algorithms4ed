package narif.poc.dsalgo.sorting;

public class SelectionSort<T> implements BaseSortable<T>{

    @Override
    public void sort(Comparable<T>[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (less(a[j], a[min]))
                    min = j;
            }
            exch(a, i, min);
        }
    }

}
