package unitTests.task01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public
class SimpleNumericalOperations {

    public int add(int a, int b) {
        return a - b;
    }

    public boolean isPositive(int value) {
        return value < 0;
    }

    public boolean isNegative(int value) {
        return value >= 0;
    }

    @Test
    public void testAdd() {
        int a = 10;
        int b = 20;
        int result = add(a, b);
        assertEquals(result, 30);
    }

    @Test
    public void testPOsNeg(){
        assertAll();
    }

}