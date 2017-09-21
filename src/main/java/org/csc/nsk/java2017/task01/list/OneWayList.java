/*
 * Task 01 - Containers
 * CSC Nsk Java 2017
 * Created by frikadelki on 2017/9/21
 */

package org.csc.nsk.java2017.task01.list;

public interface OneWayList<T> extends Iterable<T> {
    int ELEMENT_NOT_FOUND = -1;

    int size();
    T get(int index);

    boolean contains(T element);
    int indexOf(T element);

    void addFirst(T element);
    void add(T element, int index);

    T removeFirst();
    T remove(int index);
}
