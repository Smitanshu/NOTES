# STL in C++

# Supports Generic Programming:

It supports generalized code, enhancing code efficiency. Generic programming allows writing code that works for all data types, facilitating code reuse and avoiding function overloading. This is achieved using templates.

### Advantages:

- Code reusability
- Avoid function overloading

### Examples:

#### Example 1:

```cpp
#include <iostream>
using namespace std;

template <typename T>
T myMax(T x, T y)
{
	return (x > y) ? x : y;
}

int main()
{
	cout << myMax<int>(3, 7) << endl;
	cout << myMax<double>(3.0, 7.0) << endl;
	cout << myMax<char>('g', 'e') << endl;

	return 0;
}

```

#### Example 2:

```cpp
#include <iostream>
using namespace std;

template <typename T>
int size_in_bits(const T &a)
{
    return sizeof(a) * 8;
}

int main()
{
    cout << size_in_bits(2) << endl;
    cout << size_in_bits(2.2) << endl;
    cout << size_in_bits(2.2F) << endl;
    cout << size_in_bits(true) << endl;
    cout << size_in_bits('f') << endl;
    return 0;
}
```

## Components of C++ STL:

### 1. Containers: Array Like data structure.

- vector
- map
- stack
- set
- list

### 2. Iterator: Pointer like objects that allow traversal of containers. Provide range of iterators such as:

- Forward Iterator
- Bidirectional Iterator
- Random Access Iterator

### 3. Functors:Functions objects that can be parameterized in their constructors.

- also known as Functors.

### 4. Algorithm:A collection of algorithm implementations for operations such as search and sort.

- Binary search
- Bubble sort
- Merge sort
- Insertion sort

### 5. Adapter: Adapter are components that modify the behavior of other components in the STL.

# Types of container: Stores object and data

- **1. Sequence Container**:Data structure that can be accessed in sequential manner.

  - vector
  - Array
  - List
  - deque
  - stack
  - forward list(introduced in c++11)

- **2.Associative container** : Implemented sorted data structure.

  > Quickly searched in o(log(n)) time complexity.

  - 1. set
  - 2. map
  - 3. multiset
  - 4. multimap

- **3. Container Adaptor**: Provide different interface for sequential container.

  - 1.  queue
  - 2.  priority queue
  - 3.  stack

- **4. Unsorted Associative container**:implement unordered data structures that can be quickly searched.

  > This are introduce in c++11

  - 1.  unsorted set
  - 2.  unsorted map
  - 3.  unsorted multi_set
  - 4. unsorted multimap

# **Operations on Iterator :**

- **begin() :** Return starting position of container
- **end() :** Return after end position of the container

- **prev() :** This functions return the new iterator that the iterator would point after decrementing the positions mentioned in its arguments

- **next() :** This function return the new iterator that the iterator would point after advancing the position mentioned in its arguments.

- **rbegin() :** Return reverse iterator to the reverse begining of the container.
- **rend() :** Returns reverse iterator to the reverse end of the container.

- **advance() :**
- **inserter() :**
