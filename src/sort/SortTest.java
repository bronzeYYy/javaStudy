package sort;

import design.factory.SimpleSortFactory;
import design.template.SortTestTemplate;

public class SortTest {
    public static void main(String[] args) {
        SortTestTemplate sortTestTemplate = new SortTestTemplate() {
            @Override
            protected Sort getSort() {
                return SimpleSortFactory.getSort("qSort");
            }
        };
        sortTestTemplate.test(200);
    }
}
