#include <iostream>

int main() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(nullptr);

  int t;
  std::cin >> t;

  if (t == 2) {
    std::cout << "NO" << "\n";
    return 0;
  }

  if (t % 2 == 0) {
    std::cout << "YES" << "\n";
    return 0;
  }

  std::cout << "NO" << "\n";
  return 0;
}
