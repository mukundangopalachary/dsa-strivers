#include <algorithm>
#include <cctype>
#include <iostream>
using namespace std;

int main() {

  string word;
  cin >> word;

  int cnt = 0;
  for (int i = 0; i < word.length(); i++) {
    if (islower(word[i]))
      cnt++;
  }

  if (word.length() - cnt <= cnt)
    transform(word.begin(), word.end(), word.begin(),
              [](unsigned char c) { return tolower(c); });
  else
    transform(word.begin(), word.end(), word.begin(),
              [](unsigned char c) { return toupper(c); });

  cout << word;
  return 0;
}
