/** Iterator<T>: defines common methods for traversing-classes. */
public interface Iterator<T> {
    /** @return true if next item exists. */
    boolean hasNext();

    /** @return next item. */
    T next();
}