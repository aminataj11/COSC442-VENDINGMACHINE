#VendingMachine

| Method / Behavior | Valid Case(s) | Exception / Invalid Case(s) | Boundary Case(s) | Oracle / Expected Result | Related JUnit Test(s) |
| `insertMoney` | putting in a normal amount of money [ex. $5] | putting in negative money or 0 | exact price of an item | balance goes up correctly or throws error | `testInsertMoneyValid`, `testInsertMoneyInvalid` |
| `makePurchase` | picking a slot with stuff in it and enough cash | picking an empty slot or not having enough money | exact balance matching item price | gives you the item and generates new balance | `testMakePurchaseValid`, `testMakePurchaseInsufficientFunds` |
| `addItem` | putting an item into an empty slot | trying to add to a spot that's already full | slot letters A through D | item gets added to slot | `testAddItemParameterized` |