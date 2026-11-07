#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<int> pos(n + 1);

    for (int i = 1; i <= n; i++) {
        int x;
        cin >> x;
        pos[x] = i;
    }

    int m;
    cin >> m;

    long long v = 0, p = 0;

    while (m--) {
        int x;
        cin >> x;

        v += pos[x];
        p += n - pos[x] + 1;
    }

    cout << v << ' ' << p << '\n';

    return 0;
}
