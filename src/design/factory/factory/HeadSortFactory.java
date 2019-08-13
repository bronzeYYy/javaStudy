package design.factory.factory;

import sort.HeadSort;
import sort.Sort;

public class HeadSortFactory implements SortFactory{
    @Override
    public Sort create() {
        return new HeadSort();
    }
}
