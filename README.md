# UC‑20: Exception Handling During Search
## What it does
Stops the search operation when the train has no bogies, using a fail‑fast runtime exception.
## Main Steps
- Create an empty bogie array
- Define searchId
- Check if data exists
- Throw IllegalStateException if the list is empty
- Prevent invalid search from continuing
- Print completion message (when applicable)

## Key Concepts
- Fail‑fast validation
- Runtime exceptions
- Defensive programming
- Early system‑state checking
- Preventing unsafe operations

## Goal
Ensure that search operations only run when valid data exists, preventing invalid processing and enforcing safe program behavior.
