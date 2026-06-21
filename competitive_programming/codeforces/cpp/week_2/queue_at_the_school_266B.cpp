#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, t;
  cin >> n >> t;

  string queue;
  cin >> queue;

  while (t--) {
    for (int i = 0; i < n - 1; i++) {
      if (queue[i] == 'B' && queue[i + 1] == 'G') {
        swap(queue[i], queue[i + 1]);
        i++;
      }
    }
  }

  cout << queue;
  return 0;
}
