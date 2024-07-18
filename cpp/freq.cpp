#include <bits/stdc++.h>
using namespace std;
int main()
{

    string s; // bbadbbababb
    cin >> s;
    char t; // t
    cin >> t;
    unordered_map<char, int> mp;
    for (auto i : s)
    {
        mp[i]++;
    }
    unordered_map<char, int>::iterator itr;
    char ans;
    int maxi = INT_MIN;
    for (auto itr : mp)
    {
        if (itr.second > maxi)
        {
            maxi = itr.second;
            ans = itr.first;
        }
    }
    string ans2 = "";
    for (auto i : s)
    {
        if (i != ans)
            ans2 += i;
        else
            ans2 += t;
    }
    cout << ans2 << endl;
}