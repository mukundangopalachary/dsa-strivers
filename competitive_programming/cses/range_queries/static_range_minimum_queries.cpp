// #include <algorithm>
// #include <climits>
// #include <iostream>
// #include <vector>

// using namespace std;

// //operation
// long long minimum(vector<long long>& bit, long long idx){

//   long long mini =  LONG_MAX;
//   while(idx > 0){
//     mini = min(mini, bit[idx]);
//     idx -= (idx & -idx);
//   }

//   return mini;
// }

// int main(){
//   ios::sync_with_stdio(false);
//   cin.tie(nullptr);

//   long long n, q;
//   cin >> n >> q;

//   vector<long long> nums(n + 1, 0), bit;

//   for(long long i = 1; i <=n; i++){
//     cin >> nums[i];
//   }

//   bit = nums;

//   //populate the Fenwick Tree
//   for(long long i =  1; i <= n; i++){
//     long long p = i + (i & -i);
//     if(p <= n){
//       bit[p] = min(bit[p], bit[i]);
//     }
//   }

//   while(q--){
//     long long left, right;
//     cin >> left >> right;

//     cout << min(minimum(bit,right), minimum(bit, left)) << '\n';
//   }

//   return 0;
// }
