# Apache Cassandra LSM-Tree Compaction Analysis

## Overview

This project demonstrates how LSM-Trees perform compaction and how write amplification occurs in Cassandra-like databases.

## Given Scenario

- MemTable Size = 1 GB
- Level-0 SSTables = 8
- Each SSTable = 1 GB
- Level-1 Capacity = 10 GB

## LSM Write Path

Client Write
→ MemTable
→ SSTable Flush
→ Compaction

## Write Amplification

Logical Writes = 8 GB

Physical Writes:
- Initial Flush = 8 GB
- Compaction = 8 GB

Total Physical Writes = 16 GB

Write Amplification:

16 / 8 = 2×

## Comparison

### LSM Tree

- Append-only writes
- Sequential I/O
- High throughput
- Requires compaction

### B+ Tree

- In-place updates
- Random I/O
- Lower write throughput
- No compaction

## Result

Write Amplification = 2×

## Conclusion

LSM-Trees are preferred for write-heavy workloads despite write amplification because sequential writes significantly outperform random writes.
