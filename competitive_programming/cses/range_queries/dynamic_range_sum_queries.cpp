#include <iostream>
#include <vector>
using namespace std;

long long sum(vector<long long> &bit, long long idx) {
    long long s = 0;
    while (idx > 0) {
        s += bit[idx];
        idx -= idx & -idx;
    }
    return s;
}

void update(vector<long long>& arr ,vector<long long>& bit, long long idx, long long val){
  long long n = arr.size() - 1;
  long long diff = val - arr[idx];
  arr[idx] = val;

  while(idx <= n){
    bit[idx] += diff;
    idx += (idx & -idx);
  }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    long long n, q;
    cin >> n >> q;

    vector<long long> arr(n + 1), bit;

    for (long long i = 1; i <= n; i++)
        cin >> arr[i];

    bit = arr;

    for (long long i = 1; i <= n; i++) {
        long long p = i + (i & -i);
        if (p <= n)
            bit[p] += bit[i];
    }

    while (q--) {
        long long k, l, r;
        cin >> k >> l >> r;
        if(k == 1) update(arr, bit, l, r);
        else cout << sum(bit, r) - sum(bit, l - 1) << '\n';
    }

    return 0;
}
