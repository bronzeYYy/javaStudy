package design.factory.factory;

import sort.Qsort;
import sort.Sort;

public class QSortFactory implements SortFactory {
    @Override
    public Sort create() {
        return new Qsort();
    }
}
