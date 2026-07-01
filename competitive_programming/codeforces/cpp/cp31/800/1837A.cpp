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
      int tmp = n - 1;
      while (tmp--) {
      }
    } else {
      cout << 1 << '\n' << n;
    }
  }
}
