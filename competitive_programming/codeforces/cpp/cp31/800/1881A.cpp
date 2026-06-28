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

    string x1 = x + x;
    string x2 = x1 + x1;
    string x3 = x2 + x2;
    string x4 = x3 + x3;

    for (int i = 0; i < 5; i++) {
    }
  }

  return 0;
}
