#include "bits/stdc++.h"

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, m;
  cin >> n >> m;

  vector<int> a(m + 1);
  for (int i = 1; i <= m; i++) {
    cin >> a[i];
  }

  long long prev_house = 1;
  long long time = 0;
  for (int i = 1; i <= m; i++) {
    int curr_house = a[i];

    if(curr_house < prev_house){
      time += ((n - prev_house) + (curr_house - 1) + 1);
      prev_house = curr_house;
    }else{
      time += (curr_house - prev_house);
      prev_house = curr_house;
    }
  }

  cout << time << '\n';
  return 0;
}
