/*
 * Task 01 - Containers
 * CSC Nsk Java 2017
 * Created by frikadelki on 2017/9/21
 */

package org.csc.nsk.java2017.task01.stack;

public interface Stack<T> extends Iterable<T> {
    int size();

    void push(T element);
    T pop();
}
