#include <bits/stdc++.h>

using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;

  long long x = 0, y = 0, z = 0;

  while(n--){
    int a,b,c; cin >> a >> b >> c;

    x += a; y += b; z += c;
  }

  if(x == 0 && y == 0 && z == 0) cout << "YES\n";
  else cout << "NO\n";
  return 0;
}
