#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {

    int n, k;
    cin >> n >> k;

    string word;
    cin >> word;

    int len = word.length();

    unordered_map<char, int> freq;

    for (int i = 0; i < len; i++) {
      freq[word[i]]++;
    }

    int odd_cnt = 0;

    for (const auto &[key, val] : freq) {
      if (val % 2)
        ++odd_cnt;
    }

    if (odd_cnt > k + 1) {
      cout << "NO\n";
    } else {
      cout << "YES\n";
    }
  }

  return 0;
}
