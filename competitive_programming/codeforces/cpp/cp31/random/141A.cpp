#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string a, b, s;
    cin >> a >> b >> s;

    a += b;

    sort(a.begin(), a.end());
    sort(s.begin(), s.end());

    cout << (a == s ? "YES\n" : "NO\n");

    return 0;
}
