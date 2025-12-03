/** Container<T>: provides an iterator. */
public interface Container<T> {
    /** @return an Iterator for this container. */
    Iterator<T> createIterator();
}