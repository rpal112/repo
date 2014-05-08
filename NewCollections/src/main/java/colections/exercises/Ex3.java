package colections.exercises;

import java.util.Iterator;

/**
 * Lets make our own iterable collection. We want to be able to write a
 * "foreach" on our collection. Solution?
 *
 * @author George Trandafir
 *
 */
public class Ex3 {

    public static void main(String[] args) {

        Town<String> myTown = new Town<>();

        /*
         modified cast from Town to String
         */
        for (String town : myTown) {

        }
    }
}

/**
 * class didn't implement Iterable<T>
 *
 * @author -
 * @param <T>
 */
class Town<T> implements Iterable<T> {

    private T type;

    /**
     * methods must be override to compile
     *
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
}
