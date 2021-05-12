package javaDataStructuresAndAlgorithms.graphTest;

import javaDataStructuresAndAlgorithms.graphs.Graph;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class GraphTest {
    @Test
    public void testCreateGraph() {
        Graph graph = new Graph();
        int actual = graph.getVertexes().size();
        int expected = 0;
        assertEquals("Should return empty vertex array", expected, actual);
    }

    @Test
    public void testAddNode() {
        Graph graph = new Graph();
        graph.AddVertex(3);
        int actual = (int)graph.getVertexes().get(0);
        int expected = 3;
        System.out.println("This is the actual, " + actual);
        assertEquals("Should return value of 3", expected, actual );
    }

    @Test
    public void testGetNodes() {
        Graph graph = new Graph();
        graph.AddVertex(3);
        graph.AddVertex(5);
        graph.AddVertex(7);
        graph.AddVertex(9);
        ArrayList<Object> actual = graph.GetNodes();
        ArrayList<Object> expected = new ArrayList<Object>(asList(3, 5, 7, 9));
        assertEquals("Should return value of 3, 5, 7, 9", expected, actual);

    }
}
