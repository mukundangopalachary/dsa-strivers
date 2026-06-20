#include <cctype>
#include <iostream>
using namespace std;

int main() {

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string word;
  cin >> word;

  if (isupper(word[0])) {
    cout << word;
  } else {
    word[0] = static_cast<char>(toupper(word[0]));
    cout << word;
  }

  return 0;
}
