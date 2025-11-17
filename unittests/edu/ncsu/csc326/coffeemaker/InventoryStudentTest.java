package edu.ncsu.csc326.coffeemaker;
import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;


import static org.junit.Assert.*;
import org.junit.Test;

public class InventoryStudentTest {

    @Test
    public void testAddCoffee_validInput_shouldPass() throws Exception {
        Inventory inventory = new Inventory(); // Starts at 15
        inventory.addCoffee("5");
        assertEquals(20, inventory.getCoffee()); // 15 + 5
    }
    
    @Test
    public void testAddCoffee_invalidInput_shouldThrowException() {
        Inventory inventory = new Inventory();
        try {
            inventory.addCoffee("-3");
            fail("Expected InventoryException to be thrown");
        } catch (InventoryException e) {
            String expectedMessage = "Units of coffee must be a positive integer";
            String actualMessage = e.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
        }
    }
}
