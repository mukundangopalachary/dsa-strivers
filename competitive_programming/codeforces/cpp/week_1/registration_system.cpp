#include <iostream>
#include <map>
#include <string>

int main() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(nullptr);

  int t;
  std::cin >> t;

  std::string dummy;
  std::getline(std::cin, dummy);

  std::map<std::string, int> map;

  while (t > 0) {
    std::string key;
    getline(std::cin, key);
    if (map[key] == 0) {
      map[key]++;
      std::cout << "OK" << "\n";
    } else {
      std::cout << key << map[key]++ << "\n";
    }
    t--;
  }
}
