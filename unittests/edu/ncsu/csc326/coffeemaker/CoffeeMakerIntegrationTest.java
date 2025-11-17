package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CoffeeMakerIntegrationTest {

    @Test
    public void testMakeCoffee_successfulIntegration() throws Exception {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        // Create a sample recipe
        Recipe recipe = new Recipe();
        recipe.setName("Coffee");
        recipe.setAmtCoffee("3");
        recipe.setAmtMilk("1");
        recipe.setAmtSugar("1");
        recipe.setAmtChocolate("0");
        recipe.setPrice("50");

        // Add recipe to the CoffeeMaker
        coffeeMaker.addRecipe(recipe);

        // Try to make coffee with enough money
        int change = coffeeMaker.makeCoffee(0, 75);  // Index 0 = first recipe

        // Check result
        assertEquals(25, change);  // Paid 75, price 50
    }
}


