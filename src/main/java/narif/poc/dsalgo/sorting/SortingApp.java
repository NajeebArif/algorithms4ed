package narif.poc.dsalgo.sorting;

public class SortingApp {

    public static void main(String[] args) {
        testSelectionSort();

        testInsertionSort();
    }

    private static void testInsertionSort() {
        String s = "SORTINGEXAMPLE";
        final var split = s.split("");
        InsertionSort<String> insertionSort = new InsertionSort<>();
        insertionSort.sort(split);
        insertionSort.show(split);
    }

    private static void testSelectionSort() {
        String s = "SORTINGEXAMPLE";
        final var split = s.split("");

        SelectionSort<String> selectionSort = new SelectionSort<>();

        selectionSort.sort(split);

        selectionSort.show(split);
    }
}
