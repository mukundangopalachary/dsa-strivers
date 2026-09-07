#include <iostream>
#include <vector>

using namespace std;

class FenwickTree {
private:
    int n;
    vector<long long> B1, B2;

    void update(vector<long long>& bit, int idx, long long val) {
        for (; idx <= n; idx += idx & -idx)
            bit[idx] += val;
    }

    long long query(const vector<long long>& bit, int idx) {
        long long sum = 0;

        for (; idx > 0; idx -= idx & -idx)
            sum += bit[idx];

        return sum;
    }

public:
    FenwickTree(int n) : n(n), B1(n + 1), B2(n + 1) {

    }

    void range_update(int l, int r, long long x) {
        update(B1, l, x);
        update(B1, r + 1, -x);

        update(B2, l, x * (l - 1));
        update(B2, r + 1, -x * r);
    }

    long long prefix_sum(int idx) {
        return query(B1, idx) * idx - query(B2, idx);
    }

    long long range_sum(int l, int r) {
        return prefix_sum(r) - prefix_sum(l - 1);
    }
};

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;

  vector<int> arr(n + 1,0);
  for(int i = 1; i <= n; i++) cin >> arr[i];

  FenwickTree *bit = new FenwickTree(n);

  for(int i = 1; i <= n; i++){
    bit->range_update(i, i, arr[i]);
  }

  cout << bit->range_sum(1, 3);

  return 0;
}
