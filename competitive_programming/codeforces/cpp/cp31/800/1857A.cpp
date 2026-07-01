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

    int odd = 0;

    for (int i = 0; i < n; i++) {
      int tmp;
      cin >> tmp;

      if (tmp % 2 == 1)
        odd++;
    }

    if (odd % 2 == 1) {
      cout << "No\n";
    } else {
      cout << "Yes\n";
    }
  }

  return 0;
}
