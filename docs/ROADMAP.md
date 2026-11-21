# DSA Roadmap & Checklist

Plan: ~10 weeks, 1–2 problems/day + 2–3 Codeforces rounds/week.
Difficulty: E = easy, M = medium, H = hard.
Tick `[x]` when solved **without hints**. Use the Revision Log at the bottom for spaced repetition (1 day / 1 week / 1 month).

Rules:
- 30 min limit per problem. After that, read the editorial, then redo it from scratch 2 days later.
- Write a one-line "trick" for each problem you struggled with in `docs/NOTES.md`.
- Commit each solved problem the same day. Include LeetCode ones.

---

## Progress snapshot (updated 2026-11-18, after merging the other laptop's work)

Done so far, beyond Strivers basics:
- DP: 0/1 knapsack, unbounded knapsack, 9 CSES DP, 5 AtCoder DP, LIS O(n²) (cp-algorithms)
- Graphs: DSU, Kruskal, Prim (list and matrix), Accounts Merge, bipartite BFS/DFS, Ford-Fulkerson, bipartite matching, Floyd-Warshall, Find the City
- Range queries: Fenwick tree, 5 CSES range queries
- CF: ~80 solutions (27 at 800, 8 at 900, 6 at 1200, 1 each at 1300/1500, 34 "random"), 4 Div.3 + 2 Div.2 rounds attempted

Still empty: DP beyond knapsack (strings, LIS fast, grid, stocks, interval), heap problems, greedy, trie, segment tree, SCC/bridges, math/number theory.

Unfinished files (no output or stub, finish or delete):
`atcoder/dp/tasks/knapsack_2.cpp`, `atcoder/beginner/475/walkTheLine.cpp`, `codeforces/contests/div3/round1119/2259D.cpp`, `round1122/2266C.cpp`, `cp31/1100/1904B.cpp`, `cp31/1200/1497B.cpp`, `cp31/900/1904A.cpp`, `codeforces/cpp/graphs/{1272E,189B,623A}.cpp`, `week_3/800-1100/2191.cpp`, `cses/additional_problems/coding_company.cpp`

Reorder: since DSU/MST/bipartite are mostly done, Phase 2 shrinks to SCC/bridges and shortest-path problems. Spend the freed time on DP (strings, LIS, stocks, interval) and heap/greedy.

---

## Phase 0: Revision of weak spots (Week 1)

Items from `docs/STRUGGLING.md`. Redo from scratch.

### Arrays / Matrix
- [ ] <a href="https://leetcode.com/problems/next-permutation/" target="_blank" rel="noopener noreferrer">Next Permutation</a> M. find pivot, swap, reverse suffix
- [ ] <a href="https://leetcode.com/problems/set-matrix-zeroes/" target="_blank" rel="noopener noreferrer">Set Matrix Zeroes</a> M. use first row/col as markers
- [ ] <a href="https://leetcode.com/problems/maximum-product-subarray/" target="_blank" rel="noopener noreferrer">Maximum Product Subarray</a> M. track both max and min
- [ ] <a href="https://leetcode.com/problems/majority-element-ii/" target="_blank" rel="noopener noreferrer">Majority Element II</a> M. Moore voting, 2 candidates
- [ ] <a href="https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1" target="_blank" rel="noopener noreferrer">Count Inversions</a> M. merge sort

### Binary Search
- [ ] <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/" target="_blank" rel="noopener noreferrer">Search in Rotated Sorted Array</a> M
- [ ] <a href="https://leetcode.com/problems/search-in-rotated-sorted-array-ii/" target="_blank" rel="noopener noreferrer">Search in Rotated Sorted Array II</a> M
- [ ] <a href="https://leetcode.com/problems/koko-eating-bananas/" target="_blank" rel="noopener noreferrer">Koko Eating Bananas</a> M
- [ ] <a href="https://leetcode.com/problems/split-array-largest-sum/" target="_blank" rel="noopener noreferrer">Split Array Largest Sum</a> H

### Sliding Window / Two Pointers
- [ ] <a href="https://leetcode.com/problems/max-consecutive-ones-iii/" target="_blank" rel="noopener noreferrer">Max Consecutive Ones III</a> M
- [ ] <a href="https://leetcode.com/problems/longest-repeating-character-replacement/" target="_blank" rel="noopener noreferrer">Longest Repeating Character Replacement</a> M
- [ ] <a href="https://leetcode.com/problems/sliding-window-maximum/" target="_blank" rel="noopener noreferrer">Sliding Window Maximum</a> H. monotonic deque

### Linked List / Strings / Bits / Stack
- [ ] <a href="https://leetcode.com/problems/add-two-numbers/" target="_blank" rel="noopener noreferrer">Add Two Numbers</a> M
- [ ] <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/" target="_blank" rel="noopener noreferrer">Reverse Nodes in k-Group</a> H
- [ ] <a href="https://leetcode.com/problems/reverse-words-in-a-string/" target="_blank" rel="noopener noreferrer">Reverse Words in a String</a> M
- [ ] <a href="https://leetcode.com/problems/single-number-iii/" target="_blank" rel="noopener noreferrer">Single Number III</a> M. xor, lowest set bit
- [ ] <a href="https://leetcode.com/problems/subsets/" target="_blank" rel="noopener noreferrer">Subsets</a> M. bitmask version too
- [ ] <a href="https://leetcode.com/problems/next-greater-element-i/" target="_blank" rel="noopener noreferrer">Next Greater Element I</a> E
- [x] Finish `FloydWarshallAlgorithm.java` (done, compiles)

---

## Phase 1: Dynamic Programming (Weeks 2–5)

