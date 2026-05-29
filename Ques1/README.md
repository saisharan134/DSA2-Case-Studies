# Stack Overflow Reputation Index using AVL Tree Range Query

## Overview

This project demonstrates efficient range queries using an AVL Tree.

The goal is to retrieve all users whose reputation lies within a specified interval.

## Problem Statement

Find all users with reputation scores between:

10000 and 50000

using an AVL Tree.

## Algorithm

1. Descend toward lower bound.
2. Traverse only relevant branches.
3. Output values within range.
4. Stop traversal outside bounds.

## Time Complexity

Range Query:

O(log n + k)

where:

- n = total users
- k = matching users

## Comparison

AVL Tree:

- O(log n) insert/delete
- Good for dynamic updates

Sorted Array:

- Better cache locality
- Faster scans
- Expensive updates

## Result

Output:

12000
15000
25000
30000
50000

## Conclusion

AVL Trees are ideal for real-time ranking systems, while sorted arrays are preferable for static leaderboard snapshots.
