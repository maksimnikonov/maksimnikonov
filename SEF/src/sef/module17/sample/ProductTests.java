package sef.module17.sample;
// Complete Code

import junit.framework.TestCase;

public class ProductTests extends TestCase {

    private Product product;

    protected void setUp() throws Exception {
        product = new Product();
    }

    public void testSetAndGetDescription() {
        String testDescription = "aDescription";
        assertNull(product.getDescription());
        product.setDescription(testDescription);
        assertEquals(testDescription, product.getDescription());
    }

    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        assertEquals(0, 0, 0);
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(), 0);
    }

    public void testSetAndGetPriceNegative() {
        double testPriceNegative = -50;
        product.setPrice(testPriceNegative);
        assertEquals(0.0, product.getPrice());
    }

    public void testSetAndGetId() {
        int testId = 10;
        product.setId(testId);
        assertEquals(testId, product.getId());
    }

    public void testSetAndGetName(){
        String testName = "abcd";
        assertNull(product.getName());
        product.setName(testName);
        assertEquals(testName, product.getName());
    }
    public void testSetAndGetNameEmpty(){
        String testNameEmpty = " ";
        product.setName(testNameEmpty);
        assertEquals("Unknown", product.getName());
    }

    public void testProductInformation() {
        product.setPrice(10.5);
        product.setName("abcd");
        product.setDescription("qwerty");
        product.setId(12);

        assertEquals("The product with id: 12 and name: abcd has price: 10.5 and description: qwerty",
                product.getProductInformation());
    }

    public  void testStringToString() {
        product.setPrice(10.5);
        product.setName("abcd");
        product.setDescription("qwerty");
        product.setId(12);

        assertEquals("Description: qwerty Price: 10.5 Name: abcd ID: 12",
                product.toString());
    }

    public void testUppercaseName(){
        String testName = "qwerty";
        product.setName(testName);
        assertEquals(testName.toUpperCase(), product.getName());
    }
}
