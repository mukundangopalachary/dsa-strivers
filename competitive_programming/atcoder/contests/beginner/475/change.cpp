#include <iostream>
using namespace std;

class Solution {
public:
  void solve() {
    int N;
    cin >> N;

    long long one = 0;
    long long ten = 0;
    long long hundred = 0;

    for (int i = 0; i < N; i++) {
      long long A;
      cin >> A;

      long long bills = (A + 999) / 1000;
      long long change = bills * 1000 - A;

      hundred += change / 100;
      change %= 100;

      ten += change / 10;
      change %= 10;

      one += change;
    }

    cout << one << ' ' << ten << ' ' << hundred << '\n';
  }
};

int main() {
  Solution s;
  s.solve();
}
