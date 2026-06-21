#include <iostream>
#include <vector>
using namespace std;

int main() {

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  vector<int> arr;
  int zero = 0;
  int one = 0;

  while (t--) {
    int tmp;
    cin >> tmp;
    if (tmp == 0)
      zero++;
    else if (tmp == 1) {
      one++;
    }
    arr.push_back(tmp);
  }

  if ()
}
