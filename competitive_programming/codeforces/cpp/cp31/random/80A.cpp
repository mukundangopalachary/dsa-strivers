#include <bits/stdc++.h>
using namespace std;

bool isPrime(int x) {
  if (x < 2)
    return false;

  for (int i = 2; i * i <= x; i++) {
    if (x % i == 0)
      return false;
  }

  return true;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, m;
  cin >> n >> m;

  for (int i = n + 1; i <= m; i++) {
    if (isPrime(i)) {
      cout << (i == m ? "YES\n" : "NO\n");
      return 0;
    }
  }

  cout << "NO\n";
  return 0;
}
