# Uber Driver Dispatch using Bellman-Ford Algorithm

## Overview

This project demonstrates shortest-path computation in a road network containing negative edge weights.

Negative edges represent surge incentives offered to drivers.

## Source

IND (Indiranagar)

## Destination

EC (Electronic City)

## Negative Edges

KOR → BTM = -5

HSR → JPN = -3

## Algorithm

Bellman-Ford

## Advantages

- Handles negative weights
- Detects negative cycles
- Supports path reconstruction

## Result

Shortest Path:

IND → KOR → BTM → EC

Cost:

11

## Complexity

Time:

O(V × E)

Space:

O(V)

## Conclusion

Bellman-Ford successfully finds optimal routes even when negative incentives are present.
