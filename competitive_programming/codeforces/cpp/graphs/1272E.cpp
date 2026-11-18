#include <iostream>
#include <queue>
#include <vector>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;
  vector<int> arr(n + 1);

  // 1 to n
  for (int i = 1; i <= n; i++)
    cin >> arr[i];

  // level,curr_idx
  queue<pair<int, int>> q;

  vector<int> ans;

  vector<vector<int>> mat(n + 1, vector<int>(n + 1, 0));
}
