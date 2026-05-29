# Stock Trading using Dynamic Programming

## Problem

Given stock prices:

[100, 80, 95, 85, 110, 90, 130, 105, 145, 115]

Find maximum profit with:

- At most 2 transactions
- Unlimited transactions

## Algorithm

Dynamic Programming

State:

dp[t][d]

Maximum profit using at most t transactions
up to day d.

## Results

k = 2

Profit = 85

Transactions:

Buy @ 80 → Sell @ 110

Buy @ 90 → Sell @ 145

k = ∞

Profit = 120

## Complexity

Time: O(k × n)

Space: O(k × n)

## Applications

- Algorithmic Trading
- Portfolio Optimization
- Financial Analytics
