/*
 * Task 01 - Containers
 * CSC Nsk Java 2017
 * Created by frikadelki on 2017/9/21
 */

package org.csc.nsk.java2017.task01.impl.frikadelki;

import org.csc.nsk.java2017.task01.Stack;

import java.util.Iterator;

public final class DummyStack<T> implements Stack<T> {
    private T value = null;

    @Override
    public int size() {
        return (value != null) ? 1 : 0;
    }

    @Override
    public void push(final T element) {
        value = element;
    }

    @Override
    public T pop() {
        final T popped = value;
        value = null;
        return popped;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private T capturedValue = value;

            @Override
            public boolean hasNext() {
                return capturedValue != null;
            }

            @Override
            public T next() {
                final T consumed = value;
                capturedValue = null;
                return consumed;
            }
        };
    }
}
