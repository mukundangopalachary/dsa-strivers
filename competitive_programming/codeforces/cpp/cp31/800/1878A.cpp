#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n, k;
    cin >> n >> k;

    int freq_k = 0;

    for (int i = 0; i < n; i++) {
      int tmp;
      cin >> tmp;
      if (tmp == k)
        freq_k++;
    }

    if (freq_k >= 1) {
      cout << "YES\n";
    } else {
      cout << "NO\n";
    }
  }
  return 0;
}
