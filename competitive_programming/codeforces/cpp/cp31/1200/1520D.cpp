#include <bits/stdc++.h>
#include <map>
using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;
  while(t--){
    int n;
    cin >> n;
    map<long long, long long> mp;

    long long pairs = 0;
    for(int i = 1; i <= n; i++){
      int a;
      cin >> a;

      pairs += mp[a - i];
      mp[a - i]++;
    }

    cout << pairs << '\n';
  }

  return 0;
}
