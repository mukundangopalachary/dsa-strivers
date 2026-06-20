#include <iostream>

int main() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(nullptr);

  int t;
  if (std::cin >> t) { // Check for successful input
    while (t > 0) {
      int ans = 0;
      int a = 3;
      while (a > 0) {
        int num;
        std::cin >> num;
        ans ^= num;
        a--;
      }
      // Use "\n" instead of endl to avoid unnecessary flushing
      std::cout << ans << "\n";
      t--;
    }
  }
  return 0;
}
