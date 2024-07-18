#include <bits/stdc++.h>
using namespace std;

class Node
{

private:
    int data;

    int *next;

public:
    Node(int data)
    {

        this->data = data;
        this->next = nullptr;
    }

    void insert(int data)
    {
    }
};

int main()
{

    Node *head = new Node(10);
}