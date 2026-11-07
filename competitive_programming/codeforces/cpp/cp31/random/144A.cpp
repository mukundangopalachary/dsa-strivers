#include <iostream>
#include <vector>
using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  if(!(cin >> n)) return 0;

  vector<int> a(n);

  int maximum = -1e9, maximum_idx = -1, minimum = 1e9, minimum_idx = -1;

  int i = 1;
  for(auto &x : a){
    cin >> x;

    if(x > maximum){
      maximum = x;
      maximum_idx = i;
    }

    if(x <= minimum){
      minimum = x;
      minimum_idx = i;
    }

    i++;
  }

  int ans =  (n - minimum_idx) + (maximum_idx - 1);

  if(maximum_idx > minimum_idx) ans--;

  cout << ans << '\n';
  return 0;
}
