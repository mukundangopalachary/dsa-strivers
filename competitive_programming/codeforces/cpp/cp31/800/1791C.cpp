#include <iostream>

int main() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(nullptr);

  int t;
  std::cin >> t;

  while (t--) {
    int n;
    std::cin >> n;

    std::string binary_no;
    std::cin >> binary_no;

    int left = 0, right = n - 1;
    while (left <= right || n != 0) {
      if (binary_no[left] != binary_no[right]) {
        left++;
        right--;
        n -= 2;
      } else {
        break;
      }
    }

    std::cout << n << '\n';
  }

  return 0;
}
