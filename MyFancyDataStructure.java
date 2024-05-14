import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class MyFancyDataStructure {
}

class Value implements Comparable<Value> {

    private final int value;
    private static boolean SORT_LOWER = true;

    public Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static boolean isSortLower() {
        SORT_LOWER = true;
        return SORT_LOWER;
    }

    public static boolean isSortHigher() {
        SORT_LOWER = false;
        return SORT_LOWER;
    }

    public static void setSortLower() {
        SORT_LOWER = true;
    }

    public static void setSortHigher() {
        SORT_LOWER = false;
    }

    @Override
    public int compareTo(Value other) {
        if (SORT_LOWER) {
            return Integer.compare(this.value, other.value);
        } else {
            return Integer.compare(other.value, this.value);
        }
    }

    public String toString() {
        return Integer.toString(value);
    }
}

class PreferHigherValues implements Comparator<Value> {

    @Override
    public int compare(Value N1, Value N2) {
        return Integer.compare(N2.getValue(), N1.getValue());
    }
}

class PreferLowerValues implements Comparator<Value> {

    @Override
    public int compare(Value N1, Value N2) {
        return Integer.compare(N1.getValue(), N2.getValue());
    }
}
