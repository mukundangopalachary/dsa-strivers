#include <cctype>
#include <iostream>
#include <set>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string dict;
  getline(cin, dict);

  set<char> distict_characters;
  int uni = 0;

  for (int i = 0; i < dict.length(); i++) {
    if (isalpha(dict[i])) {
      if (distict_characters.find(dict[i]) != distict_characters.end()) {
        continue;
      } else {
        distict_characters.insert(dict[i]);
        ++uni;
      }
    }
  }

  cout << uni;

  return 0;
}
