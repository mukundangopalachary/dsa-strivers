#include <iostream>
#include <string>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    string s;
    cin >> s;

    if (s.length() > 10)
      cout << s[0] << s.length() - 2 << s.back() << '\n';
    else
      cout << s << '\n';
  }
}
