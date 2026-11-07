#include "bits/stdc++.h"
#include <unordered_map>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  unordered_map<string, int> mp;

  while (n--) {
    string s;
    cin >> s;
    mp[s]++;
  }

  int max_freq = 0;
  string ans = "";
  for (auto &[key, val] : mp) {
    if (val > max_freq){
      ans = key;
      max_freq = val;
    }
  }

  cout << ans;
  return 0;
}
