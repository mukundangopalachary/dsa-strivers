#include <cstdlib>
#include <iostream>
#include <map>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int in;
  cin >> in;

  while (in--) {
    int n;
    cin >> n;

    long long arr[n];
    map<long long, long long> freq_map;

    for (int i = 0; i < n; i++) {
      cin >> arr[i];
      freq_map[arr[i]]++;
    }

    if (freq_map.size() >= 3) {
      cout << "No\n";
    } else {
      long long first_freq = freq_map.begin()->second;
      long long second_freq = freq_map.rbegin()->second;

      if (first_freq == second_freq) {
        cout << "Yes\n";
      } else if (n % 2 == 1 && abs(first_freq - second_freq) == 1) {
        cout << "Yes\n";
      } else
        cout << "No\n";
    }
  }

  return 0;
}
