#include "bits/stdc++.h"
using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  while (true) {
    n++;
    int a = n % 10;
    int b = (n / 10) % 10;
    int c = (n / 100) % 10;
    int d = (n / 1000) % 10;

    if(a != b && a != c && a != d && b != c && b != d && c != d) {
      break;
    }
  }

  cout << n << '\n';
}
