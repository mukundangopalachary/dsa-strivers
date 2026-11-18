#include <algorithm>
#include <iostream>
#include <map>
#include <vector>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n;
    cin >> n;

    vector<int> arr(n);
    map<int, int> initial_freq;
    int max_initial = 0;

    int odd_cnt = 0, even_0 = 0, even_2 = 0;
    for (int i = 0; i < n; i++) {
      cin >> arr[i];
      max_initial = max(max_initial, ++initial_freq[i]);
      if (arr[i] % 2 != 0)
        odd_cnt++;
      else if (arr[i] % 4 == 0)
        even_0++;
      else
        even_2++;
    }

    int ans = max({max_initial, odd_cnt, even_0, even_2});
    cout << ans << '\n';
  }

  return 0;
}