**Method for every problem:** (1) define state in words, (2) transition, (3) base case, (4) recursion, (5) memo, (6) tabulation, (7) space-optimize.
**Spot DP when:** "count ways", "min/max cost", "possible or not", or a choice at each index with overlapping subproblems.

### 1.1 1D DP
Concepts:
- [ ] Overlapping subproblems + optimal substructure
- [ ] Top-down vs bottom-up
- [ ] Space optimization to O(1)

Problems:
- [ ] <a href="https://leetcode.com/problems/climbing-stairs/" target="_blank" rel="noopener noreferrer">Climbing Stairs</a> E
- [ ] <a href="https://leetcode.com/problems/fibonacci-number/" target="_blank" rel="noopener noreferrer">Fibonacci Number</a> E
- [ ] <a href="https://leetcode.com/problems/min-cost-climbing-stairs/" target="_blank" rel="noopener noreferrer">Min Cost Climbing Stairs</a> E
- [ ] <a href="https://leetcode.com/problems/house-robber/" target="_blank" rel="noopener noreferrer">House Robber</a> M
- [ ] <a href="https://leetcode.com/problems/house-robber-ii/" target="_blank" rel="noopener noreferrer">House Robber II</a> M
- [ ] <a href="https://leetcode.com/problems/decode-ways/" target="_blank" rel="noopener noreferrer">Decode Ways</a> M
- [ ] <a href="https://leetcode.com/problems/maximum-subarray/" target="_blank" rel="noopener noreferrer">Maximum Subarray</a> M. Kadane as DP
- [ ] <a href="https://leetcode.com/problems/word-break/" target="_blank" rel="noopener noreferrer">Word Break</a> M
- [ ] <a href="https://leetcode.com/problems/jump-game/" target="_blank" rel="noopener noreferrer">Jump Game</a> M
- [ ] <a href="https://leetcode.com/problems/jump-game-ii/" target="_blank" rel="noopener noreferrer">Jump Game II</a> M
- [ ] <a href="https://leetcode.com/problems/longest-palindromic-substring/" target="_blank" rel="noopener noreferrer">Longest Palindromic Substring</a> M
- [ ] <a href="https://leetcode.com/problems/palindromic-substrings/" target="_blank" rel="noopener noreferrer">Palindromic Substrings</a> M
- [x] <a href="https://www.geeksforgeeks.org/problems/minimal-cost/1" target="_blank" rel="noopener noreferrer">Frog Jump with K distance (GFG)</a> M

### 1.2 Grid DP
- [ ] <a href="https://leetcode.com/problems/unique-paths/" target="_blank" rel="noopener noreferrer">Unique Paths</a> M
- [ ] <a href="https://leetcode.com/problems/unique-paths-ii/" target="_blank" rel="noopener noreferrer">Unique Paths II</a> M
- [ ] <a href="https://leetcode.com/problems/minimum-path-sum/" target="_blank" rel="noopener noreferrer">Minimum Path Sum</a> M
- [ ] <a href="https://leetcode.com/problems/triangle/" target="_blank" rel="noopener noreferrer">Triangle</a> M
- [ ] <a href="https://leetcode.com/problems/minimum-falling-path-sum/" target="_blank" rel="noopener noreferrer">Minimum Falling Path Sum</a> M
- [ ] <a href="https://leetcode.com/problems/maximal-square/" target="_blank" rel="noopener noreferrer">Maximal Square</a> M
- [ ] <a href="https://leetcode.com/problems/cherry-pickup-ii/" target="_blank" rel="noopener noreferrer">Cherry Pickup II</a> H. 3D state
- [ ] <a href="https://leetcode.com/problems/dungeon-game/" target="_blank" rel="noopener noreferrer">Dungeon Game</a> H. fill backwards
- [ ] <a href="https://leetcode.com/problems/longest-increasing-path-in-a-matrix/" target="_blank" rel="noopener noreferrer">Longest Increasing Path in a Matrix</a> H. DFS + memo

### 1.3 Subset / 0-1 Knapsack
Concepts:
- [ ] Pick / not-pick state `dp[i][target]`
- [ ] Counting vs boolean vs min/max variants

Problems:
- [ ] <a href="https://leetcode.com/problems/partition-equal-subset-sum/" target="_blank" rel="noopener noreferrer">Partition Equal Subset Sum</a> M
- [ ] <a href="https://leetcode.com/problems/target-sum/" target="_blank" rel="noopener noreferrer">Target Sum</a> M
- [ ] <a href="https://leetcode.com/problems/last-stone-weight-ii/" target="_blank" rel="noopener noreferrer">Last Stone Weight II</a> M
- [ ] <a href="https://leetcode.com/problems/ones-and-zeroes/" target="_blank" rel="noopener noreferrer">Ones and Zeroes</a> M. 2D knapsack
- [ ] <a href="https://www.geeksforgeeks.org/problems/partitions-with-given-difference/1" target="_blank" rel="noopener noreferrer">Partitions with Given Difference (GFG)</a> M
- [x] <a href="https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1" target="_blank" rel="noopener noreferrer">0-1 Knapsack (GFG)</a> M
- [ ] <a href="https://leetcode.com/problems/partition-to-k-equal-sum-subsets/" target="_blank" rel="noopener noreferrer">Partition to K Equal Sum Subsets</a> M

