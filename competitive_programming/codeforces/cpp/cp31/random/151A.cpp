#include "bits/stdc++.h"
using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  // friends, k bottles of drinks, eac bottle 'l' ml, c limes, each lime 'd' slices, p grams of salt, need nl ml drinks, need np gram salt
  int n, k, l, c, d, p, nl, np;
  cin >> n >> k >> l >> c >> d >> p >> nl >> np;

  int total_ml = k * l;
  int total_slices = c * d;

  cout << min({(total_ml / nl), total_slices, p/np}) / n << '\n';

}
