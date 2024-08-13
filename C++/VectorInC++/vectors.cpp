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
// 1.Pushing element at front
/*
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
*/

// 2.Pushing element at front:
/*
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
*/

// Inserting element at the specific postion:
int main()
{

    vector<int> nums = {10, 20, 30, 40, 50};
    int value = 0;
    int index = 0;
    cout << "Pushing element at specific postion" << endl;
    print(nums);
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
        }
    }
    print(nums);
}

/*
Vector:
->Push_back():
->push_front()'
->Insert at specific positions
->Modify existing elements


*/