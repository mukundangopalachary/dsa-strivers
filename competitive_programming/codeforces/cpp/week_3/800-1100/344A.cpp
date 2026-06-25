#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int in;
  cin >> in;
  in -= 1;

  int prev;
  cin >> prev;

  int ans = 1;

  while (in--) {
    int num;
    cin >> num;

    if (prev == num) {
      continue;
    } else {
      ans++;
      prev = num;
    }
  }

  cout << ans;
  return 0;
}
