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
- [ ] [Next Permutation](https://leetcode.com/problems/next-permutation/) M. find pivot, swap, reverse suffix
- [ ] [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) M. use first row/col as markers
- [ ] [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) M. track both max and min
- [ ] [Majority Element II](https://leetcode.com/problems/majority-element-ii/) M. Moore voting, 2 candidates
- [ ] [Count Inversions](https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1) M. merge sort

### Binary Search
- [ ] [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) M
- [ ] [Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) M
- [ ] [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) M
- [ ] [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/) H

### Sliding Window / Two Pointers
- [ ] [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/) M
- [ ] [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) M
- [ ] [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) H. monotonic deque

### Linked List / Strings / Bits / Stack
- [ ] [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) M
- [ ] [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) H
- [ ] [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/) M
- [ ] [Single Number III](https://leetcode.com/problems/single-number-iii/) M. xor, lowest set bit
- [ ] [Subsets](https://leetcode.com/problems/subsets/) M. bitmask version too
- [ ] [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) E
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
- [ ] [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) E
- [ ] [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) E
- [ ] [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) E
- [ ] [House Robber](https://leetcode.com/problems/house-robber/) M
- [ ] [House Robber II](https://leetcode.com/problems/house-robber-ii/) M
- [ ] [Decode Ways](https://leetcode.com/problems/decode-ways/) M
- [ ] [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) M. Kadane as DP
- [ ] [Word Break](https://leetcode.com/problems/word-break/) M
- [ ] [Jump Game](https://leetcode.com/problems/jump-game/) M
- [ ] [Jump Game II](https://leetcode.com/problems/jump-game-ii/) M
- [ ] [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) M
- [ ] [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) M
- [x] [Frog Jump with K distance (GFG)](https://www.geeksforgeeks.org/problems/minimal-cost/1) M

### 1.2 Grid DP
- [ ] [Unique Paths](https://leetcode.com/problems/unique-paths/) M
- [ ] [Unique Paths II](https://leetcode.com/problems/unique-paths-ii/) M
- [ ] [Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/) M
- [ ] [Triangle](https://leetcode.com/problems/triangle/) M
- [ ] [Minimum Falling Path Sum](https://leetcode.com/problems/minimum-falling-path-sum/) M
- [ ] [Maximal Square](https://leetcode.com/problems/maximal-square/) M
- [ ] [Cherry Pickup II](https://leetcode.com/problems/cherry-pickup-ii/) H. 3D state
- [ ] [Dungeon Game](https://leetcode.com/problems/dungeon-game/) H. fill backwards
- [ ] [Longest Increasing Path in a Matrix](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/) H. DFS + memo

### 1.3 Subset / 0-1 Knapsack
Concepts:
- [ ] Pick / not-pick state `dp[i][target]`
- [ ] Counting vs boolean vs min/max variants

Problems:
- [ ] [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) M
- [ ] [Target Sum](https://leetcode.com/problems/target-sum/) M
- [ ] [Last Stone Weight II](https://leetcode.com/problems/last-stone-weight-ii/) M
- [ ] [Ones and Zeroes](https://leetcode.com/problems/ones-and-zeroes/) M. 2D knapsack
- [ ] [Partitions with Given Difference (GFG)](https://www.geeksforgeeks.org/problems/partitions-with-given-difference/1) M
- [x] [0-1 Knapsack (GFG)](https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1) M
- [ ] [Partition to K Equal Sum Subsets](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/) M

### 1.4 Unbounded Knapsack
- [ ] [Coin Change](https://leetcode.com/problems/coin-change/) M
- [ ] [Coin Change II](https://leetcode.com/problems/coin-change-ii/) M. loop order matters (combinations vs permutations)
- [ ] [Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/) M
- [ ] [Perfect Squares](https://leetcode.com/problems/perfect-squares/) M
- [ ] [Rod Cutting (GFG)](https://www.geeksforgeeks.org/problems/rod-cutting0840/1) M
- [ ] [Integer Break](https://leetcode.com/problems/integer-break/) M

### 1.5 Strings / Two-sequence DP
- [ ] [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) M
- [ ] [Longest Common Substring (GFG)](https://www.geeksforgeeks.org/problems/longest-common-substring1452/1) M
- [ ] [Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/) M
- [ ] [Minimum Insertion Steps to Make a String Palindrome](https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/) H
- [ ] [Delete Operation for Two Strings](https://leetcode.com/problems/delete-operation-for-two-strings/) M
- [ ] [Shortest Common Supersequence](https://leetcode.com/problems/shortest-common-supersequence/) H. print the string
- [ ] [Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/) H
- [ ] [Edit Distance](https://leetcode.com/problems/edit-distance/) M
- [ ] [Interleaving String](https://leetcode.com/problems/interleaving-string/) M
- [ ] [Wildcard Matching](https://leetcode.com/problems/wildcard-matching/) H
- [ ] [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) H

### 1.6 LIS family
- [ ] [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) M. O(n²) **then** O(n log n) with binary search
- [ ] Print the LIS (reconstruct via parent array)
- [ ] [Number of Longest Increasing Subsequence](https://leetcode.com/problems/number-of-longest-increasing-subsequence/) M
- [ ] [Largest Divisible Subset](https://leetcode.com/problems/largest-divisible-subset/) M
- [ ] [Longest String Chain](https://leetcode.com/problems/longest-string-chain/) M
- [ ] [Russian Doll Envelopes](https://leetcode.com/problems/russian-doll-envelopes/) H
- [ ] [Longest Bitonic Subsequence (GFG)](https://www.geeksforgeeks.org/problems/longest-bitonic-subsequence0824/1) M
- [ ] [Maximum Length of Pair Chain](https://leetcode.com/problems/maximum-length-of-pair-chain/) M

### 1.7 Stocks (state machine DP)
- [ ] [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) E
- [ ] [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) M
- [ ] [Best Time to Buy and Sell Stock III](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/) H
- [ ] [Best Time to Buy and Sell Stock IV](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/) H
- [ ] [Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) M
- [ ] [Best Time to Buy and Sell Stock with Transaction Fee](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/) M

### 1.8 Partition / Interval DP
Concepts:
- [ ] `dp[i][j]` over a range, try every split `k` in between
- [ ] Iterate by interval length

Problems:
- [ ] Matrix Chain Multiplication ([GFG](https://www.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1)) H
- [ ] [Minimum Cost to Cut a Stick](https://leetcode.com/problems/minimum-cost-to-cut-a-stick/) H
- [ ] [Burst Balloons](https://leetcode.com/problems/burst-balloons/) H
- [ ] [Palindrome Partitioning II](https://leetcode.com/problems/palindrome-partitioning-ii/) H
- [ ] [Partition Array for Maximum Sum](https://leetcode.com/problems/partition-array-for-maximum-sum/) M
- [ ] [Strange Printer](https://leetcode.com/problems/strange-printer/) H
- [ ] [Boolean Evaluation (GFG)](https://www.geeksforgeeks.org/problems/boolean-parenthesization5610/1) H

### 1.9 DP on Squares / Rectangles / Misc
- [ ] [Maximal Rectangle](https://leetcode.com/problems/maximal-rectangle/) H. reuse your histogram code
- [ ] [Count Square Submatrices with All Ones](https://leetcode.com/problems/count-square-submatrices-with-all-ones/) M
- [ ] [Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees/) M. Catalan
- [ ] [Domino and Tromino Tiling](https://leetcode.com/problems/domino-and-tromino-tiling/) M
- [ ] [Out of Boundary Paths](https://leetcode.com/problems/out-of-boundary-paths/) M

### 1.10 Advanced DP (after 1.1–1.9)
- [ ] Bitmask DP concept. `dp[mask][last]`
- [ ] [Shortest Path Visiting All Nodes](https://leetcode.com/problems/shortest-path-visiting-all-nodes/) H
- [ ] [Partition to K Equal Sum Subsets](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/) M. bitmask version
- [ ] Tree DP: [House Robber III](https://leetcode.com/problems/house-robber-iii/) M
- [ ] Tree DP: [Binary Tree Cameras](https://leetcode.com/problems/binary-tree-cameras/) H
- [ ] Digit DP concept. [Numbers At Most N Given Digit Set](https://leetcode.com/problems/numbers-at-most-n-given-digit-set/) H
- [ ] DP on probability: [Knight Probability in Chessboard](https://leetcode.com/problems/knight-probability-in-chessboard/) M

### 1.11 CSES DP (competitive practice)
- [x] [Dice Combinations](https://cses.fi/problemset/task/1633)
- [x] [Minimizing Coins](https://cses.fi/problemset/task/1634)
- [x] [Coin Combinations I](https://cses.fi/problemset/task/1635)
- [x] [Coin Combinations II](https://cses.fi/problemset/task/1636)
- [x] [Removing Digits](https://cses.fi/problemset/task/1637)
- [x] [Grid Paths](https://cses.fi/problemset/task/1638)
- [x] [Book Shop](https://cses.fi/problemset/task/1158)
- [x] [Array Description](https://cses.fi/problemset/task/1746)
- [ ] [Edit Distance](https://cses.fi/problemset/task/1639)
- [ ] [Rectangle Cutting](https://cses.fi/problemset/task/1744)
- [x] [Money Sums](https://cses.fi/problemset/task/1745)
- [ ] [Removal Game](https://cses.fi/problemset/task/1097)
- [ ] [Two Sets II](https://cses.fi/problemset/task/1093)
- [ ] [Increasing Subsequence](https://cses.fi/problemset/task/1145)
- [ ] [Projects](https://cses.fi/problemset/task/1140)
- [ ] [Elevator Rides](https://cses.fi/problemset/task/1653)

### 1.12 AtCoder Educational DP Contest (best practice set, A to Z)
[Contest tasks](https://atcoder.jp/contests/dp/tasks)
- [x] A Frog 1
- [x] B Frog 2
- [x] C Vacation
- [x] D Knapsack 1
- [ ] E Knapsack 2 (stub in repo, finish. state = value, minimize weight)
- [ ] F LCS (print the string)
- [ ] G Longest Path (DP on DAG)
- [ ] H Grid 1
- [ ] I Coins (probability DP)
- [ ] J Sushi (expectation DP)
- [ ] K Stones (game DP)
- [ ] L Deque (game DP)
- [ ] M Candies (prefix-sum optimized DP)
- [ ] N Slimes (interval DP)
- [ ] O Matching (bitmask DP)
- [ ] P Independent Set (tree DP)
- [ ] Q Flowers (DP + Fenwick/segment tree)
- [ ] R Walk (matrix exponentiation)

---

## Phase 2: Graphs, finish (Weeks 6–7)

### 2.1 DSU (Disjoint Set Union)
Concepts:
- [x] `find` with path compression
- [x] `union` by rank/size
- [x] Implement DSU (currently `DSU_A` inside `Kruskal.java`; extract to `graphs/dsu/DSU.java` and reuse)
- [x] **Fix bug in `Kruskal.java:13`**: sorts by `a[0]` (node u) instead of `a[2]` (weight). MST cost is wrong on most inputs

Problems:
- [ ] [Number of Provinces](https://leetcode.com/problems/number-of-provinces/) M. redo with DSU
- [ ] [Redundant Connection](https://leetcode.com/problems/redundant-connection/) M
- [ ] [Number of Connected Components in an Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) M
- [ ] [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/) M
- [x] [Accounts Merge](https://leetcode.com/problems/accounts-merge/) M
- [ ] [Number of Islands II](https://leetcode.com/problems/number-of-islands-ii/) H
- [ ] [Most Stones Removed with Same Row or Column](https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/) M
- [ ] [Making A Large Island](https://leetcode.com/problems/making-a-large-island/) H
- [ ] [Number of Operations to Make Network Connected](https://leetcode.com/problems/number-of-operations-to-make-network-connected/) M

### 2.2 Minimum Spanning Tree
Concepts:
- [x] Kruskal (sort edges + DSU), bug fixed
- [x] Prim (priority queue)
- [ ] Cut property (why greedy works)

Problems:
- [ ] [Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/) M
- [ ] [Connecting Cities With Minimum Cost](https://leetcode.com/problems/connecting-cities-with-minimum-cost/) M
- [ ] [Find Critical and Pseudo-Critical Edges in MST](https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/) H
- [ ] CSES [Road Reparation](https://cses.fi/problemset/task/1675)

### 2.3 Bipartite / Cycle / Topo (revise + extend)
- [x] [Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/) M
- [ ] [Possible Bipartition](https://leetcode.com/problems/possible-bipartition/) M
- [ ] [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) M
- [ ] [Alien Dictionary](https://leetcode.com/problems/alien-dictionary/) H
- [ ] [Find Eventual Safe States](https://leetcode.com/problems/find-eventual-safe-states/) M
- [ ] [Clone Graph](https://leetcode.com/problems/clone-graph/) M
- [ ] [Surrounded Regions](https://leetcode.com/problems/surrounded-regions/) M
- [ ] [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/) M

### 2.4 Shortest Path (revise)
- [x] [Network Delay Time](https://leetcode.com/problems/network-delay-time/) M. Dijkstra
- [x] [Path with Minimum Effort](https://leetcode.com/problems/path-with-minimum-effort/) M
- [ ] [Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/) M. Bellman-Ford / BFS levels
- [ ] [Path With Maximum Probability](https://leetcode.com/problems/path-with-maximum-probability/) M
- [ ] [Swim in Rising Water](https://leetcode.com/problems/swim-in-rising-water/) H
- [ ] [Word Ladder](https://leetcode.com/problems/word-ladder/) H
- [ ] [Word Ladder II](https://leetcode.com/problems/word-ladder-ii/) H
- [ ] [Number of Ways to Arrive at Destination](https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/) M
- [x] [Find the City With the Smallest Number of Neighbors at a Threshold Distance](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/) M. Floyd-Warshall
- [ ] [Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary/) H. Eulerian path

### 2.5 SCC, Bridges, Articulation Points
Concepts:
- [ ] Kosaraju (2 DFS, transpose graph)
- [ ] Tarjan: discovery time / low-link
- [ ] Bridge condition `low[v] > disc[u]`
- [ ] Articulation point condition

Problems:
- [ ] [Critical Connections in a Network](https://leetcode.com/problems/critical-connections-in-a-network/) H
- [ ] CSES [Strongly Connected Components](https://cses.fi/problemset/task/1683)
- [ ] CSES [Coin Collector](https://cses.fi/problemset/task/1686)

### 2.6 CSES Graph practice
- [x] [Counting Rooms](https://cses.fi/problemset/task/1192)
- [x] [Labyrinth](https://cses.fi/problemset/task/1193)
- [ ] [Building Roads](https://cses.fi/problemset/task/1666)
- [ ] [Message Route](https://cses.fi/problemset/task/1667)
- [ ] [Building Teams](https://cses.fi/problemset/task/1668)
- [ ] [Round Trip](https://cses.fi/problemset/task/1669)
- [ ] [Monsters](https://cses.fi/problemset/task/1194)
- [ ] [Shortest Routes I](https://cses.fi/problemset/task/1671)
- [ ] [Shortest Routes II](https://cses.fi/problemset/task/1672)
- [ ] [High Score](https://cses.fi/problemset/task/1673)
- [ ] [Flight Discount](https://cses.fi/problemset/task/1195)
- [x] [Cycle Finding](https://cses.fi/problemset/task/1197) (done in repo)
- [ ] [Course Schedule](https://cses.fi/problemset/task/1679)
- [ ] [Longest Flight Route](https://cses.fi/problemset/task/1680)
- [ ] [Game Routes](https://cses.fi/problemset/task/1681)
- [ ] [Investigation](https://cses.fi/problemset/task/1202)

---

## Phase 3: Heap, Greedy, Intervals (Week 8)

### 3.1 Heap / Priority Queue
- [ ] [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) M
- [ ] [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) M
- [ ] [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) E
- [ ] [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) M
- [ ] [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) H
- [ ] [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) H. two heaps
- [ ] [Task Scheduler](https://leetcode.com/problems/task-scheduler/) M
- [ ] [Reorganize String](https://leetcode.com/problems/reorganize-string/) M
- [ ] [Kth Smallest Element in a Sorted Matrix](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/) M
- [ ] [Design Twitter](https://leetcode.com/problems/design-twitter/) M
- [ ] [Sliding Window Median](https://leetcode.com/problems/sliding-window-median/) H

### 3.2 Greedy
Concepts:
- [ ] Exchange argument (prove greedy)
- [ ] Sort by end time / ratio / deadline

Problems:
- [ ] [Jump Game](https://leetcode.com/problems/jump-game/) M
- [ ] [Gas Station](https://leetcode.com/problems/gas-station/) M
- [ ] [Candy](https://leetcode.com/problems/candy/) H
- [ ] [Hand of Straights](https://leetcode.com/problems/hand-of-straights/) M
- [ ] [Partition Labels](https://leetcode.com/problems/partition-labels/) M
- [ ] [Valid Parenthesis String](https://leetcode.com/problems/valid-parenthesis-string/) M
- [ ] [Merge Triplets to Form Target Triplet](https://leetcode.com/problems/merge-triplets-to-form-target-triplet/) M
- [ ] [Minimum Number of Platforms (GFG)](https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1) M
- [ ] [Job Sequencing Problem (GFG)](https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1) M
- [ ] [Fractional Knapsack (GFG)](https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1) M

### 3.3 Intervals
- [ ] [Merge Intervals](https://leetcode.com/problems/merge-intervals/) M (done in repo, revise)
- [ ] [Insert Interval](https://leetcode.com/problems/insert-interval/) M
- [ ] [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/) M
- [ ] [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/) M
- [ ] [Minimum Interval to Include Each Query](https://leetcode.com/problems/minimum-interval-to-include-each-query/) H

### 3.4 Binary Search extras (answer-space)
- [ ] [Aggressive Cows (SPOJ)](https://www.spoj.com/problems/AGGRCOW/) M
- [ ] [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) H (done in repo, revise)
- [ ] [Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store/) M

---

## Phase 4: Trie, Range Queries, Math (Week 9)

### 4.1 Trie
- [ ] [Implement Trie](https://leetcode.com/problems/implement-trie-prefix-tree/) M
- [ ] [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/) M
- [ ] [Word Search II](https://leetcode.com/problems/word-search-ii/) H
- [ ] [Maximum XOR of Two Numbers in an Array](https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/) M

### 4.2 Prefix sums / Difference arrays / Range queries
Concepts:
- [x] Prefix sum, 2D prefix sum
- [x] Difference array (range update)
- [x] Fenwick Tree (BIT)
- [ ] Segment Tree (point update, range query)
- [ ] Sparse Table (static RMQ)

Problems:
- [ ] [Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/) E
- [ ] [Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/) M
- [ ] [Corporate Flight Bookings](https://leetcode.com/problems/corporate-flight-bookings/) M. difference array
- [ ] [Range Sum Query - Mutable](https://leetcode.com/problems/range-sum-query-mutable/) M. BIT / segment tree
- [ ] [Count of Smaller Numbers After Self](https://leetcode.com/problems/count-of-smaller-numbers-after-self/) H
- [x] CSES [Static Range Sum Queries](https://cses.fi/problemset/task/1646)
- [x] CSES [Static Range Minimum Queries](https://cses.fi/problemset/task/1647)
- [x] CSES [Dynamic Range Sum Queries](https://cses.fi/problemset/task/1648)

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
- [ ] [Count Primes](https://leetcode.com/problems/count-primes/) M
- [ ] [Pow(x, n)](https://leetcode.com/problems/powx-n/) M
- [ ] [Super Pow](https://leetcode.com/problems/super-pow/) M
- [ ] [Ugly Number II](https://leetcode.com/problems/ugly-number-ii/) M
- [ ] CSES [Exponentiation](https://cses.fi/problemset/task/1095)
- [ ] CSES [Counting Divisors](https://cses.fi/problemset/task/1713)
- [ ] CSES [Binomial Coefficients](https://cses.fi/problemset/task/1079)
- [ ] CSES [Creating Strings II](https://cses.fi/problemset/task/1715)

### 4.4 Two pointers / String algorithms
- [ ] [3Sum](https://leetcode.com/problems/3sum/) M (done in repo, revise)
- [ ] [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) M
- [ ] [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) H
- [ ] [Permutation in String](https://leetcode.com/problems/permutation-in-string/) M
- [ ] [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) E. KMP / Z-function
- [ ] [Shortest Palindrome](https://leetcode.com/problems/shortest-palindrome/) H. KMP

---

## Phase 5: Timed practice (Week 10 onward)

### 5.1 Contests
- [ ] LeetCode Weekly: attend 4 in a row, goal 2/4 solved
- [ ] LeetCode Weekly: goal 3/4 solved
- [ ] Codeforces Div. 3 or Div. 4: 3 live or virtual rounds, goal A–C (2 attempted: rounds 1119, 1122; finish D/C stubs)
- [ ] Codeforces Div. 3 or Div. 4: goal A–D
- [ ] Codeforces Div. 2: 3 rounds, goal A–B

### 5.2 Codeforces ladder by tag
Use [problemset](https://codeforces.com/problemset) with a tag filter. 45 min cap before reading editorial. Log the ID in `competitive_programming/codeforces/`.

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

- Problem sets curated from: Striver A2Z / DP series, NeetCode 150, Blind 75, [CSES Problem Set](https://cses.fi/problemset/), [Codeforces problemset](https://codeforces.com/problemset).
- Problem links and groupings written from standard curated lists. Spot-check any link that 404s.
