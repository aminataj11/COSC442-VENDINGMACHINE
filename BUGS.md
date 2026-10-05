# Bugs

## Bug 1: Array Out Of Bounds on Startup
- Description: Every time you try to run a test or create a new `VendingMachine()`, it crashes immediately with an `ArrayIndexOutOfBoundsException` at line 64.
- Cause: The loop or array size in the constructor has an off-by-one error. It's trying to look at index 4, but since arrays start at 0, a length of 4 only goes up to index 3.
- How to replicate: Run any test that sets up the vending machine.
- How to fix it: Go into `VendingMachine.java` around line 64 and fix the loop boundary so it doesn't go past the end of the array.