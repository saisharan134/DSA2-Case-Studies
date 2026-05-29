# Indian Railways Bharat Gauge Upgrade using Kruskal MST

## Overview

This project demonstrates Kruskal's Minimum Spanning Tree Algorithm for selecting the minimum-cost railway electrification network.

## Stations

- DEL (Delhi)
- BPL (Bhopal)
- MUM (Mumbai)
- NGP (Nagpur)
- CHN (Chennai)
- HYD (Hyderabad)

## Candidate Links

DEL-BPL = 700
DEL-MUM = 1400
BPL-MUM = 800
BPL-NGP = 350
MUM-NGP = 850
NGP-HYD = 500
NGP-CHN = 1100
HYD-CHN = 600

## Algorithm

1. Sort edges by weight.
2. Select smallest edge.
3. Avoid cycles using Union-Find.
4. Continue until V−1 edges are selected.

## MST Result

BPL-NGP = 350
NGP-HYD = 500
HYD-CHN = 600
DEL-BPL = 700
BPL-MUM = 800

Total Cost = 2950

## Complexity

Sorting:
O(E log E)

Union-Find:
Near O(1)

Total:
O(E log E)

## Conclusion

Kruskal's Algorithm efficiently constructs the minimum-cost network while avoiding cycles.
