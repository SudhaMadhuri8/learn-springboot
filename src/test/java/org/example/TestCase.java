package org.example;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestCase {

    Calc calc = new Calc();

    @Test
    public void AddTwoNumbers()
    {
        long expectedSum = 10;
        long actualSum = calc.add(4,6);
        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void AddTwoNumbersFail()
    {
        long expectedSum = 11;
        long actualSum = calc.add(4,6);
        Assertions.assertNotEquals(expectedSum, actualSum);

    }


}