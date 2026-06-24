#include <iostream>
#include <vector>
using namespace std;

int main() {

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int in;
  cin >> in;

  while (in--) {

    int n;
    vector<int> arr;

    cin >> n;

    while (n--) {
      int temp;
      cin >> temp;
      arr.push_back(temp);
    }
    int mn = arr[0];
    int sum = arr[0];

    for (int i = 1; i < arr.size(); i++) {
      if (arr[i] < mn) {
        mn = arr[i];
        sum += mn;
      } else {
        sum += mn;
      }
    }

    cout << sum << "\n";
  }

  return 0;
}
