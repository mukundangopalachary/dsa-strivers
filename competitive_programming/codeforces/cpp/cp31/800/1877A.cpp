#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n;
    cin >> n;

    long long sum = 0;
    for (int i = 0; i < n - 1; i++) {
      int tmp;
      cin >> tmp;
      sum += tmp;
    }

    cout << -1 * sum << "\n";
  }

  return 0;
}
