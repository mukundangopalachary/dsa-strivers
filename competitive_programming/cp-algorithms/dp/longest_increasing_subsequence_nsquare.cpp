#include <algorithm>
#include <bits/stdc++.h>
using namespace std;

class lis {
  int lis_no_restoration() {
    int a[] = {8, 3, 4, 6, 5, 2, 0, 7, 9, 1};
    int n = 10;
    vector<int> d(n, 1);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (a[j] < a[i]) {
          d[i] = max(d[i], d[j] + 1);
        }
      }
    }

    cout << *max_element(d.begin(), d.end()) << '\n';
    return 0;
  }

  vector<int> list_restoration(vector<int> a) {
    int n = a.size();
    vector<int> d(n, 1), p(n, -1);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (a[i] > a[j] && d[i] < d[j] + 1) {
          d[i] = d[j] + 1;
          p[i] = j;
        }
      }
    }

    int ans = d[0], pos = 0;
    for (int i = 1; i < n; i++) {
      if (d[i] > ans){
        ans = d[i];
        pos = i;
      }
    }

    vector<int> subseq;
    while (pos != -1) {
      subseq.push_back(a[pos]);
      pos = p[pos];
    }
    reverse(subseq.begin(), subseq.end());
    cout << "length: " << ans << '\n';
    return subseq;
  }
};
