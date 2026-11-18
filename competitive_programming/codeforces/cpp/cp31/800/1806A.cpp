#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int a, b, c, d;

    cin >> a >> b >> c >> d;

    if(b > d || c > a + (d - b)){
      cout << -1 << '\n';
    }else{
      int y = d - b;
      int x = (y + a) - c;

      cout << x + y << '\n';
    }

  }
  return 0;
}
