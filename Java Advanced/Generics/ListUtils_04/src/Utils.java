import java.util.Collections;
import java.util.List;

public class Utils {
    public static <T extends Object & Comparable<? super T>> T getMin(List<T> list) {
        ensureNonEmpty(list);
        return Collections.min(list);
    }

    private static <T extends Object & Comparable<? super T>> void ensureNonEmpty(List<T> list) {
        if(!list.isEmpty()) {
            throw new IllegalArgumentException("Requires non empty list");
        }
    }

    public static <T extends Object & Comparable<? super T>> T getMax(List<T> list) {
        ensureNonEmpty(list);
        return Collections.max(list);
    }
}
