#include <iostream>
#include <vector>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, m;
  cin >> n >> m;

  vector<int> a(n);
  for (auto &x : a)
    cin >> x;

  // if val < 1 -> invalid, need to replace with a value;

  int ans = 1;
  for(int i = 0; i <= n; i++){
    if(a[i] == 0){
      if(i == n - 1 || i == 0 || a[i - 1] == a[i+1]){
        ans *= 3;
      }else{
        ans *= 2;
        a[i] = a[i - 1];
      }
    }
  }

  cout << ans << '\n';
  return 0;
}
