package droidninja.filepicker;

@FunctionalInterface
public interface Predicate<T> {

    boolean apply(T t);
}
