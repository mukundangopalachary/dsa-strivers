#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  long long n, m, a, b;
  cin >> n >> m >> a >> b;

  long long money = 0;

  if (m * a <= b) {
    money += n * a;
  } else {
    money += ((n / m) * b) + min((n % m) * a, b);
  }

  cout << money << '\n';

  return 0;
}
