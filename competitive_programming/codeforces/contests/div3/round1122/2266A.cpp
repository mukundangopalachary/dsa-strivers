#include <climits>
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

    int mini = INT_MAX;

    for (int i = 0; i < 3; i++) {
      int num;
      cin >> num;

      mini = min(num, mini);
    }

    cout << n - mini << '\n';
  }

  return 0;
}
