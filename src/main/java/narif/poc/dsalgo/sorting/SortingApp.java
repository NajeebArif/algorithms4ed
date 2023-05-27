package narif.poc.dsalgo.sorting;

public class SortingApp {

    public static void main(String[] args) {
        testSelectionSort();
    }

    private static void testSelectionSort() {
        String s = "SORTINGEXAMPLE";
        final var split = s.split("");

        SelectionSort<String> selectionSort = new SelectionSort<>();

        selectionSort.sort(split);

        selectionSort.show(split);
    }
}
