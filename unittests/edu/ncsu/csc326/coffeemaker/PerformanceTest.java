package edu.ncsu.csc326.coffeemaker;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;

public class PerformanceTest {

    @Test
    public void performanceTest_addCoffee() throws InventoryException {
        Inventory inventory = new Inventory();
        for (int i = 0; i < 1000; i++) {
            inventory.addCoffee("3");
        }
    }
}