### 1.4 Unbounded Knapsack
- [ ] <a href="https://leetcode.com/problems/coin-change/" target="_blank" rel="noopener noreferrer">Coin Change</a> M
- [ ] <a href="https://leetcode.com/problems/coin-change-ii/" target="_blank" rel="noopener noreferrer">Coin Change II</a> M. loop order matters (combinations vs permutations)
- [ ] <a href="https://leetcode.com/problems/combination-sum-iv/" target="_blank" rel="noopener noreferrer">Combination Sum IV</a> M
- [ ] <a href="https://leetcode.com/problems/perfect-squares/" target="_blank" rel="noopener noreferrer">Perfect Squares</a> M
- [ ] <a href="https://www.geeksforgeeks.org/problems/rod-cutting0840/1" target="_blank" rel="noopener noreferrer">Rod Cutting (GFG)</a> M
- [ ] <a href="https://leetcode.com/problems/integer-break/" target="_blank" rel="noopener noreferrer">Integer Break</a> M

### 1.5 Strings / Two-sequence DP
- [ ] <a href="https://leetcode.com/problems/longest-common-subsequence/" target="_blank" rel="noopener noreferrer">Longest Common Subsequence</a> M
- [ ] <a href="https://www.geeksforgeeks.org/problems/longest-common-substring1452/1" target="_blank" rel="noopener noreferrer">Longest Common Substring (GFG)</a> M
- [ ] <a href="https://leetcode.com/problems/longest-palindromic-subsequence/" target="_blank" rel="noopener noreferrer">Longest Palindromic Subsequence</a> M
- [ ] <a href="https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/" target="_blank" rel="noopener noreferrer">Minimum Insertion Steps to Make a String Palindrome</a> H
- [ ] <a href="https://leetcode.com/problems/delete-operation-for-two-strings/" target="_blank" rel="noopener noreferrer">Delete Operation for Two Strings</a> M
- [ ] <a href="https://leetcode.com/problems/shortest-common-supersequence/" target="_blank" rel="noopener noreferrer">Shortest Common Supersequence</a> H. print the string
- [ ] <a href="https://leetcode.com/problems/distinct-subsequences/" target="_blank" rel="noopener noreferrer">Distinct Subsequences</a> H
- [ ] <a href="https://leetcode.com/problems/edit-distance/" target="_blank" rel="noopener noreferrer">Edit Distance</a> M
- [ ] <a href="https://leetcode.com/problems/interleaving-string/" target="_blank" rel="noopener noreferrer">Interleaving String</a> M
- [ ] <a href="https://leetcode.com/problems/wildcard-matching/" target="_blank" rel="noopener noreferrer">Wildcard Matching</a> H
- [ ] <a href="https://leetcode.com/problems/regular-expression-matching/" target="_blank" rel="noopener noreferrer">Regular Expression Matching</a> H

### 1.6 LIS family
- [ ] <a href="https://leetcode.com/problems/longest-increasing-subsequence/" target="_blank" rel="noopener noreferrer">Longest Increasing Subsequence</a> M. O(n²) **then** O(n log n) with binary search
- [ ] Print the LIS (reconstruct via parent array)
- [ ] <a href="https://leetcode.com/problems/number-of-longest-increasing-subsequence/" target="_blank" rel="noopener noreferrer">Number of Longest Increasing Subsequence</a> M
- [ ] <a href="https://leetcode.com/problems/largest-divisible-subset/" target="_blank" rel="noopener noreferrer">Largest Divisible Subset</a> M
- [ ] <a href="https://leetcode.com/problems/longest-string-chain/" target="_blank" rel="noopener noreferrer">Longest String Chain</a> M
- [ ] <a href="https://leetcode.com/problems/russian-doll-envelopes/" target="_blank" rel="noopener noreferrer">Russian Doll Envelopes</a> H
- [ ] <a href="https://www.geeksforgeeks.org/problems/longest-bitonic-subsequence0824/1" target="_blank" rel="noopener noreferrer">Longest Bitonic Subsequence (GFG)</a> M
- [ ] <a href="https://leetcode.com/problems/maximum-length-of-pair-chain/" target="_blank" rel="noopener noreferrer">Maximum Length of Pair Chain</a> M

### 1.7 Stocks (state machine DP)
- [ ] <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/" target="_blank" rel="noopener noreferrer">Best Time to Buy and Sell Stock</a> E
- [ ] <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/" target="_blank" rel="noopener noreferrer">Best Time to Buy and Sell Stock II</a> M
- [ ] <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/" target="_blank" rel="noopener noreferrer">Best Time to Buy and Sell Stock III</a> H
- [ ] <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/" target="_blank" rel="noopener noreferrer">Best Time to Buy and Sell Stock IV</a> H
- [ ] <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/" target="_blank" rel="noopener noreferrer">Best Time to Buy and Sell Stock with Cooldown</a> M
- [ ] <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/" target="_blank" rel="noopener noreferrer">Best Time to Buy and Sell Stock with Transaction Fee</a> M

### 1.8 Partition / Interval DP
Concepts:
- [ ] `dp[i][j]` over a range, try every split `k` in between
- [ ] Iterate by interval length

Problems:
- [ ] Matrix Chain Multiplication (<a href="https://www.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1" target="_blank" rel="noopener noreferrer">GFG</a>) H
- [ ] <a href="https://leetcode.com/problems/minimum-cost-to-cut-a-stick/" target="_blank" rel="noopener noreferrer">Minimum Cost to Cut a Stick</a> H
- [ ] <a href="https://leetcode.com/problems/burst-balloons/" target="_blank" rel="noopener noreferrer">Burst Balloons</a> H
- [ ] <a href="https://leetcode.com/problems/palindrome-partitioning-ii/" target="_blank" rel="noopener noreferrer">Palindrome Partitioning II</a> H
- [ ] <a href="https://leetcode.com/problems/partition-array-for-maximum-sum/" target="_blank" rel="noopener noreferrer">Partition Array for Maximum Sum</a> M
- [ ] <a href="https://leetcode.com/problems/strange-printer/" target="_blank" rel="noopener noreferrer">Strange Printer</a> H
- [ ] <a href="https://www.geeksforgeeks.org/problems/boolean-parenthesization5610/1" target="_blank" rel="noopener noreferrer">Boolean Evaluation (GFG)</a> H

