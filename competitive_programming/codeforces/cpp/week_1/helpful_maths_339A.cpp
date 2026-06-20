#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string exp;
  cin >> exp;

  vector<char> nums;
  for (int i = 0; i < exp.length(); i++) {
    if (exp[i] == '+')
      continue;
    nums.push_back(exp[i]);
  }

  sort(nums.begin(), nums.end());
  string ans = "";

  for (int i = 0; i < nums.size(); i++) {
    ans += nums[i];

    if (i != nums.size() - 1)
      ans += '+';
  }

  cout << ans;
}
