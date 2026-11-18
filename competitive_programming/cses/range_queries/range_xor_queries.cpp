#include <iostream>
#include <vector>

using namespace std;

long long __xor(long long index, vector<long long>& bit){
  long long _xor = 0;

  while(index > 0){
    _xor ^= bit[index];
    index -= index & -index;
  }

  return _xor;
}

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  long long n,q;
  cin >> n >> q;

  vector<long long> arr(n + 1, 0),bit;

  for(long long i = 1; i <= n; i++){
    cin >> arr[i];
  }

  bit = arr;

  for(long long i = 1; i <= n; i++){
    long long p = i + (i & -i);
    if(p <= n){
      bit[p] ^= bit[i];
    }
  }

  while(q--){
    long long left,right;
    cin >> left >> right;

    long long ans = (__xor(right, bit) ^ __xor(left - 1, bit));

    cout << ans << '\n';
  }

  return 0;
}
