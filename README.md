# Java-Collection
# Java-Collection

Collection:
To store and manipulate a group of objects.
We have interfaces, classes and algorithms with these collections.
We can always use different collections at different times.
Iterable Interface:
Root Interface and provides Iterator interface.

Iterator Interface:
Facility of iterating the collection in forward direction.
Only has 3 methods: hasNext(), next(), remove()

public Object next()  ->  gives next object
public void remove() -> removes last element provided by iterator 
public boolean hasNext() -> checks if has next element


#List:
Might contain duplicate elements.
Dynamic Array.
Implementations:

ArrayList
Vector 
LinkedList 

#Queue:
The FIFO approach has been followed by a queue.
It has implemented the list interface and the queue interface.

Methods in queue:
add()
poll()
peek()

Implementations:
LinkedList: FIFO
PriorityQueue:  Naturally Ordered (ascending) and can provide ordering at constructor time by comparator.. -> Heap (Min Heap, and Max Heap)
UseCases: BFS, Level Order Traversal.

#Set:
Refers to a collection that does not contain the duplicates.

Implementations:
HashSet
LinkedHashset
TreeSet
UseCases: Count of characters in a string, Unique visitors

#Map:
Data stored in <key, value> pair with no duplicate keys associated.
Implementations:
hashMap
LinkedHashmap
TreeMap
UseCases: Rate Limiting, find frequency of characters in a string, total hits on website

#Arrays and Collections:
Provides Several static methods that can be used to perform many tasks directly on arrays and collections.

Fill an array or collection with a certain value.
Sort an array/collection.
Search in array/collection.


#Serialization and DeSerialization:
Serialization is a mechanism of converting a state of an object into a byte stream.
DeSerialization is a reverse process where the byte stream is used to recreate actual java objects in memory.

#Streams:
Sequence of objects that supports various methods which can be pipelined.
Streams do not change the data structure, but provide the results as per the pipelined methods



