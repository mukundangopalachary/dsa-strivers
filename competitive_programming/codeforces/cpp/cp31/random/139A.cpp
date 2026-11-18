#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<int> a(7);
    for (int &x : a) cin >> x;

    int day = 0;

    while (n > 0) {
        n -= a[day];
        day = (day + 1) % 7;
    }

    cout << (day == 0 ? 7 : day) << '\n';

    return 0;
}
