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

    if (n % k == 0) {
      cout << 2 << '\n' << 1 << ' ' <<  n - 1 << '\n';

    } else {
      cout << 1 << '\n' << n << '\n';
    }
  }

  return 0;
}
