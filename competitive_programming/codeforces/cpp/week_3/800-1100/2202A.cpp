#include <iostream>
using namespace std;

// rules => ( 0, 0 ) - (2,1)
//       => ( 0, 0 ) - (3,0)
//       => ( 0, 0 ) - (4,-1)

// using backtracking this works for smaller input size

/* bool backtrack(int kx, int ky) {
  if (kx < 0 || ky < -1)
    return false;
  if (kx == 0 && ky == 0)
    return true;

  return backtrack(kx - 2, ky - 1) || backtrack(kx - 3, ky) ||
         backtrack(kx - 4, ky + 1);
}

int main() {

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int kx, ky;
    cin >> kx >> ky;

    if (backtrack(kx, ky)) {
      cout << "YES\n";
    } else {
      cout << "NO\n";
    }
  }

  return 0;
} */

// using maths

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    long long x, y;
    cin >> x >> y;

    long long d = x - 2 * y;

    if (d >= 0 && d % 3 == 0 && x + 4 * y >= 0)
      cout << "YES\n";
    else
      cout << "NO\n";
  }

  return 0;
}
