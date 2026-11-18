#include <algorithm>
#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  int steps = 0;
  while (n > 0) {
    int temp = n;
    int max_digit = 0;

    while (temp > 0) {
      max_digit = max(max_digit, temp % 10);
      temp /= 10;
    }

    n -= max_digit;
    steps++;
  }

  cout << steps << '\n';
  return 0;
}
