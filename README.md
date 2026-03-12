# UC‑14: Handle Invalid Bogie Capacity (Custom Exception)
## What it does
Prevents creating a passenger bogie with invalid capacity using a custom checked exception.
## Main Steps
- Define InvalidCapacityException
- Validate capacity inside PassengerBogie constructor
- Throw exception if capacity <= 0
- Catch and print error
## Key Ideas
- Custom checked exception for validation
- Fail‑fast check in constructor
- Clean error handling with try–catch
## Goal
Ensure only valid bogies are created; block invalid capacity values early with a clear error.
