# Vector operation:

- # push_back();
- # insert();
- # insert at specific position;

## pushing Element at Front:

```cpp
#include <iostream>
#include <vector>
using namespace std;

void print(const vector<int> &my_vector)
{

   for (auto it : my_vector)
   {
       cout << it << " ";
   }
}


void print(const std::vector<int> &nums)
{
 // const assure that not modify the vector
 // using & reference dont make the multiple copy of vector when function is called.
   std::cout << "Vector content...\n ";
   for (auto &it : nums)
   {
       std::cout << it << " ";
   }
}
int main()
{
   std::vector<int> nums;
   int value = 0;
   std::cout << "Pushing back....\n ";
   while (value >= 0)
   {

       std::cout << "Enter number :";

       std::cin >> value;
       if (value >= 0)
       {
           nums.push_back(value);
       }
   }
   print(nums);

   return 0;
}
```

## pushing element at front:

```cpp
#include<iostream>
using namespace std;
void print(const vector<int> &nums)
{

    for (auto it : nums)
    {
        cout << it << " ";
    }
}
int main()
{
    vector<int> nums;
    int value = 0;
    cout << "Pushing Front :";
    while (value >= 0)
    {

        cout << "Enter a number ";
        cin >> value;
        // Vector doesn't have the push_front instead of having the we use the insert function.
        if (value >= 0)
        {
            nums.insert(nums.begin(), value);
        }
    }
    print(nums);

    return 0;
}

```

## Inserting element at specific position :

```cpp
#include<iostream>
using namespace std;
int main()
{

    vector<int> nums = {10, 20, 30, 40, 50};
    int value = 0;
    int index = 0;
    cout << "Pushing element at specific poistion:";
    cout << endl;
    print(nums);  //like declared in above example
    cout << endl;
    while (index >= 0)
    {
        cout << "Enter index :";
        cin >> index;
        if (index >= 0)
        {
            cout << "Enter number :";
            cin >> value;
            nums.insert(nums.begin() + index, value);
            //It manage the size and avoid the numbers to get lost during insertion.
        }
    }
    print(nums);
}


```

- ## output:

```cpp
Pushing element at specific position:
10 20 30 40 50
Enter index :2
Enter number :1
Enter index :3
Enter number :3
Enter index :4
Enter number :4
Enter index :-1
10 20 1 3 4 30 40 50

```
