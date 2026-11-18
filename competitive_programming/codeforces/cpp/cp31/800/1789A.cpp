#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

int main() {
	int t;
	cin >> t;

	while (t--) {
		int n;
		cin >> n;

		vector<int> a(n);
		for (int &x : a) {
			cin >> x;
		}

		bool found = false;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (gcd(a[i], a[j]) <= 2) {
					found = true;
					break;
				}
			}
			if (found) break;
		}

		cout << (found ? "YES" : "NO") << '\n';
	}

	return 0;
}
