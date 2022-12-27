package UnitTests;
//2. Фреймворк для тестов

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitFrameworkForTests {
    public static void main(String[] args) {
    DiscountCalculatorTest test = new DiscountCalculatorTest();
    test.shouldGiveNoDiscountForValue999();
    }
}

class DiscountCalculator {
    public int sumAfterDiscount(int sum) {
        if (sum < 1000) return sum;
        else return (int) (sum * 0.98);
    }
}
class DiscountCalculatorTest {
    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    void shouldGiveNoDiscountForValue999 () {
        // Подготовка
        int bySum = 999;
        int expectedSum = 999;

        //Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(bySum);

        //Проверка

        //TestLibrary.assertEquals(resultSum,expectedSum);
        Assertions.assertEquals(expectedSum,resultSum);
    }
}

class TestLibrary {

    public static <T> void assertEquals (T expected, T actual) {
        if (!expected.equals(actual)) {
            throw new RuntimeException(String.format("actual value [%s] no equal to expected [%s]",actual,expected));
        }
    }
}