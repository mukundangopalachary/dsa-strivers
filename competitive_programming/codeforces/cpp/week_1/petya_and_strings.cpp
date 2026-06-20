#include <cctype>
#include <iostream>
using namespace std;
int main() {
  ios::sync_with_stdio();
  cin.tie(nullptr);

  string a, b;
  cin >> a;
  cin >> b;

  for (int i = 0; i < a.length(); i++) {
    if (tolower(a[i]) == tolower(b[i]))
      continue;
    else if (tolower(a[i]) > tolower(b[i])) {
      cout << 1;
      return 0;
    } else {
      cout << -1;
      return 0;
    }
  }

  cout << 0;
  return 0;
}
