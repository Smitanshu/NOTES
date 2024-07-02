# Linked-List Implementation

## Overview
This project provides a basic implementation of a singly linked list in C++.
- The linked list supports various operations such as:
  - Insertion at Head.
  - Insertion at tail.
  - Insertion at middle.

## Guidelines:

### Printing the Linked List:
- Do not use the original pointer of the head node for printing.
- Create a temporary node and use it to traverse and print the linked list.

### Inserting a Node:
- Always pass the head using a reference when inserting a node.


## Steps for Inserting a Node

### Create a New Node:
- Allocate memory for the new node.
- Assign the data to the new node.

### Check if the List is Empty:
- If the head is `NULL`, make the new node the head of the list.

### Traverse to the End of the List:
- Create a temporary node and initialize it to the head.
- Traverse the list until you reach the last node.

### Insert the New Node:
- Set the `next` pointer of the last node to the new node.
- Set the `next` pointer of the new node to `NULL`.

## Example Code

print funtion :

```cpp
#include<iostream>
usingn namespace std;

void printList(Node* head) {
    Node* temp = head;
    while (temp != NULL) {
        std::cout << temp->data << " ";
        temp = temp->next;
    }
    std::cout << std::endl;
}

```


## Example Code
Insertion at Head : :
```cpp
#include<iostream>
using namespace std;
//Insertion at head:
void insertAtHead(Node*&head, int input){
    int count=0;
    cout<<"Inserting at Head :"<<count<<endl;

    //create new node 
    Node * newNode=new Node(input);
    
    //
   newNode->next=head;

   head=newNode;

}

 ```