### 1.9 DP on Squares / Rectangles / Misc
- [ ] <a href="https://leetcode.com/problems/maximal-rectangle/" target="_blank" rel="noopener noreferrer">Maximal Rectangle</a> H. reuse your histogram code
- [ ] <a href="https://leetcode.com/problems/count-square-submatrices-with-all-ones/" target="_blank" rel="noopener noreferrer">Count Square Submatrices with All Ones</a> M
- [ ] <a href="https://leetcode.com/problems/unique-binary-search-trees/" target="_blank" rel="noopener noreferrer">Unique Binary Search Trees</a> M. Catalan
- [ ] <a href="https://leetcode.com/problems/domino-and-tromino-tiling/" target="_blank" rel="noopener noreferrer">Domino and Tromino Tiling</a> M
- [ ] <a href="https://leetcode.com/problems/out-of-boundary-paths/" target="_blank" rel="noopener noreferrer">Out of Boundary Paths</a> M

### 1.10 Advanced DP (after 1.1–1.9)
- [ ] Bitmask DP concept. `dp[mask][last]`
- [ ] <a href="https://leetcode.com/problems/shortest-path-visiting-all-nodes/" target="_blank" rel="noopener noreferrer">Shortest Path Visiting All Nodes</a> H
- [ ] <a href="https://leetcode.com/problems/partition-to-k-equal-sum-subsets/" target="_blank" rel="noopener noreferrer">Partition to K Equal Sum Subsets</a> M. bitmask version
- [ ] Tree DP: <a href="https://leetcode.com/problems/house-robber-iii/" target="_blank" rel="noopener noreferrer">House Robber III</a> M
- [ ] Tree DP: <a href="https://leetcode.com/problems/binary-tree-cameras/" target="_blank" rel="noopener noreferrer">Binary Tree Cameras</a> H
- [ ] Digit DP concept. <a href="https://leetcode.com/problems/numbers-at-most-n-given-digit-set/" target="_blank" rel="noopener noreferrer">Numbers At Most N Given Digit Set</a> H
- [ ] DP on probability: <a href="https://leetcode.com/problems/knight-probability-in-chessboard/" target="_blank" rel="noopener noreferrer">Knight Probability in Chessboard</a> M

### 1.11 CSES DP (competitive practice)
- [x] <a href="https://cses.fi/problemset/task/1633" target="_blank" rel="noopener noreferrer">Dice Combinations</a>
- [x] <a href="https://cses.fi/problemset/task/1634" target="_blank" rel="noopener noreferrer">Minimizing Coins</a>
- [x] <a href="https://cses.fi/problemset/task/1635" target="_blank" rel="noopener noreferrer">Coin Combinations I</a>
- [x] <a href="https://cses.fi/problemset/task/1636" target="_blank" rel="noopener noreferrer">Coin Combinations II</a>
- [x] <a href="https://cses.fi/problemset/task/1637" target="_blank" rel="noopener noreferrer">Removing Digits</a>
- [x] <a href="https://cses.fi/problemset/task/1638" target="_blank" rel="noopener noreferrer">Grid Paths</a>
- [x] <a href="https://cses.fi/problemset/task/1158" target="_blank" rel="noopener noreferrer">Book Shop</a>
- [x] <a href="https://cses.fi/problemset/task/1746" target="_blank" rel="noopener noreferrer">Array Description</a>
- [ ] <a href="https://cses.fi/problemset/task/1639" target="_blank" rel="noopener noreferrer">Edit Distance</a>
- [ ] <a href="https://cses.fi/problemset/task/1744" target="_blank" rel="noopener noreferrer">Rectangle Cutting</a>
- [x] <a href="https://cses.fi/problemset/task/1745" target="_blank" rel="noopener noreferrer">Money Sums</a>
- [ ] <a href="https://cses.fi/problemset/task/1097" target="_blank" rel="noopener noreferrer">Removal Game</a>
- [ ] <a href="https://cses.fi/problemset/task/1093" target="_blank" rel="noopener noreferrer">Two Sets II</a>
- [ ] <a href="https://cses.fi/problemset/task/1145" target="_blank" rel="noopener noreferrer">Increasing Subsequence</a>
- [ ] <a href="https://cses.fi/problemset/task/1140" target="_blank" rel="noopener noreferrer">Projects</a>
- [ ] <a href="https://cses.fi/problemset/task/1653" target="_blank" rel="noopener noreferrer">Elevator Rides</a>

