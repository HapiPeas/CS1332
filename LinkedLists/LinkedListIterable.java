import java.util.Iterator;

public class LinkedListIterable<T> implements Iterable<T> {
    
    public Iterator<T> iterator() {
        return new LLIterator<>();
    }

    private class LLIterator implements Iterator<T> {
        private Node<T> curr;
        LLIterator () {
            curr = head;
        }
        public boolean hasNext() {
            return curr != null;
        }
        public T next() {
            if (hasNext()) {
                T temp = curr.data;
                curr = curr.next;
                return temp;
            }
            return null;
        }
    }

    public static main (String[] args) {
        LinkedListIterable<String> courses = new LinkedListIterable<String>();
        // Assume list has been populated

        for (String course : courses) {
            // Do work that doesn't modify list
            // a for-each loop is only possible due to implementation of Iterable<T> as Iterator<t> iterator()
        }

        Iterator<String> courseIt = courses.iterator();
        while (courseIt.hasNext()) {
            String data = courseIt.next();
            // Do work with the data here
        }
    }
}