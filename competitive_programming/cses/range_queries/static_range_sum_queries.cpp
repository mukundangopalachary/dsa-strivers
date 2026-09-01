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
        long long l, r;
        cin >> l >> r;
        cout << sum(bit, r) - sum(bit, l - 1) << '\n';
    }

    return 0;
}