### 1.12 AtCoder Educational DP Contest (best practice set, A to Z)
<a href="https://atcoder.jp/contests/dp/tasks" target="_blank" rel="noopener noreferrer">Contest tasks</a>
- [x] <a href="https://atcoder.jp/contests/dp/tasks/dp_a" target="_blank" rel="noopener noreferrer">A Frog 1</a>
- [x] <a href="https://atcoder.jp/contests/dp/tasks/dp_b" target="_blank" rel="noopener noreferrer">B Frog 2</a>
- [x] <a href="https://atcoder.jp/contests/dp/tasks/dp_c" target="_blank" rel="noopener noreferrer">C Vacation</a>
- [x] <a href="https://atcoder.jp/contests/dp/tasks/dp_d" target="_blank" rel="noopener noreferrer">D Knapsack 1</a>
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_e" target="_blank" rel="noopener noreferrer">E Knapsack 2</a> (stub in repo, finish. state = value, minimize weight)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_f" target="_blank" rel="noopener noreferrer">F LCS</a> (print the string)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_g" target="_blank" rel="noopener noreferrer">G Longest Path</a> (DP on DAG)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_h" target="_blank" rel="noopener noreferrer">H Grid 1</a>
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_i" target="_blank" rel="noopener noreferrer">I Coins</a> (probability DP)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_j" target="_blank" rel="noopener noreferrer">J Sushi</a> (expectation DP)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_k" target="_blank" rel="noopener noreferrer">K Stones</a> (game DP)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_l" target="_blank" rel="noopener noreferrer">L Deque</a> (game DP)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_m" target="_blank" rel="noopener noreferrer">M Candies</a> (prefix-sum optimized DP)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_n" target="_blank" rel="noopener noreferrer">N Slimes</a> (interval DP)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_o" target="_blank" rel="noopener noreferrer">O Matching</a> (bitmask DP)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_p" target="_blank" rel="noopener noreferrer">P Independent Set</a> (tree DP)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_q" target="_blank" rel="noopener noreferrer">Q Flowers</a> (DP + Fenwick/segment tree)
- [ ] <a href="https://atcoder.jp/contests/dp/tasks/dp_r" target="_blank" rel="noopener noreferrer">R Walk</a> (matrix exponentiation)

---

## Phase 2: Graphs, finish (Weeks 6–7)

### 2.1 DSU (Disjoint Set Union)
Concepts:
- [x] `find` with path compression
- [x] `union` by rank/size
- [x] Implement DSU (currently `DSU_A` inside `Kruskal.java`; extract to `graphs/dsu/DSU.java` and reuse)
- [x] **Fix bug in `Kruskal.java:13`**: sorts by `a[0]` (node u) instead of `a[2]` (weight). MST cost is wrong on most inputs

Problems:
- [ ] <a href="https://leetcode.com/problems/number-of-provinces/" target="_blank" rel="noopener noreferrer">Number of Provinces</a> M. redo with DSU
- [ ] <a href="https://leetcode.com/problems/redundant-connection/" target="_blank" rel="noopener noreferrer">Redundant Connection</a> M
- [ ] <a href="https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/" target="_blank" rel="noopener noreferrer">Number of Connected Components in an Undirected Graph</a> M
- [ ] <a href="https://leetcode.com/problems/graph-valid-tree/" target="_blank" rel="noopener noreferrer">Graph Valid Tree</a> M
- [x] <a href="https://leetcode.com/problems/accounts-merge/" target="_blank" rel="noopener noreferrer">Accounts Merge</a> M
- [ ] <a href="https://leetcode.com/problems/number-of-islands-ii/" target="_blank" rel="noopener noreferrer">Number of Islands II</a> H
- [ ] <a href="https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/" target="_blank" rel="noopener noreferrer">Most Stones Removed with Same Row or Column</a> M
- [ ] <a href="https://leetcode.com/problems/making-a-large-island/" target="_blank" rel="noopener noreferrer">Making A Large Island</a> H
- [ ] <a href="https://leetcode.com/problems/number-of-operations-to-make-network-connected/" target="_blank" rel="noopener noreferrer">Number of Operations to Make Network Connected</a> M

### 2.2 Minimum Spanning Tree
Concepts:
- [x] Kruskal (sort edges + DSU), bug fixed
- [x] Prim (priority queue)
- [ ] Cut property (why greedy works)

Problems:
- [ ] <a href="https://leetcode.com/problems/min-cost-to-connect-all-points/" target="_blank" rel="noopener noreferrer">Min Cost to Connect All Points</a> M
- [ ] <a href="https://leetcode.com/problems/connecting-cities-with-minimum-cost/" target="_blank" rel="noopener noreferrer">Connecting Cities With Minimum Cost</a> M
- [ ] <a href="https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/" target="_blank" rel="noopener noreferrer">Find Critical and Pseudo-Critical Edges in MST</a> H
- [ ] CSES <a href="https://cses.fi/problemset/task/1675" target="_blank" rel="noopener noreferrer">Road Reparation</a>

### 2.3 Bipartite / Cycle / Topo (revise + extend)
- [x] <a href="https://leetcode.com/problems/is-graph-bipartite/" target="_blank" rel="noopener noreferrer">Is Graph Bipartite?</a> M
- [ ] <a href="https://leetcode.com/problems/possible-bipartition/" target="_blank" rel="noopener noreferrer">Possible Bipartition</a> M
- [ ] <a href="https://leetcode.com/problems/course-schedule-ii/" target="_blank" rel="noopener noreferrer">Course Schedule II</a> M
- [ ] <a href="https://leetcode.com/problems/alien-dictionary/" target="_blank" rel="noopener noreferrer">Alien Dictionary</a> H
- [ ] <a href="https://leetcode.com/problems/find-eventual-safe-states/" target="_blank" rel="noopener noreferrer">Find Eventual Safe States</a> M
- [ ] <a href="https://leetcode.com/problems/clone-graph/" target="_blank" rel="noopener noreferrer">Clone Graph</a> M
- [ ] <a href="https://leetcode.com/problems/surrounded-regions/" target="_blank" rel="noopener noreferrer">Surrounded Regions</a> M
- [ ] <a href="https://leetcode.com/problems/pacific-atlantic-water-flow/" target="_blank" rel="noopener noreferrer">Pacific Atlantic Water Flow</a> M

