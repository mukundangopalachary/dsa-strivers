#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  int x = 0;

  while (t--) {
    string expression;
    cin >> expression;

    int len = expression.length();
    int cnt = 0;

    for (int i = 0; i < len; i++) {
      if (expression[i] == '-') {
        cnt++;
        if (cnt == 2) {
          cnt = 0;
          --x;
        }
      } else if (expression[i] == '+') {
        cnt++;
        if (cnt == 2) {
          cnt = 0;
          ++x;
        }
      }
    }
  }

  cout << x;
  return 0;
}
