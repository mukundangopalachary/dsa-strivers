#include <iostream>

using namespace std;

int main() {

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, res = 0;
  cin >> n;

  int cmp = n;
  for (int i = 1; i < n; i++) {
    int a;
    cin >> a;

    res ^= a;
    cmp ^= i;
  }

  cout << (res ^ cmp) << "\n";
  return 0;
}