### 2.4 Shortest Path (revise)
- [x] <a href="https://leetcode.com/problems/network-delay-time/" target="_blank" rel="noopener noreferrer">Network Delay Time</a> M. Dijkstra
- [x] <a href="https://leetcode.com/problems/path-with-minimum-effort/" target="_blank" rel="noopener noreferrer">Path with Minimum Effort</a> M
- [ ] <a href="https://leetcode.com/problems/cheapest-flights-within-k-stops/" target="_blank" rel="noopener noreferrer">Cheapest Flights Within K Stops</a> M. Bellman-Ford / BFS levels
- [ ] <a href="https://leetcode.com/problems/path-with-maximum-probability/" target="_blank" rel="noopener noreferrer">Path With Maximum Probability</a> M
- [ ] <a href="https://leetcode.com/problems/swim-in-rising-water/" target="_blank" rel="noopener noreferrer">Swim in Rising Water</a> H
- [ ] <a href="https://leetcode.com/problems/word-ladder/" target="_blank" rel="noopener noreferrer">Word Ladder</a> H
- [ ] <a href="https://leetcode.com/problems/word-ladder-ii/" target="_blank" rel="noopener noreferrer">Word Ladder II</a> H
- [ ] <a href="https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/" target="_blank" rel="noopener noreferrer">Number of Ways to Arrive at Destination</a> M
- [x] <a href="https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/" target="_blank" rel="noopener noreferrer">Find the City With the Smallest Number of Neighbors at a Threshold Distance</a> M. Floyd-Warshall
- [ ] <a href="https://leetcode.com/problems/reconstruct-itinerary/" target="_blank" rel="noopener noreferrer">Reconstruct Itinerary</a> H. Eulerian path

### 2.5 SCC, Bridges, Articulation Points
Concepts:
- [ ] Kosaraju (2 DFS, transpose graph)
- [ ] Tarjan: discovery time / low-link
- [ ] Bridge condition `low[v] > disc[u]`
- [ ] Articulation point condition

Problems:
- [ ] <a href="https://leetcode.com/problems/critical-connections-in-a-network/" target="_blank" rel="noopener noreferrer">Critical Connections in a Network</a> H
- [ ] CSES <a href="https://cses.fi/problemset/task/1683" target="_blank" rel="noopener noreferrer">Strongly Connected Components</a>
- [ ] CSES <a href="https://cses.fi/problemset/task/1686" target="_blank" rel="noopener noreferrer">Coin Collector</a>

### 2.6 CSES Graph practice
- [x] <a href="https://cses.fi/problemset/task/1192" target="_blank" rel="noopener noreferrer">Counting Rooms</a>
- [x] <a href="https://cses.fi/problemset/task/1193" target="_blank" rel="noopener noreferrer">Labyrinth</a>
- [ ] <a href="https://cses.fi/problemset/task/1666" target="_blank" rel="noopener noreferrer">Building Roads</a>
- [ ] <a href="https://cses.fi/problemset/task/1667" target="_blank" rel="noopener noreferrer">Message Route</a>
- [ ] <a href="https://cses.fi/problemset/task/1668" target="_blank" rel="noopener noreferrer">Building Teams</a>
- [ ] <a href="https://cses.fi/problemset/task/1669" target="_blank" rel="noopener noreferrer">Round Trip</a>
- [ ] <a href="https://cses.fi/problemset/task/1194" target="_blank" rel="noopener noreferrer">Monsters</a>
- [ ] <a href="https://cses.fi/problemset/task/1671" target="_blank" rel="noopener noreferrer">Shortest Routes I</a>
- [ ] <a href="https://cses.fi/problemset/task/1672" target="_blank" rel="noopener noreferrer">Shortest Routes II</a>
- [ ] <a href="https://cses.fi/problemset/task/1673" target="_blank" rel="noopener noreferrer">High Score</a>
- [ ] <a href="https://cses.fi/problemset/task/1195" target="_blank" rel="noopener noreferrer">Flight Discount</a>
- [x] <a href="https://cses.fi/problemset/task/1197" target="_blank" rel="noopener noreferrer">Cycle Finding</a> (done in repo)
- [ ] <a href="https://cses.fi/problemset/task/1679" target="_blank" rel="noopener noreferrer">Course Schedule</a>
- [ ] <a href="https://cses.fi/problemset/task/1680" target="_blank" rel="noopener noreferrer">Longest Flight Route</a>
- [ ] <a href="https://cses.fi/problemset/task/1681" target="_blank" rel="noopener noreferrer">Game Routes</a>
- [ ] <a href="https://cses.fi/problemset/task/1202" target="_blank" rel="noopener noreferrer">Investigation</a>

---

## Phase 3: Heap, Greedy, Intervals (Week 8)

### 3.1 Heap / Priority Queue
- [ ] <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/" target="_blank" rel="noopener noreferrer">Kth Largest Element in an Array</a> M
- [ ] <a href="https://leetcode.com/problems/top-k-frequent-elements/" target="_blank" rel="noopener noreferrer">Top K Frequent Elements</a> M
- [ ] <a href="https://leetcode.com/problems/last-stone-weight/" target="_blank" rel="noopener noreferrer">Last Stone Weight</a> E
- [ ] <a href="https://leetcode.com/problems/k-closest-points-to-origin/" target="_blank" rel="noopener noreferrer">K Closest Points to Origin</a> M
- [ ] <a href="https://leetcode.com/problems/merge-k-sorted-lists/" target="_blank" rel="noopener noreferrer">Merge k Sorted Lists</a> H
- [ ] <a href="https://leetcode.com/problems/find-median-from-data-stream/" target="_blank" rel="noopener noreferrer">Find Median from Data Stream</a> H. two heaps
- [ ] <a href="https://leetcode.com/problems/task-scheduler/" target="_blank" rel="noopener noreferrer">Task Scheduler</a> M
- [ ] <a href="https://leetcode.com/problems/reorganize-string/" target="_blank" rel="noopener noreferrer">Reorganize String</a> M
- [ ] <a href="https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/" target="_blank" rel="noopener noreferrer">Kth Smallest Element in a Sorted Matrix</a> M
- [ ] <a href="https://leetcode.com/problems/design-twitter/" target="_blank" rel="noopener noreferrer">Design Twitter</a> M
- [ ] <a href="https://leetcode.com/problems/sliding-window-median/" target="_blank" rel="noopener noreferrer">Sliding Window Median</a> H

