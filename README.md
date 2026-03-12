# UC‑13: Performance Comparison (Loops vs Streams)
## What it does
Compares how fast a traditional loop and a Stream pipeline can filter a large list of bogies.
## Main Steps
- Create a large dataset of bogies
- Filter using a for‑loop
- Filter using a Stream filter()
- Measure execution time using System.nanoTime()
- Print loop vs stream timings
- 
## Key Concepts

- High‑resolution timing with System.nanoTime()
- Loop‑based filtering
- Stream‑based filtering (filter().collect(...))
- Performance benchmarking
- Execution time comparison

## Goal
Show how loop processing and stream processing differ in execution time for the same filtering workload.
