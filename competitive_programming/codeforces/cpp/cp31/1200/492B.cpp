#include "bits/stdc++.h"
#include <iomanip>
#include <ios>
using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n,l;
  cin >> n >> l;

  vector<double> a(n + 1);
  for(int i = 1; i <= n; i++) cin >> a[i];

  sort(a.begin(), a.end());

  double max_diff = 0;

  for(int i = 2; i <= n; i++){
    max_diff = max(max_diff, a[i] - a[i - 1]);
  }

  double ans = max({a[1], (double) (l - a[n]), max_diff / 2.0});

  cout << fixed << setprecision(10) << ans << '\n';
  return 0;
}
