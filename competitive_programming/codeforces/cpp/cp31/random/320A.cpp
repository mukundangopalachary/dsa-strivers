#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string n;
  cin >> n;

  if (n[0] != '1') {
    cout << "NO\n";
    return 0;
  }

  for (int i = 0; i < (int)n.size(); i++) {
    if (n[i] == '1')
      continue;

    if (n[i] == '4') {
      if (i == 0 || (i > 0 && n[i - 1] == '4' && i > 1 && n[i - 2] == '4')) {
        cout << "NO\n";
        return 0;
      }
    } else {
      cout << "NO\n";
      return 0;
    }
  }

  cout << "YES\n";
  return 0;
}
