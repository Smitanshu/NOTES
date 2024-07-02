#include <iostream>
using namespace std;
class Node
{
public:
    int data;
    Node *next;

    // Constructor
    Node()
    {
        cout << "In default ctor" << endl;
        this->next = NULL;
    }
    Node(int input1)
    {
        cout << "In parameterized CTOR:" << endl;
        this->data = input1;
        this->next = NULL;
    }
};

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

void print(Node *head)
{
    Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << "-> ";
        temp = temp->next;
    }
}
int main()
{
    Node *first = new Node(10);
    Node *second = new Node(20);
    Node *third = new Node(30);
    Node *fourth = new Node(40);
    Node *fifth = new Node(50);
    Node *sixth = new Node(60);
    Node *seventh = new Node(70);
    Node *eighth = new Node(80);
    Node *ninth = new Node(90);
    Node *tenth = new Node(100);

    first->next = second;
    second->next = third;
    third->next = fourth;
    fourth->next = fifth;
    fifth->next = sixth;
    sixth->next = seventh;
    seventh->next = eighth;
    eighth->next = ninth;
    ninth->next = tenth;

    
Node *head=first;
insertAtHead(head, 5);
insertAtHead(head, 4);
insertAtHead(head, 3);
insertAtHead(head, 2);
insertAtHead(head, 1);

    print(head);

    return 0;
}
/*
Note: 
1.While printing the Linked-List dont use the original pointer of Head Node,
  create temp node and then print.

2.While Inserting node pass the always pass  head using reference. 

3.Steps for Inserting node;
  -



*/