#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int in;
  cin >> in;

  while (in--) {

    int n, m;
    cin >> n >> m;

    string x, s;
    cin >> x >> s;

    if (n >= m) {
      if (x.find(s) != string::npos) {
        cout << 0;
      }
    }
  }

  return 0;
}
