#include <iostream>
#include <set>

int main() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(nullptr);

  std::string username;
  std::cin >> username;

  std::set<char> unique;
  for (int i = 0; i < username.length(); i++) {
    unique.insert(username[i]);
  }

  if (unique.size() % 2 == 0) {
    std::cout << "CHAT WITH HER!";
  } else {
    std::cout << "IGNORE HIM!";
  }

  return 0;
}
