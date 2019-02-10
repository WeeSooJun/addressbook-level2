package seedu.addressbook.common;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility methods
 */
public class Utils {

    /**
     * Returns true if any of the given items are null.
     */
    public static boolean isAnyNull(Object... items) {
        if (items == null) {
            return false;
        }
        for (Object item : items) {
            if (item == null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true if every element the given collection are unique by {@link Object#equals(Object)}.
     */
    public static boolean elementsAreUnique(Collection<?> items) {
        final Set<Object> testSet = new HashSet<>();
        for (Object item : items) {
            final boolean itemAlreadyExists = !testSet.add(item); // see Set documentation
            if (itemAlreadyExists) {
                return false;
            }
        }
        return true;
    }

    /**
     * Converts each keyword in a set to lowercase
     *
     * @param keywords to generate a the set containing the lowercase of these keywords
     * @return a set of strings all in lower case
     */
    public static Set<String> toLowerCase(Set<String> keywords) {
        final Set<String> result = new HashSet<>();
        for (String string : keywords) {
            result.add(string.toLowerCase());
        }
        return result;
    }
}
