#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string number;
  cin >> number;

  string ans = number;
  int n = number.size();

  for (int i = 0; i < n; i++) {
    char inverted = '9' - number[i] + '0';

    if (i == 0 && inverted == '0')
      continue;

    if (inverted < number[i]) {
      ans[i] = inverted;
    }
  }

  cout << ans << '\n';
  return 0;
}
