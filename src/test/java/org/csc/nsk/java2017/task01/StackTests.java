/*
 * Task 01 - Containers
 * CSC Nsk Java 2017
 * Created by frikadelki on 2017/9/21
 */

package org.csc.nsk.java2017.task01;


import lombok.val;
import org.junit.Assert;
import org.junit.Test;

public final class StackTests {
    private Stack<Integer> newIntegersStack() {
        return StackFactory.newStack();
    }

    @Test
    public void testStackSize() {
        val stack = newIntegersStack();
        Assert.assertTrue(stack.size() == 0);

        val value = 0;

        stack.push(value);
        Assert.assertTrue(stack.size() == 1);

        stack.pop();
        Assert.assertTrue(stack.size() == 0);
    }

    @Test
    public void testPushPop() {
        val stack = newIntegersStack();
        val value = 0;

        stack.push(value);
        val poppedValue = stack.pop();
        Assert.assertTrue(poppedValue == value);
    }
}
