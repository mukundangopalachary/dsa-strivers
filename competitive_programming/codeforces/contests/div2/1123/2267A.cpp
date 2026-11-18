#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n;
    char c;
    string s;
    cin >> n >> c >> s;

    int i = 0, j = n - 1, ans = 0;

    while (i < j) {
      if (s[i] != s[j]) {
        if (s[i] == c || s[j] == c)
          ans++;
        else
          ans += 2;
      }

      i++;
      j--;
    }

    cout << ans << '\n';
  }

  return 0;
}
