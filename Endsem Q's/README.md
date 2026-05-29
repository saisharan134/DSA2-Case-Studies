# IPL Ad Impression Archive Sorting

## Overview

This project demonstrates External Sorting and K-Way Merge for sorting large IPL ad-impression logs.

## Problem

Input size:
50 GB

Available RAM:
8 GB

The dataset cannot fit into memory.

## Solution

1. Divide data into chunks.
2. Sort each chunk independently.
3. Store sorted chunks on disk.
4. Merge chunks using K-Way Merge and Min Heap.

## Algorithm

External Merge Sort

K-Way Merge

## Complexity

Chunk Sorting:
O(N log M)

Merge:
O(N log K)

Space:
O(K)

## Output

8 10 11 12 15 19 22 25
28 30 33 38 41 47 49 51
55 60 75 80 85 88 89 92

## Applications

- Database Systems
- Hadoop
- Search Engines
- Log Processing Systems
