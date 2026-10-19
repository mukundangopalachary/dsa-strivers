#include <bits/stdc++.h>

using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string s;
  cin >> s;

  int n = s.size();

  string ans = "";
  int i = 0;
  while(i < n){
    if(s[i] == '.') ans += "0";
    else{
      ++i;
      if(s[i] == '.') ans += "1";
      else ans += "2";
    }

    ++i;
  }

  cout << ans << '\n';
  return 0;
}
