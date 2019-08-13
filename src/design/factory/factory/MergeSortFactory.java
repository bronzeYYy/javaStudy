package design.factory.factory;

import sort.MergeSort;
import sort.Sort;

public class MergeSortFactory implements SortFactory {
    @Override
    public Sort create() {
        return new MergeSort();
    }
}
