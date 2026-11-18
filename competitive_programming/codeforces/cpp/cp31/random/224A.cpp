#include <cmath>
#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int a, b, c;
  cin >> a >> b >> c;

  int x = sqrt(a * c / b);
  int y = a / x;
  int z = c / x;

  cout << 4 * (x + y + z) << '\n';
  return 0;
}
