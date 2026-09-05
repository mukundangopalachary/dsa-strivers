#include <iostream>
#include <vector>
using namespace std;

long long digitSum(long long val) {
  long long ans = 0;

  while (val > 0) {
    ans += val % 10;
    val /= 10;
  }

  return ans;
}

class FenwickTree {

private:
  long long n;
  vector<long long> bit;

public:
  FenwickTree(long long n) {
    this->n = n;
    bit.resize(n + 1, 0);
  }

  void add(long long idx, long long val) {
    while (idx <= n) {
      bit[idx] += val;
      idx += idx & -idx;
    }
  }

  long long sum(long long idx) {
    long long s = 0;

    while (idx > 0) {
      s += bit[idx];
      idx -= idx & -idx;
    }

    return s;
  }

  long long pointQuery(long long idx) { return sum(idx); }
};

int main() {

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {

    long long n, q;
    cin >> n >> q;

    vector<long long> arr(n + 1);

    for (int i = 1; i <= n; i++) {
      cin >> arr[i];
    }

    FenwickTree bit(n);

    // Build difference array
    for (long long i = 1; i <= n; i++) {
      long long diff = arr[i] - arr[i - 1];
      bit.add(i, diff);
    }

    while (q--) {

      int k;
      cin >> k;

      if (k == 1) {

        int left, right;
        cin >> left >> right;

        for (int j = left; j <= right; j++) {

          long long oldValue = arr[j];
          long long newValue = digitSum(oldValue);

          long long delta = newValue - oldValue;

          // Point update on difference array
          bit.add(j, delta);

          arr[j] = newValue;
        }

      } else {

        int idx;
        cin >> idx;

        cout << bit.pointQuery(idx) << '\n';
      }
    }
  }
}
