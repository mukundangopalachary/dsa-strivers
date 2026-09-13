#include <iostream>

using namespace std;

int main() {
  string s, ans;
  cin >> s;

  int n = s.size();

  if (n == 0) {
    cout << "o";
    return 0;
  }

  for (int i = 0; i < n; i++) {
    if (i == n - 1) {
      ans += s[i];
      continue;
    }

    ans += s[i];
    ans += 'o';
  }

  cout << ans;
  return 0;
}
