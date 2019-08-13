package sort;

import design.factory.SimpleSortFactory;
import design.factory.factory.HeadSortFactory;
import design.factory.factory.SortFactory;
import design.template.SortTestTemplate;

import java.util.Comparator;

public class SortTest {
    public static void main(String[] args) {
        /*SortTestTemplate sortTestTemplate = new SortTestTemplate() {
            @Override
            protected Sort getSort() {
                return SimpleSortFactory.getSort("qSort");
            }
        };
        sortTestTemplate.test(200);*/
        SortFactory sortFactory = new HeadSortFactory();
        SortTestTemplate sortTestTemplate = new SortTestTemplate() {
            @Override
            protected Sort getSort() {
                return sortFactory.create();
            }
        };
        sortTestTemplate.test(100);
    }
}
