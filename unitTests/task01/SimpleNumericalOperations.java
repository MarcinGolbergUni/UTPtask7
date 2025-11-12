package unitTests.task01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public
class SimpleNumericalOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isPositive(int value) {
        return value >= 0;
    }

    public boolean isNegative(int value) {
        return value < 0;
    }

    @Test
    void testAdd() {
        int a = 10;
        int b = 20;
        int result = add(a, b);
        assertEquals(result, 30);
    }

    @Test
    void testPosNeg(){
        assertAll(
                () -> assertEquals(true, isNegative(-1)),
                () -> assertEquals(false, isPositive(-13)),
                () -> assertEquals(true, isPositive(add(-12,13))),
                () -> assertEquals(false, isPositive(-13))
        );
    }
}