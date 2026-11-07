#include "bits/stdc++.h"

using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  int leftopen = 0, rightopen = 0;

  for(int i = 0; i < n; i++){
    int l,r; cin >> l >> r;

    leftopen += l;
    rightopen += r;
  }

  int leftclosed = n - leftopen;
  int rightclosed = n - rightopen;

  cout << min(leftopen, leftclosed) + min(rightopen, rightclosed) << '\n';
  return 0;
}
