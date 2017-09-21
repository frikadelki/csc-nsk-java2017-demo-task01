/*
 * Task 01 - Containers
 * CSC Nsk Java 2017
 * Created by frikadelki on 2017/9/21
 */

package org.csc.nsk.java2017.task01;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Stack_(abstract_data_type)">Stack Data Type</a>
 * @param <TElement> type of elements this stack will hold
 */
public interface Stack<TElement> extends Iterable<TElement> {
    int size();

    void push(TElement element);
    TElement pop();
}