### 3.2 Greedy
Concepts:
- [ ] Exchange argument (prove greedy)
- [ ] Sort by end time / ratio / deadline

Problems:
- [ ] <a href="https://leetcode.com/problems/jump-game/" target="_blank" rel="noopener noreferrer">Jump Game</a> M
- [ ] <a href="https://leetcode.com/problems/gas-station/" target="_blank" rel="noopener noreferrer">Gas Station</a> M
- [ ] <a href="https://leetcode.com/problems/candy/" target="_blank" rel="noopener noreferrer">Candy</a> H
- [ ] <a href="https://leetcode.com/problems/hand-of-straights/" target="_blank" rel="noopener noreferrer">Hand of Straights</a> M
- [ ] <a href="https://leetcode.com/problems/partition-labels/" target="_blank" rel="noopener noreferrer">Partition Labels</a> M
- [ ] <a href="https://leetcode.com/problems/valid-parenthesis-string/" target="_blank" rel="noopener noreferrer">Valid Parenthesis String</a> M
- [ ] <a href="https://leetcode.com/problems/merge-triplets-to-form-target-triplet/" target="_blank" rel="noopener noreferrer">Merge Triplets to Form Target Triplet</a> M
- [ ] <a href="https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1" target="_blank" rel="noopener noreferrer">Minimum Number of Platforms (GFG)</a> M
- [ ] <a href="https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1" target="_blank" rel="noopener noreferrer">Job Sequencing Problem (GFG)</a> M
- [ ] <a href="https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1" target="_blank" rel="noopener noreferrer">Fractional Knapsack (GFG)</a> M

### 3.3 Intervals
- [ ] <a href="https://leetcode.com/problems/merge-intervals/" target="_blank" rel="noopener noreferrer">Merge Intervals</a> M (done in repo, revise)
- [ ] <a href="https://leetcode.com/problems/insert-interval/" target="_blank" rel="noopener noreferrer">Insert Interval</a> M
- [ ] <a href="https://leetcode.com/problems/non-overlapping-intervals/" target="_blank" rel="noopener noreferrer">Non-overlapping Intervals</a> M
- [ ] <a href="https://leetcode.com/problems/meeting-rooms-ii/" target="_blank" rel="noopener noreferrer">Meeting Rooms II</a> M
- [ ] <a href="https://leetcode.com/problems/minimum-interval-to-include-each-query/" target="_blank" rel="noopener noreferrer">Minimum Interval to Include Each Query</a> H

### 3.4 Binary Search extras (answer-space)
- [ ] <a href="https://www.spoj.com/problems/AGGRCOW/" target="_blank" rel="noopener noreferrer">Aggressive Cows (SPOJ)</a> M
- [ ] <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/" target="_blank" rel="noopener noreferrer">Median of Two Sorted Arrays</a> H (done in repo, revise)
- [ ] <a href="https://leetcode.com/problems/time-based-key-value-store/" target="_blank" rel="noopener noreferrer">Time Based Key-Value Store</a> M

---

## Phase 4: Trie, Range Queries, Math (Week 9)

### 4.1 Trie
- [ ] <a href="https://leetcode.com/problems/implement-trie-prefix-tree/" target="_blank" rel="noopener noreferrer">Implement Trie</a> M
- [ ] <a href="https://leetcode.com/problems/design-add-and-search-words-data-structure/" target="_blank" rel="noopener noreferrer">Design Add and Search Words Data Structure</a> M
- [ ] <a href="https://leetcode.com/problems/word-search-ii/" target="_blank" rel="noopener noreferrer">Word Search II</a> H
- [ ] <a href="https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/" target="_blank" rel="noopener noreferrer">Maximum XOR of Two Numbers in an Array</a> M

### 4.2 Prefix sums / Difference arrays / Range queries
Concepts:
- [x] Prefix sum, 2D prefix sum
- [x] Difference array (range update)
- [x] Fenwick Tree (BIT)
- [ ] Segment Tree (point update, range query)
- [ ] Sparse Table (static RMQ)

Problems:
- [ ] <a href="https://leetcode.com/problems/range-sum-query-immutable/" target="_blank" rel="noopener noreferrer">Range Sum Query - Immutable</a> E
- [ ] <a href="https://leetcode.com/problems/range-sum-query-2d-immutable/" target="_blank" rel="noopener noreferrer">Range Sum Query 2D - Immutable</a> M
- [ ] <a href="https://leetcode.com/problems/corporate-flight-bookings/" target="_blank" rel="noopener noreferrer">Corporate Flight Bookings</a> M. difference array
- [ ] <a href="https://leetcode.com/problems/range-sum-query-mutable/" target="_blank" rel="noopener noreferrer">Range Sum Query - Mutable</a> M. BIT / segment tree
- [ ] <a href="https://leetcode.com/problems/count-of-smaller-numbers-after-self/" target="_blank" rel="noopener noreferrer">Count of Smaller Numbers After Self</a> H
- [x] CSES <a href="https://cses.fi/problemset/task/1646" target="_blank" rel="noopener noreferrer">Static Range Sum Queries</a>
- [x] CSES <a href="https://cses.fi/problemset/task/1647" target="_blank" rel="noopener noreferrer">Static Range Minimum Queries</a>
- [x] CSES <a href="https://cses.fi/problemset/task/1648" target="_blank" rel="noopener noreferrer">Dynamic Range Sum Queries</a>

