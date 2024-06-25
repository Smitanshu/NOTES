#include <iostream>
using namespace std;
class Node
{
public:
    int data;
    Node *next;

    Node()
    {
        cout << "Default constructor called :" << endl;
        this->next = NULL;
    }
    Node(int input1)
    {
        cout << "Parameterized ctor called :";
        this->data = data;
        this->next = NULL;
    }
};
int main()
{
    Node first;
    Node *first = new Node(10);
    Node *second = new Node(20);
    Node *third = new Node(30);
    Node *fourth = new Node(40);
    Node *fifth = new Node(60);
    Node second = new Node(70)

    return 0;
}
