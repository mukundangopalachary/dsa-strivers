#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  string wins;
  cin >> wins;

  int count_a = 0;

  for (int i = 0; i < t; i++) {
    if (wins[i] == 'A')
      count_a++;
  }

  if (t % 2 == 0) {
    if (count_a == t / 2) {
      cout << "Friendship\n";
    } else if (count_a > t / 2) {
      cout << "Anton\n";
    } else {
      cout << "Danik\n";
    }
  } else {
    int mid = (t / 2) + 1;
    if (count_a >= mid) {
      cout << "Anton\n";
    } else {
      cout << "Danik\n";
    }
  }

  return 0;
}
