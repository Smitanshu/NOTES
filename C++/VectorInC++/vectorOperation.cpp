#include<iostream>
#include<vector>
using namespace std;

void print(vector<int>&input){

    for(auto it:input){
        cout<<it<<" ";
    }
}

int main()
{

    vector<int> nums = {10, 20, 30, 40, 50};
    int value = 0;
    int index = 0;
    cout << "Pushing element at specific postion" << endl;
    print(nums);
    cout << endl;

    cout<<"For stop condition enter -1"<<endl;;
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