package narif.poc.dsalgo.sorting;

public interface BaseSortable<T> {

    void sort(Comparable<T>[] a);

    default <T> boolean less(Comparable<T> v, Comparable<T> w) {
        return v.compareTo((T) w) < 0;
    }

    default <T> void exch(Comparable<T>[] a, int i, int j) {
        Comparable<T> t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    default <T> void show(Comparable<T>[] a) {
        for (Comparable<T> tComparable : a) {
            System.out.print(tComparable + " ");
        }
        System.out.println();
    }

    default <T> boolean isSorted(Comparable<T>[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }
}
