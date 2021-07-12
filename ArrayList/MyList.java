package ArrayList;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(Object e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;

    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = 0; i < size; i++) { // a b c d e f
                //
                if(i >= index) {
                    element[i] = element[i+1];
                }
            }
            size--;
        }


    }


    public Object get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("index" + i + " size " + i);
        }
        return (E) element[i];
    }

    public void clear() {
        element = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public Object clone() {
        return (Object) element;
    }

    public Object indexOf(Object i) {
        for (int j = 0; j < size; j++) {
            if (element[j].equals(i)) {
                return j;
            }

        }
        return -1;
    }

    public boolean contains(Object e) {
        for (Object x : element
        ) {
            if (e.equals(x)) {
                return true;
            }

        }
        return false;
    }

}
