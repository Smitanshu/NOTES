#include <iostream>
using namespace std;

/*
int fact(int n)
{
    int fact = 1;
    for (int i = n; i >= 1; i--)
    {

        fact = fact * i;
    }

    return fact;
}

// Wap program the number is strong or not
int main()
{
    int n = 145;
    int temp = n;
    int ans = 0;

    while (n >= 1)
    {

        int bit = n % 10;
        ans = ans + fact(bit);
        n = n / 10;
    }

    if (temp == ans)
    {
        cout << ans << endl;
        ;
        cout << "It is strong number" << endl;
    }

    return 0;
}
*/

// CTOR Overloading:
/*
class x
{

public:
    x(int a)
    {
        cout << "Multiplication :" << a * a << endl;
    }
};
class y : public x
{
public:
    y(int a, int b) : x(5)
    {
        cout << "Sum :" << a + b << endl;
    }
};
int main()
{
    y y1(10, 5);
    return 0;
}

*/
/*

// Public Access Specifier:
class Student
{
public:
    string name;
    int roll_no;
    int sub1;
};
int main()
{
    Student s1;
    s1.name = "Smitanshu";
    s1.roll_no = 123;
    s1.sub1 = 76;
    cout << "name:  " << s1.name << endl;
    cout << "Roll No: " << s1.roll_no << endl;
    cout << "Sub1" << s1.sub1 << endl;
}

*/

// Example Using Employee:
/*
class Employee
{

public:
    string name;
    int id;
    int salary;
};
int main()
{

    Employee e1;
    e1.name = "suraj";
    e1.id = 121;
    e1.salary = 250;
    cout << e1.name << endl;
    cout << e1.id << endl;
    cout << e1.salary << endl;

    return 0;
}

*/

class x
{

private:
    int empid;
    string ename;

public:
    void setter(int e, string name)
    {

        empid = e;
        ename = name;
    }

    void getter()
    {

        cout << "Id :" << empid << "  "
             << "Name:" << ename;
    }
};

int main()
{

    x x1;
    x1.setter(121, "suraj");
    x1.getter();

    return 0;
}
/*

class book
{

protected:
    int id;
    string name;
    string author;
    int page;
};
class second : protected book
{
public:
    void insert(string _name, int _id, string _author, int _page)
    {
        name = _name;
        id = _id;
        author = _author;
        page = _page;
    }
    void display()
    {

        cout << name << endl;
        cout << id << endl;
        ;
        cout << author << endl;
        cout << page << endl;
    }
};
int main()
{

    second b1;
    b1.insert("suraj", 12, "suraj", 23);
    b1.display();
    return 0;
}
*/
/*
cpp support three types of access specifier.
1>public
2.protected
3.private

1.Public:If data is public we can access anywhere within the application of our program.

2.Protected:if data is protected we can access within next immediate class only(through inheritance concept).

3.Private:If data is private the corresponding data we can access within the same class.
  We cannot access in main program and another class



Data structure perform manipulation on data is called DS.
various ds concepts:
1.Searching Tech
2.Sorting Tech
3.Stack
4.Queue
5.Linked List
6.Trees& Graph

->manipulation means creating storing data, updating ,retrieving , searching and sorting the data and deleting the data.


5.Linked List:Collection of nodes linear data structure
Every node contain two node data & next i.e. address of next node.
->Every node will be connected with the next node

syntax:[Data][Address of next node]

[10][2000]--->HeadNode
        ---> [20][3000]
                    --->[30][4000]
                                     -->[40][5000]

*/
