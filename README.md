# Java Data Structures and Algorithms:



### 7 MAY 2021
### Features:
### Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

### 1. AddNode()
- Adds a new node to the graph
- Takes in the value of that node
- Returns the added node
### 2. AddEdge()
- Adds a new edge between two nodes in the graph
- Include the ability to have a “weight”
- Takes in the two nodes to be connected by the edge
    - Both nodes should already be in the Graph
### 3. GetNodes()
- Returns all of the nodes in the graph as a collection (set, list, or similar)
### 4. GetNeighbors()
- Returns a collection of edges connected to the given node
- Takes in a given node
- Include the weight of the connection in the returned collection
### 5. Size()
- Returns the total number of nodes in the graph


### 10 May 2021
### Features:
### Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.

### 11 May 2021
### Features
### Write a function based on the specifications above, which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

## Code Challenge 11:
### Feature Task:
### Create a brand new `PseudoQueue` class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 `Stack` objects. Ensure that you create your class with the following methods:

- `enqueue(value)` which inserts `value` into the PseudoQueue, using a first-in, first-out approach.
- `dequeue()` which extracts a value from the PseudoQueue, using a first-in, first-out approach.
### The `Stack` instances have only `push`, `pop`, and `peek` methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.

## Code Challenge 15
### Feature Task:
- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Create a BinaryTree class 
  - Define a method for each of the depth first traversals called `preOrder`, `inOrder`, and `postOrder` which returns an array of the values, ordered appropriately.
- Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

- Create a BinarySearchTree class
Define a method named `add` that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
Define a method named `contains` that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.





