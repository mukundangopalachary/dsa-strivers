#include <iostream>
#include <vector>

using namespace std;

void dfs(int i, int j, vector<vector<char>>& mat){
  if(i < 0 || j < 0 || i >= mat.size() || j >= mat[0].size() || mat[i][j] == '#') return ;

  mat[i][j] = '#';

  dfs(i-1 , j, mat);
  dfs(i+1 , j, mat);
  dfs(i , j-1, mat);
  dfs(i , j+1, mat);
};

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n,m;
  cin >> n >> m;

  vector<vector<char>> mat(n, vector<char>(m, ' '));

  for(int i = 0; i < n; i++){
    for(int j = 0; j < m; j++){
      cin >> mat[i][j];
    }
  }

  int cnt = 0;
  for(int i = 0; i < n; i++){
    for(int j = 0; j < m; j++){
      if(mat[i][j] == '.'){
        cnt++;
        dfs(i , j, mat);
      }
    }
  }

  cout << cnt << '\n';
  return 0;
}
