#include <iostream>
#include <unordered_set>
#include <vector>

using namespace std;

void solve() {
  int n, m;
  cin >> n >> m;

  unordered_set<char> available;
  for (int i = 0; i < n; i++) {
    string w;
    cin >> w;
    available.insert(toupper(w[0]));
  }

  int formed_count = 0;

  for (int i = 0; i < m; i++) {
    string ab;
    cin >> ab;

    bool can_form = true;
    for (char c : ab) {
      if (available.find(c) == available.end()) {
        can_form = false;
        break;
      }
    }

    if (can_form) {
      formed_count++;
    }
  }

  if (formed_count == m) {
    cout << "YES\n";
  } else {
    cout << "NO\n";
  }
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;
  while (t--) {
    solve();
  }
}
