/*
 * Task 01 - Containers
 * CSC Nsk Java 2017
 * Created by frikadelki on 2017/9/21
 */

package org.csc.nsk.java2017.task01;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Linked_list#Singly_linked_list">Singly Linked List</a>
 * @param <TElement> type of elements this List will hold
 */
public interface OneWayList<TElement> extends Iterable<TElement> {
    int ELEMENT_NOT_FOUND = -1;

    int size();
    TElement get(int index) throws IndexOutOfBoundsException;

    boolean contains(TElement element);
    int indexOf(TElement element);

    void addFirst(TElement element);
    void add(TElement element, int index) throws IndexOutOfBoundsException;

    TElement removeFirst() throws IndexOutOfBoundsException;
    TElement remove(int index) throws IndexOutOfBoundsException;
}
