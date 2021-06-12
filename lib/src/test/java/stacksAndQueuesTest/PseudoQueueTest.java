package stacksAndQueuesTest;

import javaDataStructuresAndAlgorithms.stacksAndQueues.PseudoQueue;
import javaDataStructuresAndAlgorithms.stacksAndQueues.Stack;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PseudoQueueTest {
    @Test public <T> void PseudoQueueTest(){
        Stack<Object> main = new Stack<>();
        Stack<Object> temp = new Stack<Object>();
        PseudoQueue<Object> pQTest = new PseudoQueue<Object>(main, temp);
        pQTest.enqueue(4);
        pQTest.enqueue(3);
        pQTest.enqueue(2);
        pQTest.enqueue(1);
        String expectedQueue = "1 -> 2 -> 3 -> 4 -> NULL";
        String actualQueue =  pQTest.getMain().toString(); // {1} -> {2} -> {3} -> {4}
        assertEquals("Should create a new stack",expectedQueue,actualQueue);
    }

    @Test public <T> void dequeueTest(){
        Stack<Object> main = new Stack<>();
        Stack<Object> temp = new Stack<>();
        PseudoQueue<Object> pQTest = new PseudoQueue<Object>(main, temp);
        pQTest.enqueue(4);
        pQTest.enqueue(3);
        pQTest.enqueue(2); // {2} -> {3} -> {4} -> NULL
        pQTest.dequeue(); // {2} -> {3} -> NULL
        System.out.println(pQTest.getMain().toString());
    }

    @Test public <T> void errorTest(){
        Stack<Object> main = new Stack<>();
        Stack<Object> temp = new Stack<>();
        PseudoQueue<Object> pQTest = new PseudoQueue<Object>(main,temp);
        assertThrows("Should throw error when calling deque on empty stack",
                EmptyStackException.class, pQTest::dequeue);
    }
}
