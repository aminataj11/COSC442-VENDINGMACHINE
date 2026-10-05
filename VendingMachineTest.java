import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VendingMachineTest {

    private VendingMachine vm;

    @BeforeEach
    public void setUp() {
        
        vm = new VendingMachine();
    }

    @Test
    public void testInsertMoneyValid() {
        // arrange
        double amount = 2.00;

        // act
        vm.insertMoney(amount);

       
        assertEquals(2.00, vm.getBalance(), 0.001);
    }

    @Test
    public void testInsertMoneyInvalid() {
      
        assertThrows(IllegalArgumentException.class, () -> {
            vm.insertMoney(-5.00);
        });
    }

    @ParameterizedTest
    @CsvSource({
        "A, 'Chips', 1.25",
        "B, 'Soda', 1.50",
        "C, 'Candy', 0.75",
        "D, 'Water', 1.00",
        "A, 'Cookies', 2.00",
        "B, 'Gum', 0.50"
    })
    public void testAddItemParameterized(String slot, String itemName, double price) {
        // Arrange
        VendingMachineItem item = new VendingMachineItem(itemName, price);

        // Act
        vm.addItem(slot, item);

        // Assert
        assertNotNull(vm.getItem(slot));
        assertEquals(itemName, vm.getItem(slot).getName());
    }
}