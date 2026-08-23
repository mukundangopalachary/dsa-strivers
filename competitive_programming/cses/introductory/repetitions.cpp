#include <iostream>
using namespace std;

int main() {

  string input;
  cin >> input;

  int cnt = 1, maxCount = 1;
  char prev = input[0];

  for (int i = 1; i < input.size(); i++) {
    if (prev == input[i]) {
      cnt++;
    } else {
      maxCount = max(maxCount, cnt);
      cnt = 1;
      prev = input[i];
    }
  }

  maxCount = max(maxCount, cnt);

  cout << maxCount;
  return 0;
}
