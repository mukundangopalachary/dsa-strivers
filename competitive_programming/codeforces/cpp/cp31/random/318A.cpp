#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    long long n, k;
    cin >> n >> k;

    long long oddCount = (n + 1) / 2;

    if (k <= oddCount) {
        cout << 2 * k - 1 << '\n';
    } else {
        cout << 2 * (k - oddCount) << '\n';
    }

    return 0;
}