### 4.3 Math for Competitive Programming
Concepts:
- [ ] Sieve of Eratosthenes
- [ ] Prime factorization (trial division, then SPF sieve)
- [ ] Modular arithmetic, `(a*b) % m`, overflow with `long`
- [ ] Fast exponentiation `a^b mod m`
- [ ] Modular inverse (Fermat, `m` prime)
- [ ] nCr mod p with precomputed factorials
- [ ] GCD / LCM (Euclid), extended Euclid
- [ ] Inclusion-exclusion
- [ ] Basic combinatorics (stars and bars, Catalan)

Problems:
- [ ] <a href="https://leetcode.com/problems/count-primes/" target="_blank" rel="noopener noreferrer">Count Primes</a> M
- [ ] <a href="https://leetcode.com/problems/powx-n/" target="_blank" rel="noopener noreferrer">Pow(x, n)</a> M
- [ ] <a href="https://leetcode.com/problems/super-pow/" target="_blank" rel="noopener noreferrer">Super Pow</a> M
- [ ] <a href="https://leetcode.com/problems/ugly-number-ii/" target="_blank" rel="noopener noreferrer">Ugly Number II</a> M
- [ ] CSES <a href="https://cses.fi/problemset/task/1095" target="_blank" rel="noopener noreferrer">Exponentiation</a>
- [ ] CSES <a href="https://cses.fi/problemset/task/1713" target="_blank" rel="noopener noreferrer">Counting Divisors</a>
- [ ] CSES <a href="https://cses.fi/problemset/task/1079" target="_blank" rel="noopener noreferrer">Binomial Coefficients</a>
- [ ] CSES <a href="https://cses.fi/problemset/task/1715" target="_blank" rel="noopener noreferrer">Creating Strings II</a>

### 4.4 Two pointers / String algorithms
- [ ] <a href="https://leetcode.com/problems/3sum/" target="_blank" rel="noopener noreferrer">3Sum</a> M (done in repo, revise)
- [ ] <a href="https://leetcode.com/problems/container-with-most-water/" target="_blank" rel="noopener noreferrer">Container With Most Water</a> M
- [ ] <a href="https://leetcode.com/problems/minimum-window-substring/" target="_blank" rel="noopener noreferrer">Minimum Window Substring</a> H
- [ ] <a href="https://leetcode.com/problems/permutation-in-string/" target="_blank" rel="noopener noreferrer">Permutation in String</a> M
- [ ] <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/" target="_blank" rel="noopener noreferrer">Find the Index of the First Occurrence in a String</a> E. KMP / Z-function
- [ ] <a href="https://leetcode.com/problems/shortest-palindrome/" target="_blank" rel="noopener noreferrer">Shortest Palindrome</a> H. KMP

---

## Phase 5: Timed practice (Week 10 onward)

### 5.1 Contests
- [ ] LeetCode Weekly: attend 4 in a row, goal 2/4 solved
- [ ] LeetCode Weekly: goal 3/4 solved
- [ ] Codeforces Div. 3 or Div. 4: 3 live or virtual rounds, goal A–C (2 attempted: rounds 1119, 1122; finish D/C stubs)
- [ ] Codeforces Div. 3 or Div. 4: goal A–D
- [ ] Codeforces Div. 2: 3 rounds, goal A–B

### 5.2 Codeforces ladder by tag
Use <a href="https://codeforces.com/problemset" target="_blank" rel="noopener noreferrer">problemset</a> with a tag filter. 45 min cap before reading editorial. Log the ID in `competitive_programming/codeforces/`.

| Rating | Target | Tags to cover |
|---|---|---|
| 800 | Done, ~27 solved | implementation, math, greedy |
| 900–1000 | 30 (11 done) | math, greedy, strings, sortings |
| 1100–1200 | 30 (8 done) | constructive, binary search, two pointers, number theory |
| 1300–1400 | 30 (1 done) | dp, graphs, dfs and similar, bitmasks, DSU |
| 1500 | 15 | mixed |

- [ ] 900–1000: 30 solved
- [ ] 1100–1200: 30 solved
- [ ] 1300–1400: 30 solved
- [ ] 1500: 15 solved
- [ ] Reach Codeforces rating 1200
- [ ] Reach Codeforces rating 1400

---

## Weak-pattern drills (repeat monthly)

Patterns where you showed gaps. Re-solve 1–2 from each every month.
- [ ] Monotonic stack/deque: Sliding Window Maximum, Next Greater Element, Largest Rectangle
- [ ] Sliding window with "at most K" trick: Binary Subarrays With Sum, Nice Subarrays
- [ ] Rotated array binary search variants
- [ ] Linked list pointer manipulation: reverse k-group, add two numbers, DLL delete
- [ ] Bit tricks: Single Number III, Subsets, Subarray XOR

---

## Revision Log

Redo each problem after 1 day, 1 week and 1 month. Date format `YYYY-MM-DD`.

| Problem | First solved | +1 day | +1 week | +1 month | Trick / why I failed |
|---|---|---|---|---|---|
| | | | | | |

---

## Sources

- Problem sets curated from: Striver A2Z / DP series, NeetCode 150, Blind 75, <a href="https://cses.fi/problemset/" target="_blank" rel="noopener noreferrer">CSES Problem Set</a>, <a href="https://codeforces.com/problemset" target="_blank" rel="noopener noreferrer">Codeforces problemset</a>.
- Problem links and groupings written from standard curated lists. Spot-check any link that 404s.
