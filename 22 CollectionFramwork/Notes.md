## Collection

- A collection is Simply an object that represents a group of objects, known as its elements.

## Collection Framework

- It provides a set of interfaces and classes that help in managing groups of object

- before the introduction of the collection framework in jdk 1.2, java used to rely on a variety of classes like Vector, Stack,HashTable and arrays to store and manipulate the groups of objects.

## However these classes had several drawbacks

- inconsistency : Each class had a different way of managing collections , leading to confusion and a steep learning curve.
- lack of inter-operability : these classes were not designed to work together seamlessly.
- No Common interface : There was no common interface for all these classes , which meant you couldn't write generic algorithms that could operate on different types of collections.

- Collection --> the root interface for all the other collection types.
- List --> an ordered collection that can contain duplicate elements(ArrayList Li nkedList)
- Set --> A collection that can not contain duplicate elements.
- Queue --> A collection designed for holding elements prior to processing
- Deque --> A double ended queue that allows insertion and removal from both ends
- map --> an interface that represents a collection of key-value pairs.
