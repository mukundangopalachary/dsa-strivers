#include "bits/stdc++.h"
#include <algorithm>

using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string a, b;
  cin >> a >> b;

  reverse(a.begin(), a.end());

  if(a == b) cout << "YES\n";
  else cout << "NO\n";

  return 0;
}
