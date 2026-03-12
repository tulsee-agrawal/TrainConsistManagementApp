# UC‑12: Safety Compliance Check for Goods Bogies
## What it does
Validates if the train’s goods bogie formation is safety compliant using Streams and allMatch().
## Main Steps
- Create list of goods bogies (type, cargo)
- Convert to stream()
- Validate with allMatch(predicate)
- Store result in boolean isCompliant
- Print SAFE / NOT SAFE status

## Key Concepts
- Streams API
- allMatch() terminal operation
- Lambda predicate for rule
- Short‑circuit evaluation
- Business rule modeling in code
- 
## Goal
Provide a clear, fast validation of train safety using a simple stream predicate.
